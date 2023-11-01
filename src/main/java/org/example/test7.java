package org.example;
import java.util.Scanner;
//【程序7】
//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
//1.程序分析：利用while语句,条件为输入的字符不为 '\n '.
public class test7 {

//这个程序首先使用 Scanner 获取用户输入的一行字符，
// 然后遍历字符来统计英文字母、空格、数字和其他字符的个数。
// 最后，将结果打印出来。
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一行字符：");
            String input = scanner.nextLine();

            int letterCount = 0;
            int spaceCount = 0;
            int digitCount = 0;
            int otherCount = 0;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                } else if (Character.isSpaceChar(c)) {
                    spaceCount++;
                } else {
                    otherCount++;
                }
            }

            System.out.println("英文字母个数：" + letterCount);
            System.out.println("空格个数：" + spaceCount);
            System.out.println("数字个数：" + digitCount);
            System.out.println("其他字符个数：" + otherCount);
        }



}
