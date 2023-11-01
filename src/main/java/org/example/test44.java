package org.example;
//【程序44】
//题目：一个偶数总能表示为两个素数之和。
//程序分析：这是什么题目，要我证明这个问题吗(哥德巴赫猜想)？真不知道怎么证明。那就把一个偶数分解成两个素数吧。
public class test44 {
    //这个程序首先检查输入的数是否为偶数，然后通过迭代查找两个素数，它们的和等于输入的偶数。
    // 如果找到了合适的素数组合，它将进行分解，否则会打印无法找到合适的素数组合的消息。
    // 函数 isPrime 用于检查一个数是否为素数。
        public static void main(String[] args) {
            int evenNumber = 48; // 偶数

            if (evenNumber % 2 == 0) {
                boolean found = false;

                for (int i = 2; i <= evenNumber / 2; i++) {
                    if (isPrime(i) && isPrime(evenNumber - i)) {
                        System.out.println(evenNumber + " 可以分解为两个素数: " + i + " 和 " + (evenNumber - i));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("无法找到两个素数的组合来分解 " + evenNumber);
                }
            } else {
                System.out.println(evenNumber + " 不是偶数，无法进行分解。");
            }
        }

        // 检查一个数是否为素数
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



}
