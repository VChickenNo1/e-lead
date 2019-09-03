package com.chang.service;


import com.chang.model.User;

import java.util.List;

/**
 * 业务层
 */
public interface IUserService {
    //查询所有
    List<User> findAll();

    //根据id查询
    User findById(int id);

    //更新
    void updateUser(User user);

}
