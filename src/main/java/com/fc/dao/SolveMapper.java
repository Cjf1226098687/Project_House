package com.fc.dao;

import com.fc.bean.Solve;
import com.fc.bean.SolveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolveMapper {
    long countByExample(SolveExample example);

    int deleteByExample(SolveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Solve record);

    int insertSelective(Solve record);

    List<Solve> selectByExampleWithBLOBs(SolveExample example);

    List<Solve> selectByExample(SolveExample example);

    Solve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByExampleWithBLOBs(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByExample(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByPrimaryKeySelective(Solve record);

    int updateByPrimaryKeyWithBLOBs(Solve record);

    int updateByPrimaryKey(Solve record);
}