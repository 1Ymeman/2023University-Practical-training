package org.example;
import java.util.Scanner;

//【程序14】
//题目：输入某年某月某日，判断这一天是这一年的第几天？
//1.程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，
// 特殊情况，闰年且输入月份大于3时需考虑多加一天。
public class test14 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入年份：");
            int year = scanner.nextInt();
            System.out.print("请输入月份：");
            int month = scanner.nextInt();
            System.out.print("请输入日期：");
            int day = scanner.nextInt();
            scanner.close();

            int dayOfYear = calculateDayOfYear(year, month, day);
            System.out.println(year + "年" + month + "月" + day + "日是本年的第 " + dayOfYear + " 天。");
        }

        public static int calculateDayOfYear(int year, int month, int day) {
            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (isLeapYear(year)) {
                daysInMonth[2] = 29; // 闰年2月有29天
            }

            int dayOfYear = 0;
            for (int i = 1; i < month; i++) {
                dayOfYear += daysInMonth[i];
            }

            dayOfYear += day;
            return dayOfYear;
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }


}
