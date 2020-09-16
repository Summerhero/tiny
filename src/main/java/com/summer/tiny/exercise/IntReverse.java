package com.summer.tiny.exercise;

/**
 * @Author：yuanwei
 * @Date: 2020/9/16
 * @Email: yuanwei@ebupt.com
 * @Description: Int 类型数据实现反转效果
 */
public class IntReverse {

    public static void main(String[] args) {
        //System.out.println(reverseI(123));

       // System.out.println(Integer.MAX_VALUE);  // 2147483647
      //  System.out.println(Math.pow(2, 3));
        //System.out.println(reverseI(Integer.MAX_VALUE));
        long start = System.currentTimeMillis();
        System.out.println(reverseI(123456789));
        System.out.println((System.currentTimeMillis() - start));
    }


    /**
     *  将 num 进行反转，并返回结果
     * @param num 待反转数值
     * @return 反转后结果
     * @Descrption: 采用String 进行倒置转换
     *
     */
    static int reverseI(int num){

        /**
         *   nun 转换为字符串类型
         */
        String numStr = Integer.toString(num);

        if( numStr.length() == 10 && numStr.charAt(numStr.length() -1) > 2){
            return Integer.MAX_VALUE;
        }

        StringBuilder builder = new StringBuilder("");

        for (int i = numStr.length() ; i > 0; i--) {
            builder.append(numStr.charAt(i-1));
        }

        return Integer.parseInt(builder.toString());
    }


    /**
     *  将 num 进行反转，并返回结果
     * @param num 待反转数值
     * @return  反转后结果
     * @Description  不采取 String 方法
     */
    static int reverseII(int num){
        if( num /1000000000 > 0 && num%10 > 2){
            return Integer.MAX_VALUE;
        }

        int temp = 0;
        int res = 0;
        int count = 0;
        while(num != 0){
            temp = num%10;
            res = res * 10 + temp ;
            num /= 10;
            count++;
        }

        return res;
    }
}

