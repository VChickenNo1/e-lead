package com.chang.dao;

import com.chang.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户持久层
 */
public interface IUserDao {

    //查询所有
    @Select("select * from user")
    List<User> findAll();

    //根据id查询
    @Select("select * from user where id = #{id}")
    User findById(int id);

    //更新
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updataUser(User user);

}
