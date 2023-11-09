package Top50算法练习;

//题目：利用递归方法求5!。
//1.程序分析：递归公式：fn=fn_1*4!
public class test22 {

        public static void main(String[] args) {
            int n = 5;
            long factorial = calculateFactorial(n);
            System.out.println(n + "! = " + factorial);
        }

        public static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // 0! 和 1! 都等于1
            } else {
                return n * calculateFactorial(n - 1); // 递归计算阶乘
            }
        }


}
