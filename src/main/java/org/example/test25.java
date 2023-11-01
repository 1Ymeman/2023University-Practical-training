package org.example;
import java.util.Scanner;
//【程序25】
//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
public class test25 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入一个5位数：");
            int number = scanner.nextInt();
            scanner.close();

            if (isPalindrome(number)) {
                System.out.println(number + " 是回文数。");
            } else {
                System.out.println(number + " 不是回文数。");
            }
        }

        public static boolean isPalindrome(int num) {
            // 将数字转换为字符串以便比较
            String str = Integer.toString(num);
            int length = str.length();

            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }


}
