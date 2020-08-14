package com.multidruiddynamic.demo.mapper.goodsdb;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.multidruiddynamic.demo.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@DS("goodsdb")
public interface GoodsMapper {
    Goods selectOneGoods(Long goodsId);
}
