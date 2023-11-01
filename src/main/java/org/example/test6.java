package org.example;
import java.util.Scanner;
//【程序6】
//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
//1.程序分析：利用辗除法。
public class test6 {
    //这段代码可以用于输入两个正整数m和n，并计算它们的最大公约数和最小公倍数。
    // 代码中使用了辗转相除法来计算最大公约数，并通过公式 m * n / 最大公约数 计算最小公倍数。
    // 最后，代码会输出最大公约数和最小公倍数的结果。
    //请注意，这段代码是使用Java编写的，用于解决求最大公约数和最小公倍数的问题。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入两个正整数m和n
        System.out.print("请输入两个正整数m和n：");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // 计算最大公约数和最小公倍数
        int gcd = calculateGCD(m, n);
        int lcm = calculateLCM(m, n);

        // 输出结果
        System.out.println("最大公约数：" + gcd);
        System.out.println("最小公倍数：" + lcm);
    }

    // 计算最大公约数
    public static int calculateGCD(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    // 计算最小公倍数
    public static int calculateLCM(int m, int n) {
        return m * n / calculateGCD(m, n);
    }
}
