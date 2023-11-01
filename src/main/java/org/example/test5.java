package org.example;
import java.util.Scanner;
//【程序5】
//题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
//1.程序分析：(a> b)?a:b这是条件运算符的基本例子。
public class test5 {
    //这个程序会提示用户输入学生的成绩，然后根据成绩的范围使用条件运算符嵌套来确定对应的成绩等级，
    // 并输出结果。如果成绩大于等于90分，则等级为A；
    // 如果成绩在60-89分之间，则等级为B；
    // 如果成绩低于60分，则等级为C。
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入学生的成绩：");
            int score = scanner.nextInt();

            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 60) {
                grade = "B";
            } else {
                grade = "C";
            }

            System.out.println("学生的成绩等级是：" + grade);
        }

}
