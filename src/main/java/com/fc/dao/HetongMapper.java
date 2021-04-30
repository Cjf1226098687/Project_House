package com.fc.dao;

import com.fc.bean.Hetong;
import com.fc.bean.HetongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HetongMapper {
    long countByExample(HetongExample example);

    int deleteByExample(HetongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hetong record);

    int insertSelective(Hetong record);

    List<Hetong> selectByExample(HetongExample example);

    Hetong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hetong record, @Param("example") HetongExample example);

    int updateByExample(@Param("record") Hetong record, @Param("example") HetongExample example);

    int updateByPrimaryKeySelective(Hetong record);

    int updateByPrimaryKey(Hetong record);
}