package com.chang.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        original.filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("----------------------------------------------");
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.stream().filter(a->a.startsWith("张")).forEach(System.out::println);
    }
}
