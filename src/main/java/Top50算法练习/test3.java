package Top50算法练习;
import java.util.Scanner;
//【程序3】
//题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
//1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
public class test3 {
//这个程序首先接受用户输入的三个数 a、b 和 c，然后使用 sortAndPrintNumbers 方法对它们进行排序，并按大小顺序输出。
// 方法中，我们比较三个数，交换它们的位置，以确保最终按升序排列。
// 运行程序后，你将得到按大小顺序输出的三个数。
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入第一个数 a：");
            int a = scanner.nextInt();

            System.out.print("请输入第二个数 b：");
            int b = scanner.nextInt();

            System.out.print("请输入第三个数 c：");
            int c = scanner.nextInt();

            scanner.close();

            sortAndPrintNumbers(a, b, c);
        }

        public static void sortAndPrintNumbers(int a, int b, int c) {
            int temp;

            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }

            if (a > c) {
                temp = a;
                a = c;
                c = temp;
            }

            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }

            System.out.println("按大小顺序输出： " + a + " " + b + " " + c);
        }

}
