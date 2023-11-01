package org.example;
import java.util.Scanner;
//【程序24】
//题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
public class test24 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入一个不多于5位的正整数：");
            int number = scanner.nextInt();
            scanner.close();

            int digitCount = countDigits(number);
            System.out.println("它是 " + digitCount + " 位数。");

            System.out.print("逆序打印各位数字：");
            reverseAndPrintDigits(number);
        }

        public static int countDigits(int num) {
            int count = 0;
            while (num > 0) {
                num /= 10;
                count++;
            }
            return count;
        }

        public static void reverseAndPrintDigits(int num) {
            while (num > 0) {
                int digit = num % 10;
                System.out.print(digit);
                num /= 10;
            }
            System.out.println();
        }


}
