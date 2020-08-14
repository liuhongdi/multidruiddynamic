package com.multidruiddynamic.demo.mapper.orderdb;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.multidruiddynamic.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@DS("orderdb")
public interface OrderMapper {
    Order selectOneOrder(Long orderId);
}
