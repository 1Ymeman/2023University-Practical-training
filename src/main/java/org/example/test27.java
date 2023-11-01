package org.example;

//【程序27】
//题目：求100之内的素数
public class test27 {

        public static void main(String[] args) {
            System.out.println("100之内的素数有：");
            for (int number = 2; number <= 100; number++) {
                if (isPrime(number)) {
                    System.out.print(number + " ");
                }
            }
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // 1和负数不是素数
            }
            if (num == 2) {
                return true; // 2是素数
            }
            if (num % 2 == 0) {
                return false; // 偶数不是素数
            }
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    return false; // 能被奇数整除的不是素数
                }
            }
            return true;
        }


}
