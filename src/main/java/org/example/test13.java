package org.example;
//题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
//1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，
// 如果开方后的结果满足如下条件，即是结果。请看具体分析：
public class test13 {

        public static void main(String[] args) {
            for (int x = 1; x <= 100000; x++) {
                double y = Math.sqrt(x + 100);
                double z = Math.sqrt(x + 268);

                if (y == (int) y && z == (int) z) {
                    System.out.println("符合条件的整数是：" + x);
                }
            }
        }


}
