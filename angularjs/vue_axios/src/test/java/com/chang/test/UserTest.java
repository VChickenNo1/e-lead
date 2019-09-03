package com.chang.test;

import com.chang.model.User;
import com.chang.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 用户的业务层测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List<User> all = userService.findAll();
        System.out.println(all);
    }

    @Test
    public void testFindById(){
        User byId = userService.findById(1);
        System.out.println(byId);
    }

    @Test
    public void testUpdate(){
        User user = userService.findById(1);
        System.out.println(user);
        user.setUsername("张三");
        userService.updateUser(user);
        User user1 = userService.findById(1);
        System.out.println(user1);
    }
}
