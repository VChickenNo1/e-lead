package com.chang.test;

import com.chang.model.User;

public class HashCodeTest {
    public static void main(String[] args) {
        User user1=new User("zhangsan",15);
        User user2=new User("lisi",14);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}
