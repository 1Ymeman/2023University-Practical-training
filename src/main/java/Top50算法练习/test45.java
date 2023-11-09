package Top50算法练习;
import java.util.Scanner;
//【程序45】
//题目：判断一个素数能被几个9整除
public class test45 {
//这个程序首先判断输入的数是否为素数，
// 然后使用 countNinesDivisible 方法来计算该素数能被多少个 9 整除。
// 如果输入的数不是素数，程序会相应地输出消息。

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个素数: ");
            int primeNumber = scanner.nextInt();
            scanner.close();

            if (isPrime(primeNumber)) {
                int count = countNinesDivisible(primeNumber);
                System.out.printf("%d 是一个素数，可以被 %d 个 9 整除。%n", primeNumber, count);
            } else {
                System.out.printf("%d 不是一个素数。%n", primeNumber);
            }
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }

            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }

        public static int countNinesDivisible(int number) {
            int count = 0;
            while (number % 9 == 0) {
                number /= 9;
                count++;
            }
            return count;
        }


}
