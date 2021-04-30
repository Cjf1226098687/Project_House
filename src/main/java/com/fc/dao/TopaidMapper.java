package com.fc.dao;

import com.fc.bean.Topaid;
import com.fc.bean.TopaidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopaidMapper {
    long countByExample(TopaidExample example);

    int deleteByExample(TopaidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Topaid record);

    int insertSelective(Topaid record);

    List<Topaid> selectByExample(TopaidExample example);

    Topaid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Topaid record, @Param("example") TopaidExample example);

    int updateByExample(@Param("record") Topaid record, @Param("example") TopaidExample example);

    int updateByPrimaryKeySelective(Topaid record);

    int updateByPrimaryKey(Topaid record);
}