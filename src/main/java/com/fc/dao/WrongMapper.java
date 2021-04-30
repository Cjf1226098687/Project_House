package com.fc.dao;

import com.fc.bean.Wrong;
import com.fc.bean.WrongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrongMapper {
    long countByExample(WrongExample example);

    int deleteByExample(WrongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wrong record);

    int insertSelective(Wrong record);

    List<Wrong> selectByExampleWithBLOBs(WrongExample example);

    List<Wrong> selectByExample(WrongExample example);

    Wrong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wrong record, @Param("example") WrongExample example);

    int updateByExampleWithBLOBs(@Param("record") Wrong record, @Param("example") WrongExample example);

    int updateByExample(@Param("record") Wrong record, @Param("example") WrongExample example);

    int updateByPrimaryKeySelective(Wrong record);

    int updateByPrimaryKeyWithBLOBs(Wrong record);

    int updateByPrimaryKey(Wrong record);
}