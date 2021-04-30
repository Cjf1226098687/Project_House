package com.fc.dao;

import com.fc.bean.Applyout;
import com.fc.bean.ApplyoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyoutMapper {
    long countByExample(ApplyoutExample example);

    int deleteByExample(ApplyoutExample example);

    int deleteByPrimaryKey(Integer aoid);

    int insert(Applyout record);

    int insertSelective(Applyout record);

    List<Applyout> selectByExample(ApplyoutExample example);

    Applyout selectByPrimaryKey(Integer aoid);

    int updateByExampleSelective(@Param("record") Applyout record, @Param("example") ApplyoutExample example);

    int updateByExample(@Param("record") Applyout record, @Param("example") ApplyoutExample example);

    int updateByPrimaryKeySelective(Applyout record);

    int updateByPrimaryKey(Applyout record);
}