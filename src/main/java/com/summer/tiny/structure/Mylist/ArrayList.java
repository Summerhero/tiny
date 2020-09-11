package com.summer.tiny.structure.Mylist;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

/**
 * @Author：yuanwei
 * @Date: 2020/9/11
 * @Email: yuanwei@ebupt.com
 * @Description: 动态数组
 */
public class ArrayList {

    /**
     *  数组默认长度
     */
    private static final Integer DEFAULT_CAPACITY = 10;

    /**
     *  常量 0
     */
    private static final Integer COMMON_ZERO = 0;

    /**
     *  内部数组元素
     */
    private Integer[] elements;

    /**
     * 列表大小
     */
    private Integer size;



    /**
     *  无参构造
     */
    public void ArrayList() {
        this.elements = new Integer[DEFAULT_CAPACITY];
    }

    /**
     *  含参构造，设置初始长度
     * @param capacity 列表初始长度
     */
    public void ArrayList(Integer capacity) {
        // 参数校验
        if (capacity < 0 || capacity > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Capacity is positive integer");
        }
        if(capacity < DEFAULT_CAPACITY){
            this.elements = new Integer[DEFAULT_CAPACITY];
        }else{
            this.elements = new Integer[capacity];
        }
    }

    /**
     *  带参构造
     * @param list 初始化列表
     */
    public void ArrayList(Integer[] list) {
      this.elements =  list;
        size = list.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        return "";
    }
}
