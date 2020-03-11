package com.chang.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maopao {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        int[] arr={12,32,11,7,1,2,4,3,5};
        Arrays.sort(arr);
//        maopaoArr(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
        System.out.println();
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer+"  ");
        }

    }

    private static void maopaoArr( int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    int a=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                }
            }
        }
    }

}
