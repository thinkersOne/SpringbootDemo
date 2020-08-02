package org.com.parent.mapper.hibernate;

import org.apache.ibatis.annotations.Param;
import org.com.parent.po.SCExample;
import org.com.parent.po.SCKey;

import java.util.List;

public interface SCMapper {
    int countByExample(SCExample example);

    int deleteByExample(SCExample example);

    int deleteByPrimaryKey(SCKey key);

    int insert(SCKey record);

    int insertSelective(SCKey record);

    List<SCKey> selectByExample(SCExample example);

    int updateByExampleSelective(@Param("record") SCKey record, @Param("example") SCExample example);

    int updateByExample(@Param("record") SCKey record, @Param("example") SCExample example);
}