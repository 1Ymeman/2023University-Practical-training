package org.example;
//题目：打印出如下图案（菱形）
//*
//***
//******
//********
//******
//***
//*
public class test19 {
    public static void main(String[] args) {
        int n = 4; // 菱形的高度，根据需要修改

        // 上半部分
        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 换行
        }

        // 下半部分
        for (int i = n - 1; i >= 1; i--) {
            // 打印空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 换行
        }
    }
}
