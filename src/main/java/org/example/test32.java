package org.example;
import java.util.Scanner;
//【程序32】
//题目：取一个整数a从右端开始的4～7位。
//程序分析：可以这样考虑：
//(1)先使a右移4位。
//(2)设置一个低4位全为1,其余全为0的数。可用~(~0 < <4)
//(3)将上面二者进行&运算。
public class test32 {
    //这个程序首先接受用户输入的整数 a，然后使用 extractDigits 方法从右端取出第4到第7位的数字。
    // 方法中，我们先将 a 右移3位，将目标位移到最右边，然后创建一个低4位全为1的掩码，最后将 a 和掩码进行与运算，得到结果。
    // 运行程序后，你将得到所需的数字。



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入一个整数：");
            int a = scanner.nextInt();
            scanner.close();

            int result = extractDigits(a);

            System.out.println("从右端开始的4～7位数字为：" + result);
        }

        public static int extractDigits(int a) {
            a = a >> 3; // 右移3位，将目标位移到最右边
            int mask = (1 << 4) - 1; // 创建一个低4位全为1的掩码
            return a & mask; // 将a和掩码进行&运算，得到结果
        }



}
