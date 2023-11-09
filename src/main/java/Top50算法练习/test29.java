package Top50算法练习;
import java.util.Scanner;
//【程序29】
//题目：求一个3*3矩阵对角线元素之和
//1.程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
public class test29 {
    //这个程序首先接受用户输入的3x3矩阵元素，然后使用 calculateDiagonalSum 方法来计算对角线元素之和。
    // 计算方法非常简单，只需累加主对角线上的元素即可。
    // 运行程序后，你将得到对角线元素之和。
        public static void main(String[] args) {
            int[][] matrix = new int[3][3];
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入3x3矩阵的元素：");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            scanner.close();

            int sum = calculateDiagonalSum(matrix);
            System.out.println("对角线元素之和为: " + sum);
        }

        public static int calculateDiagonalSum(int[][] matrix) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += matrix[i][i];
            }
            return sum;
        }



}
