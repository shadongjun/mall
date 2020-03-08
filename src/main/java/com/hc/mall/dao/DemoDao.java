package com.hc.mall.dao;

import com.hc.mall.entity.HcCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoDao {

    @Select(" select cust_id,cust_name from hc_customer ")
    public List<HcCustomer> getcustlist();
}
