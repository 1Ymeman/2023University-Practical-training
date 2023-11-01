package org.example;
import java.util.Arrays;
//【程序31】
//题目：将一个数组逆序输出。
//1.程序分析：用第一个与最后一个交换。
public class test31 {
    //这个程序首先接受一个数组，然后使用 reverseArray 方法将数组逆序输出。
    // 方法中使用双指针（左指针和右指针）来交换数组的元素，直到左指针大于或等于右指针为止。
    // 运行程序后，你将得到逆序输出的数组。


        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            System.out.println("原数组：" + Arrays.toString(array));
            reverseArray(array);
            System.out.println("逆序输出数组：" + Arrays.toString(array));
        }

        public static void reverseArray(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                // 交换左右两边的元素
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }


}
