package org.example;
import java.util.Scanner;
//【程序38】
//题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
public class test38 {

//这个程序中，calculateStringLength 函数用于计算字符串的长度，它使用了字符串对象的 length() 方法来获取字符串的长度。
// 在 main 函数中，用户被要求输入一个字符串，然后调用 calculateStringLength 函数计算并输出字符串的长度。

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入一个字符串: ");
            String inputString = scanner.nextLine();

            int length = calculateStringLength(inputString);
            System.out.println("字符串的长度为: " + length);

            scanner.close();
        }

        public static int calculateStringLength(String str) {
            if (str == null) {
                return 0;
            }
            return str.length();
        }


}
