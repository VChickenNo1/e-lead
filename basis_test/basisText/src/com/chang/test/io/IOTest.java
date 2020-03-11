package com.chang.test.io;

import java.io.File;

public class IOTest {
    public static void main(String[] args) {
        Object obj = existTest();
        System.out.println(obj);
    }


    private static Object existTest(){
        boolean flag = new File("D:\\axis.log").exists();
        return  flag;
    }


}
