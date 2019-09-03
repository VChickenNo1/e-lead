package com.chang.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpUtil {
    public static void main(String[] args) throws UnknownHostException {
        //本机ip
        String ip = InetAddress.getLocalHost().getHostAddress();
        //计算机名
        String name = InetAddress.getLocalHost().getHostName();
        System.out.println(ip);
        System.out.println(name);
    }
}
