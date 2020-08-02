package org.com.parent.service;

import org.com.parent.mapper.hibernate.UserMapper;
import org.com.parent.po.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User selectByPrimaryKey(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
    public int insert(User record){
        int a = userMapper.insert(record);
        return a;
    }
    public int selectMaxId(){
        return userMapper.selectMaxId();
    }
}
