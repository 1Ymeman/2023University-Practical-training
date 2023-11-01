package org.example;
//【程序11】
//题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class test11 {
    public static void main(String[] args) {
        int count = 0; // 用于计数满足条件的三位数的个数

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    //判断当前number是否互不相同且无重复数字
                    if (i != j && i != k && j != k) {
                        int number = i * 100 + j * 10 + k;
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }

        System.out.println("共有 " + count + " 个互不相同且无重复数字的三位数。");
    }

}
