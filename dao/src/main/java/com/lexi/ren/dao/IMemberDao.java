package com.lexi.ren.dao;

import com.lexi.ren.model.Member;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IMemberDao {
    @Select("select * from member where id=#{id} limit 1")
    public List<Member> findOneById(int id);
}
