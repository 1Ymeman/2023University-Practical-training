package org.example;

//题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
//1.程序分析：请抓住分子与分母的变化规律。
public class test20 {
    public static void main(String[] args) {
        int n = 20; // 求前20项
        double sum = 0;

        double numerator = 2; // 分子
        double denominator = 1; // 分母

        for (int i = 1; i <= n; i++) {
            sum += numerator / denominator;

            // 计算下一项的分子和分母
            double nextNumerator = numerator + denominator;
            double nextDenominator = numerator;

            numerator = nextNumerator;
            denominator = nextDenominator;
        }

        System.out.println("前20项之和为: " + sum);
    }
}
