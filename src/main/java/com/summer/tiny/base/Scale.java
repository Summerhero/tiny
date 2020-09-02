package com.summer.tiny.base;

import sun.security.krb5.internal.crypto.Des;

/**
 * @Author：yuanwei
 * @Date: 2020/9/2
 * @Email: yuanwei@ebupt.com
 * @Description:  -- 进制转换
 */
public class Scale {
    public static void main(String[] args) {
        System.out.println(DecToBinay(0));
        System.out.println(DecToBinay(10));
        System.out.println(DecToBinay(16));
        System.out.println(DecToBinay(21));
    }

    /**
     * 将十进制数整数 转换为二进制数
     * @param num 十进制数值
     * @return 二进制数值
     */
    private static Integer DecToBinay(int num){
        String temp = num ==0 ? "0" : "";
        while( num !=0 ){
            temp = num%2 + temp;
            num/=2;
        }

        return Integer.parseInt(temp);
    }
}
