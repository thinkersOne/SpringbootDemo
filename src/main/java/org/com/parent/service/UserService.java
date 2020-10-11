//package org.com.parent.service;
//
//import com.alibaba.fastjson.JSON;
//import org.apache.commons.lang3.StringUtils;
//import org.com.parent.mapper.hibernate.UserMapper;
//import org.com.parent.po.User;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import redis.clients.jedis.JedisCluster;
//
//@Service
//@Transactional
//public class UserService {
//    @Autowired
//    private UserMapper userMapper;
//    @Autowired
//    JedisCluster jedisCluster;
//
//
//    public User selectByPrimaryKey(Integer id){
//        User user = userMapper.selectByPrimaryKey(id);
//        return user;
//    }
//    public int insert(User record){
//        int a = userMapper.insert(record);
//        return a;
//    }
//    public int selectMaxId(){
//        return userMapper.selectMaxId();
//    }
//
//
//    public User getUser(Integer id){
//        String userStr = jedisCluster.get("name"+id);
//        if(StringUtils.isNotBlank(userStr)){
//            return JSON.parseObject(userStr,User.class);
//        }
//        User user = userMapper.selectByPrimaryKey(id);
//        if(user != null){
//            jedisCluster.set("name"+id,JSON.toJSONString(user));
//        }
//        return user;
//    }
//
//}
