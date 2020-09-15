package com.summer.tiny.structure.mylist;

import java.util.Arrays;

/**
 * @Author：yuanwei
 * @Date: 2020/9/14
 * @Email: yuanwei@ebupt.com
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        int a = 17;
        System.out.println(a << 1);

        Integer[] arr1 = {1,5,8,6,3,47,55};

        Arrays.copyOf(arr1,10);

        System.out.println(arr1.length);
        for (Integer i: arr1
             ) {
            System.out.println(i);
        }
    }

}
