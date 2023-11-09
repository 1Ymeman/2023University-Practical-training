package Top50算法练习;
//程序1】
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
//1.程序分析：   兔子的规律为数列1,1,2,3,5,8,13,21....
public class test1 {
    //这个程序使用数组来存储每个月的兔子总数，然后使用斐波那契数列的规则计算每个月的兔子数量。
    // 程序模拟了12个月的情况并输出每个月的兔子总数。
    // 你可以根据需要更改 months 变量以模拟不同月份的情况。
    public static void main(String[] args) {
        int months = 12; // 模拟12个月
        int[] population = new int[months];

        for (int i = 0; i < months; i++) {
            population[i] = fibonacci(i); // 计算斐波那契数列的值
        }

        System.out.println("每个月的兔子总数：");
        for (int i = 0; i < months; i++) {
            System.out.println("第 " + (i + 1) + " 个月：" + population[i] + " 对兔子");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}
