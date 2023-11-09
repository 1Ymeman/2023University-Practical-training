package Top50算法练习;
import java.util.Scanner;
//【程序15】
//题目：输入三个整数x,y,z，请把这三个数由小到大输出。
//1.程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x> y则将x与y的值进行交换，然后再用x与z进行比较，
// 如果x> z则将x与z的值进行交换，这样能使x最小。
public class test15 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入三个整数：");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            scanner.close();

            sortNumbers(x, y, z);
        }

        public static void sortNumbers(int x, int y, int z) {
            // 比较并交换x和y，确保x是三个数中的最小值
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }

            // 再次比较并交换x和z，确保x是最小值
            if (x > z) {
                int temp = x;
                x = z;
                z = temp;
            }

            // 最后，比较并交换y和z，确保z是三个数中的最大值
            if (y > z) {
                int temp = y;
                y = z;
                z = temp;
            }

            System.out.println("从小到大的顺序输出：" + x + " " + y + " " + z);
        }


}
