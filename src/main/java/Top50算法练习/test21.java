package Top50算法练习;
//【程序21】
//题目：求1+2!+3!+...+20!的和
//1.程序分析：此程序只是把累加变成了累乘。
public class test21 {
    public static void main(String[] args) {
        int n = 20; // 计算1到20的阶乘的和
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j; // 计算阶乘
            }
            sum += factorial;
        }

        System.out.println("1! + 2! + 3! + ... + 20! 的和为: " + sum);
    }
}
