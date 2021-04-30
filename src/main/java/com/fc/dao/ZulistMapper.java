package com.fc.dao;

import com.fc.bean.Zulist;
import com.fc.bean.ZulistExample;
import com.fc.bean.ZulistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZulistMapper {
    long countByExample(ZulistExample example);

    int deleteByExample(ZulistExample example);

    int deleteByPrimaryKey(ZulistKey key);

    int insert(Zulist record);

    int insertSelective(Zulist record);

    List<Zulist> selectByExample(ZulistExample example);

    Zulist selectByPrimaryKey(ZulistKey key);

    int updateByExampleSelective(@Param("record") Zulist record, @Param("example") ZulistExample example);

    int updateByExample(@Param("record") Zulist record, @Param("example") ZulistExample example);

    int updateByPrimaryKeySelective(Zulist record);

    int updateByPrimaryKey(Zulist record);
}