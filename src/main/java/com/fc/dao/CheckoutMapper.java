package com.fc.dao;

import com.fc.bean.Checkout;
import com.fc.bean.CheckoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckoutMapper {
    long countByExample(CheckoutExample example);

    int deleteByExample(CheckoutExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Checkout record);

    int insertSelective(Checkout record);

    List<Checkout> selectByExample(CheckoutExample example);

    Checkout selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByExample(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByPrimaryKeySelective(Checkout record);

    int updateByPrimaryKey(Checkout record);
}