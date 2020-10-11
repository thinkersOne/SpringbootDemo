package org.com.parent;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.collect.Lists;
import org.com.parent.convert.CrmApiHttpMessageConverter;
import org.com.parent.intercepter.MyInterCepterHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *WebMvcConfigurationSupport用来管理多个拦截器，可将自定义的拦截器注册到容器中
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class App
//        extends WebMvcConfigurationSupport
{
    public static void main( String[] args )
    {
        SpringApplication application = new SpringApplication(App.class);
        //设置是否读取banner.txt文件内容  方式2：
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
//        SpringApplication.run(App.class,args);
    }

//    @Override
//    //将自定义的拦截器注册到SpringBoot中，由容器自动管理
//    //addPathPatterns 用于添加拦截规则  excludePathPatterns 用户排除拦截
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new MyInterCepterHandler())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login.*")
//                .excludePathPatterns("/Login/login.*");
//        super.addInterceptors(registry);
//    }
    //解决中文乱码问题
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(
                Charset.forName("UTF-8"));
        return converter;
    }
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(responseBodyConverter());
//        //1、需要先定义一个·convert转换消息的对象；
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //2、添加fastjson的配置信息，比如 是否要格式化返回json数据
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        //3处理中文乱码问题
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConverter.setSupportedMediaTypes(fastMediaTypes);
//        //4、在convert中添加配置信息.
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        //5、将convert添加到converters当中.
//        converters.add(fastConverter);
//    }
//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer.favorPathExtension(false);
//    }
}
