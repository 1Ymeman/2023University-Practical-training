package org.example;

//【程序37】
//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
//这是一个经典的约瑟夫问题，可以使用模拟的方法来解决。
public class test37 {
//这个程序模拟了n个人围成一圈，从第一个人开始报数，每次报数到m的人退出圈子。
// 最后留下的人的编号可以通过 findSurvivor 方法计算得到。
// 你可以在 main 方法中修改总人数 n 和报数的值 m 来测试不同情况下的最后留下的人的编号。
        public static void main(String[] args) {
            int n = 10; // 总人数
            int m = 3;  // 报数到几退出

            int survivor = findSurvivor(n, m);
            System.out.println("最后留下的是原来第 " + survivor + " 号的那位。");
        }

        public static int findSurvivor(int n, int m) {
            int survivor = 0;

            for (int i = 2; i <= n; i++) {
                survivor = (survivor + m) % i;
            }

            // survivor 是从 0 开始计数的，需要加 1 转换成从 1 开始计数
            return survivor + 1;
        }


}
