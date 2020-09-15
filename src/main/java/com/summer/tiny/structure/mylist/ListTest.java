package com.summer.tiny.structure.mylist;

import java.util.List;

/**
 * @Author：yuanwei
 * @Date: 2020/9/14
 * @Email: yuanwei@ebupt.com
 * @Description:
 */
public class ListTest {
    public static void main(String[] args) {
       /* myList();

        List<Integer> list = new java.util.ArrayList<>();
        list.remove(null);*/
        myListRemoveTets();

    }

    static void myList(){
        ArrayList list = new ArrayList();

        for (int i = 1; i < 16 ; i++) {
            list.add(i);
        }
        System.out.println(list.toString());

        for (int i = 1; i < 16; i++) {
            if( i%2 == 0){
                list.set(i-1,i*i);
            }
        }

        System.out.println(list.toString());
    }

    static void myListRemoveTets(){
        ArrayList list = new ArrayList();

        for (int i = 1; i < 11 ; i++) {
            list.add(i);
        }
        System.out.println(list.toString());

        list.remove(1);
        System.out.println(list.toString());

        list.remove(5);
        System.out.println(list.toString());

        list.remove(7);
        System.out.println(list.toString());

    }
}
