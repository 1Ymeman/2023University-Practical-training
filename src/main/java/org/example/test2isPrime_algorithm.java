package org.example;
//【程序2】
//题目：判断101-200之间有多少个素数，并输出所有素数。
//1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
//则表明此数不是素数，反之是素数。
public class test2isPrime_algorithm {
    public static void main(String[] args) {
        int count = 0; // 用于计数素数的个数

        for (int num = 101; num <= 200; num++) {
            if (isPrime2(num)) // 调用isPrime方法检查是否为素数 是就执行 不是就不执行
                 {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\n101-200之间有 " + count + " 个素数。");
    }
    //质数的分布具有特点，经过证明可以得到，（大于等于5的）质数一定和6的倍数相邻，一定是6x-1或6x-1。
// 利用这种特性。可以对整数进行筛选，只判断那些是6x-1或6x-1的整数是否为质数。
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
//任一偶数一定能分解为2和其他偶数/奇数的积，因此一个数不能被2整除，那么这个数一定不能被其他偶数整除。
// 利用这个特点，可以对方法2进行改进，判断数n能否被小于sqrt(n)的奇数整除。
//方法3的时间复杂度是O(sqrt(n)/2)。
  public static boolean isPrime2(int n) {
    if (n <= 3) {
        return n > 1;
    }
    //只需判断一个数能否被小于sqrt(n)的奇数整除
    int sqrt = (int)Math.sqrt(n);
    for (int i = 3; i <= sqrt; i += 2) {
        if(n % 2 == 0 || n % i == 0) {
            return false;
        }
    }
    return true;
}


}


