package Top50算法练习;
import java.util.Scanner;
//【程序8】
//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
//1.程序分析：关键是计算出每一项的值。
public class test8 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入一个数字 a：");
            int a = scanner.nextInt();

            System.out.print("请输入要相加的项数 n：");
            int n = scanner.nextInt();

            int sum = 0;
            int term = 0;
            int tempA = a;

            for (int i = 1; i <= n; i++) {
                term = term * 10 + tempA;
                sum += term;
            }

            System.out.println("s = " + sum);
        }


}
