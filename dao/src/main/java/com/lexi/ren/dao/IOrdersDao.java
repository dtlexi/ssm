package com.lexi.ren.dao;

import com.lexi.ren.model.Orders;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrdersDao {
    @Select("select * from orders")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "productId",property = "product",one = @One(select = "com.lexi.ren.dao.IProductDao.findOneById")),
            @Result(column = "memberId",property = "member",one = @One(select = "com.lexi.ren.dao.IMemberDao.findOneById"))
    })
    List<Orders> findAll();

    @Select("select * from orders where id=#{orderId} limit 1")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "productId",property = "product",one = @One(select = "com.lexi.ren.dao.IProductDao.findOneById")),
            @Result(column = "memberId",property = "member",one = @One(select = "com.lexi.ren.dao.IMemberDao.findOneById")),
            @Result(column = "id",property = "travellers",many = @Many(select = "com.lexi.ren.dao.ITravellerDao.findByOrderId"))
    })
    Orders findOneById(int orderId);
}
