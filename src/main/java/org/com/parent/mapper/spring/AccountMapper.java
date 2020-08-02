package org.com.parent.mapper.spring;

import org.apache.ibatis.annotations.Param;
import org.com.parent.po.Account;
import org.com.parent.po.AccountExample;

import java.util.List;

public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExampleWithBLOBs(AccountExample example);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExampleWithBLOBs(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKeyWithBLOBs(Account record);

    int updateByPrimaryKey(Account record);
}