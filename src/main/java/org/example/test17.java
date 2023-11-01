package org.example;
//【程序17】
//题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
// 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下   的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
//1.程序分析：采取逆向思维的方法，从后往前推断。
public class test17 {
    public static void main(String[] args) {
        int totalPeaches = calculatePeaches(10);
        System.out.println("第一天共摘了 " + totalPeaches + " 个桃子。");
    }

    public static int calculatePeaches(int day) {
        if (day == 10) {
            return 1; // 第10天剩下1个桃子
        } else {
            // 逆向计算前一天的桃子数
            return (calculatePeaches(day + 1) + 1) * 2;
        }
    }
}
