package com.fc.dao;

import com.fc.bean.Paid;
import com.fc.bean.PaidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaidMapper {
    long countByExample(PaidExample example);

    int deleteByExample(PaidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Paid record);

    int insertSelective(Paid record);

    List<Paid> selectByExample(PaidExample example);

    Paid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Paid record, @Param("example") PaidExample example);

    int updateByExample(@Param("record") Paid record, @Param("example") PaidExample example);

    int updateByPrimaryKeySelective(Paid record);

    int updateByPrimaryKey(Paid record);
}