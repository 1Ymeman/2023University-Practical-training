package Top50算法练习;

//【程序33】
//题目：打印出杨辉三角形（要求打印出10行如下图）
//1.程序分析：
//1
//1   1
//1   2   1
//1   3   3   1
//1   4   6   4   1
//1   5   10   10   5   1
public class test33 {
//这个程序使用递归方法计算杨辉三角形中的每个数，并打印出前10行。
// binomialCoefficient 方法计算组合数，而 factorial 方法用于计算阶乘。
// 运行程序后，你将得到杨辉三角形的前10行。
        public static void main(String[] args) {
            int numRows = 10;

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(binomialCoefficient(i, j) + " ");
                }
                System.out.println();
            }
        }

        public static int binomialCoefficient(int n, int k) {
            return factorial(n) / (factorial(k) * factorial(n - k));
        }

        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }


}
