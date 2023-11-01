package org.example;
import java.util.Scanner;
//【程序47】
//题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
public class test47 {
//这个程序首先使用循环读取 7 个整数值，确保它们在 1 到 50 的范围内。
// 然后，根据每个整数值的个数，调用 printStars 方法打印相应数量的星号。

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[7];

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("请输入第 " + (i + 1) + " 个整数 (1-50): ");
                int input = scanner.nextInt();

                if (input >= 1 && input <= 50) {
                    numbers[i] = input;
                } else {
                    System.out.println("输入的整数超出范围 (1-50)，请重新输入。");
                    i--;
                }
            }

            System.out.println("根据输入的整数值打印星号:");
            for (int i = 0; i < numbers.length; i++) {
                printStars(numbers[i]);
            }

            scanner.close();
        }

        public static void printStars(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


}
