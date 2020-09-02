package com.summer.tiny.structure;

/**
 * @Author：yuanwei
 * @Date: 2020/9/2
 * @Email: yuanwei@ebupt.com
 * @Description: 斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciII(0));
        System.out.println(fibonacciII(1));
        System.out.println(fibonacciII(2));
        System.out.println(fibonacciII(3));
        System.out.println(fibonacciII(4));
        System.out.println(fibonacciII(5));
        System.out.println(fibonacciII(6));

    }


    /**
     * 获取 n 位置对应的斐波那契数值
     * 采用递归的形式
     * 时间复杂度  O(2^n)
     *
     * @param n 位置 n
     * @return 斐波那契数值
     */
    private static int fibonacciI(int n) {
        /*if( n < 1){
           // throw new RuntimeException("n 是正整数");
            System.out.println("n 是正整数");
            return 0;
        }*/
        if (n < 2) {
            return n;
        } else {
            return fibonacciI(n - 1) + fibonacciI(n - 2);
        }
    }


    /**
     * 获取 n 位置对应的斐波那契数值
     * 采用循环的形式获取
     * 时间复杂度：O(n)
     *
     * @param n 位置 n
     * @return 斐波那契数值
     */
    private static int fibonacciII(int n) {

        if (n < 2) {
            return n;
        } else {
            // 0  位置上对应的斐波那契数值
            int f0 = 0;
            // 1  位置上对应的斐波那契数值
            int f1 = 1;
            // 循环求值
            for (int i = 0; i < n - 1; i++) {

                f1 = f0 + f1;
                f0 = f1 - f0;
            }
            return f1;
        }
    }


}


