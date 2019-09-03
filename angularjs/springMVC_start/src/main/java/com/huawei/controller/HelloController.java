package com.huawei.controller;


import com.huawei.model.User;
import com.huawei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//控制器
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")   //请求映射的注解
    public String sayHello(){

        UserService userService = new UserService();

        List<User> allUsers = userService.findAll();

        System.out.println(allUsers);

        return "success";
    }

}

