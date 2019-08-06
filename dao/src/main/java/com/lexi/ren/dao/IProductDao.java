package com.lexi.ren.dao;

import com.lexi.ren.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

public interface IProductDao {
    @Select("select * from product limit #{start},#{size}")
    List<Product> findAll(@Param("start") Integer start,@Param("size") Integer size);

    @Insert("INSERT INTO product (productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) VALUES (#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    @SelectKey(keyColumn = "id",keyProperty = "id",resultType = Integer.class,before = false,statement = {"select last_insert_id()"})
    int save(Product product);
}
