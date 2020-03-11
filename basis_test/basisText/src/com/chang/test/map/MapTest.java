package com.chang.test.map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("zhangsan",15);
        map.put("lisi",13);
        map.put("wangwu",12);
        map.put("zhaoliu",16);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String, Integer>> list=new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        for (Map.Entry<String, Integer> en : list) {
            System.out.println(en.getKey()+":"+en.getValue());
        }

    }
}
