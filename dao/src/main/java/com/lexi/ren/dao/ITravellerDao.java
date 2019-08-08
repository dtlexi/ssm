package com.lexi.ren.dao;

import com.lexi.ren.model.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITravellerDao {
    @Select("SELECT * FROM traveller WHERE id IN (SELECT travellerId FROM order_traveller WHERE orderId=#{orderId})")
    List<Traveller> findByOrderId(int orderId);
}
