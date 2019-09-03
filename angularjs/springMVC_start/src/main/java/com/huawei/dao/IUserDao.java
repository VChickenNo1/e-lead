package com.huawei.dao;

import com.huawei.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


//用户持久层
@Component
public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
