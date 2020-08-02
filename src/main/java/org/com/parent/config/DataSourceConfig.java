package org.com.parent.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Setter@Getter@ToString
@MapperScan(basePackages = "org.com.parent.mapper.hibernate",sqlSessionTemplateRef = "hiSqlSessionTemplate")
public class DataSourceConfig {
    //注：该属性名与文件中的属性名必须保持一致，否则查到的值就为null了
    private String driverClassName;
    private String username;
    private String password;
    private String url;
    //@Primary注解一般用在接口同名时指定某个接口，则程序扫描时会优先加载并实例化该对象
    //@Bean用在方法上，表示通过一个方法创建一个对象实例，并将这个实例交给spring容器管理，另一个方法可通过@Qualifier("beanName")注解获得该实例
    @Primary
    @Bean(name="hibernateDataSource")
    @ConfigurationProperties("db")
    public DataSource getDruidDateSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        //配置初始化大小、最小、最大
        druidDataSource.setInitialSize(1);
        druidDataSource.setMinIdle(1);
        druidDataSource.setMaxActive(20);
        //连接泄漏监测
        druidDataSource.setRemoveAbandoned(true);
        druidDataSource.setRemoveAbandonedTimeout(30);
        //配置获取连接等待超时的时间
        druidDataSource.setMaxWait(20000);
        //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        druidDataSource.setTimeBetweenEvictionRunsMillis(20000);
        //防止过期
        druidDataSource.setValidationQuery("SELECT 'x'");
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(true);
        return druidDataSource;
    }
    //创建sqlsessionFactory，目的是可以将mapper.xml等映射文件以及mybatis配置文件cfg.xml进行设置(指定路径)
    //@Qualifier：当多个bean实例存在类型相同时，通过指定beanName的方式缩小查找范围。
    @Bean(name = "hiSqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("hibernateDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/hibernate/*.xml"));
//        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml"));
        return bean.getObject();
    }
    /**
     *  SqlSessionTemplate 是 MyBatis-Spring 的核心。 这个类负责管理 MyBatis 的 SqlSession, 调用 MyBatis 的 SQL 方法, 翻译异常。 SqlSessionTemplate 是线程安全的, 可以被多个 DAO 所共享使用。
     * 当调用 SQL 方法时, 包含从映射器 getMapper()方法返回的方法, SqlSessionTemplate 将会保证使用的 SqlSession 是和当前 Spring 的事务相关的。此外,它管理 session 的生命 周期,包含必要的关闭,提交或回滚操作。
     * SqlSessionTemplate 实现了 SqlSession 接口,这就是说,在代码中无需对 MyBatis 的 SqlSession 进行替换。 SqlSessionTemplate 通常是被用来替代默认的 MyBatis 实现的 DefaultSqlSession , 因为模板可以参与到 Spring 的事务中并且被多个注入的映射器类所使 用时也是线程安全的。相同应用程序中两个类之间的转换可能会引起数据一致性的问题。
     * SqlSessionTemplate 对象可以使用 SqlSessionFactory 作为构造方法的参数来创建。
     */
    @Bean(name = "hiSqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("hiSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
