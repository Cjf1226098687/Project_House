package com.fc.dao;

import com.fc.bean.Apply;
import com.fc.bean.ApplyExample;
import com.fc.bean.ApplyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    long countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(ApplyKey key);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(ApplyKey key);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}