package com.chang.service.impl;

import com.chang.dao.IUserDao;
import com.chang.model.User;
import com.chang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao dao;

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updataUser(user);
    }
}
