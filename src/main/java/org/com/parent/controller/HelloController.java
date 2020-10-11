package org.com.parent.controller;
import org.apache.ibatis.annotations.Param;
import org.com.parent.po.Account;
import org.com.parent.po.Book;
import org.com.parent.po.TUser;
import org.com.parent.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import javax.servlet.ServletConfig;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
@RestController
@EnableTransactionManagement
public class HelloController
{
    @Autowired
    private ServletConfig servletConfig;
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private AccountService accountService;
//    @Autowired
//    private BookService bookService;
//    @Autowired
//    private @Qualifier("hibernateDataSource")DataSource dataSource;
//    @Autowired
//    private @Qualifier("springDataSource") DataSource dataSource2;
    @Autowired
    JedisCluster jedisCluster;

    @RequestMapping("hello")
    public Map<String,Object> getString(){
        System.out.println("上下文路径为"+servletConfig.getServletContext());
        System.out.println("我是第一个Springboot程序！");
        Map<String,Object> map = new HashMap<>();
        map.put("book","谁的青春不迷茫");
        jedisCluster.set("address","上海");
        String address = jedisCluster.get("address");
        System.out.println(address);
        return map;
    }
    @RequestMapping("dataSource")
    public Object getDataSource() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
//        ResultSet resultSet = preparedStatement.executeQuery();
        Map<String,List<?>> map = new HashMap<>();
        List<User> users = new ArrayList<>();
//        while (resultSet.next()){
//            User user = new User();
//            user.setId(resultSet.getInt("id"));
//            user.setVersion(resultSet.getInt("version"));
//            user.setUsername(resultSet.getString("username"));
//            user.setAge(resultSet.getInt("age"));
//            users.add(user);
//        }
//        System.out.println("---------------");
//        Connection connection2 = dataSource2.getConnection();
//        PreparedStatement preparedStatement2 = connection2.prepareStatement("select * from t_user");
//        ResultSet resultSet2 = preparedStatement2.executeQuery();
//        List<TUser> tUsers = new ArrayList<>();
//        while (resultSet2.next()){
//            TUser tUser = new TUser();
//            tUser.setUserid(resultSet2.getInt("userid"));
//            tUser.setUsername(resultSet2.getString("username"));
//            tUser.setPassword(resultSet2.getString("password"));
//            tUsers.add(tUser);
//        }
        map.put("users",users);
//        map.put("tUsers",tUsers);
        return map;
    }
    //测试hibernate数据库下面的表
    @RequestMapping("getData")
    public User getUser(){
//        User user = userService.selectByPrimaryKey(1);
        User user1 = new User();
        user1.setAge(20);
        user1.setUsername("zhihao");
        user1.setVersion(2);
//        int id=userService.selectMaxId();
//        user1.setId(++id);
        System.out.println(user1);
//        userService.insert(user1);
        return new User();
    }
    //测试spring数据库下面的表
    @RequestMapping("getData2")
    public Account getAccount(){
//        Account account = accountService.selectByPrimaryKey(1);
        return new Account();
    }
    //测试分页插件
    @RequestMapping(value = "getPage")
    public Map<String,Object> getPage(Map map){
        map.put("page",1);
        map.put("pageSize",5);
//        Map<String,Object> map1 = bookService.getPage((int)map.get("page"),(int)map.get("pageSize"));
        return map;
//        return map1;
    }

    @RequestMapping("getUserById")
    public User getUserById(){
        System.out.println("11111");
        User user = new User();
        user.setAge(1);
        return user;
//        return userService.getUser(Integer.valueOf(id));
    }

}
