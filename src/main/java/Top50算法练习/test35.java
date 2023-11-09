package Top50算法练习;
import java.util.Arrays;
//【程序35】
//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
public class test35 {

//这个程序首先输入一个整数数组，然后调用 swapMaxWithFirst 方法来将最大的元素与第一个元素交换，
// 再调用 swapMinWithLast 方法来将最小的元素与最后一个元素交换。
// 最后，输出交换后的整个数组。

        public static void main(String[] args) {
            int[] array = {5, 8, 3, 1, 9, 4, 7, 2, 6}; // 输入的整数数组
            System.out.println("原始数组：" + Arrays.toString(array));

            swapMaxWithFirst(array);
            swapMinWithLast(array);

            System.out.println("交换后的数组：" + Arrays.toString(array));
        }

        public static void swapMaxWithFirst(int[] arr) {
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            int temp = arr[0];
            arr[0] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        public static void swapMinWithLast(int[] arr) {
            int minIndex = arr.length - 1;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }

            int temp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[minIndex];
            arr[minIndex] = temp;
        }


}
