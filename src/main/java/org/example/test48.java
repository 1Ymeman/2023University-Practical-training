package org.example;

//【程序48】
//题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
// 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
public class test48 {
//这个程序包含了两个方法，一个用于加密数据 (encryptData)，另一个用于解密数据 (decryptData)。
// 程序首先加密一个四位整数，然后再解密它，最终打印出加密前后的数据。
        public static void main(String[] args) {
            int originalData = 1234; // 原始四位整数

            // 加密数据
            int encryptedData = encryptData(originalData);
            System.out.println("加密后的数据: " + encryptedData);

            // 解密数据
            int decryptedData = decryptData(encryptedData);
            System.out.println("解密后的数据: " + decryptedData);
        }

        // 加密数据的方法
        public static int encryptData(int data) {
            int[] digits = new int[4];
            for (int i = 3; i >= 0; i--) {
                digits[i] = (data % 10 + 5) % 10;
                data /= 10;
            }

            int encryptedData = 0;
            encryptedData = digits[0] * 1000 + digits[3] * 100 + digits[1] * 10 + digits[2];
            return encryptedData;
        }

        // 解密数据的方法
        public static int decryptData(int encryptedData) {
            int[] digits = new int[4];
            for (int i = 3; i >= 0; i--) {
                digits[i] = (encryptedData % 10 + 10 - 5) % 10;
                encryptedData /= 10;
            }

            int originalData = 0;
            originalData = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
            return originalData;
        }


}
