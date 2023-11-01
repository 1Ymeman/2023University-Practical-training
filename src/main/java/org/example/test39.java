package org.example;
import java.util.Scanner;
//【程序39】
//题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)

// 函数指针一般作为函数的参数来使用，开发人员在使用是可以根据自己的需求传递自动以的函数来实现指定的功能，
// 例如，在实现排序算法时，可以通过传递一个函数指针来决定两个数的先后顺序，从而最终决定算法是按照升序还是降序。
//在Java中没有指针的概念，如何在Java语言中类似函数指针的功能呢？具体思路如下
//①定义一个接口，接口中声明好方法
//②可以有多个实现类实现接口中的方法
//③创建一个函数，参数中有一个为接口
//④把实现类的一个对象作为参数传递给调用调用程序的参数
public class test39 {
/*    这个Java程序使用 calculateEvenSum 和 calculateOddSum 方法分别计算奇数和偶数情况下的数列和，
    然后根据输入n的奇偶性来调用不同的函数并输出计算结果。*/


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个整数 n: ");
            int n = scanner.nextInt();
            scanner.close();

            double sum;
            if (n % 2 == 0) {
                sum = calculateEvenSum(n);
            } else {
                sum = calculateOddSum(n);
            }

            System.out.println("计算结果为: " + sum);
        }

        public static double calculateEvenSum(int n) {
            double sum = 0.0;
            for (int i = 2; i <= n; i += 2) {
                sum += 1.0 / i;
            }
            return sum;
        }

        public static double calculateOddSum(int n) {
            double sum = 0.0;
            for (int i = 1; i <= n; i += 2) {
                sum += 1.0 / i;
            }
            return sum;
        }



}
