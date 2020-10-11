package org.com.parent.service;

import org.com.parent.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public Account selectByPrimaryKey(Integer id){
//        Account account = accountMapper.selectByPrimaryKey(id);
        return new Account();
    }
}
