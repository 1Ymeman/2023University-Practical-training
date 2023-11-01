package org.example;

//【程序9】
//题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程   找出1000以内的所有完数。
public class test9 {
//这个程序遍历从2到1000的每个数，对于每个数，它调用 isPerfectNumber 函数来检查是否是完数。
// isPerfectNumber 函数计算该数的所有因子之和，并返回布尔值，指示是否是完数。
// 如果是完数，程序将打印出该数。
        public static void main(String[] args) {
            for (int num = 2; num <= 1000; num++) {
                if (isPerfectNumber(num)) {
                    System.out.println(num + " 是完数");
                }
            }
        }

        public static boolean isPerfectNumber(int number) {
            int sum = 1; // 1总是所有正整数的因子

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            return sum == number;
        }


}
