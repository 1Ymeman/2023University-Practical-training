package org.example;

//【程序28】
//题目：对10个数进行排序
//1.程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换,
// 下次类推，即用第二个元素与后8个进行比较，并进行交换。
public class test28 {
    //这个程序使用选择排序算法对给定的数组进行升序排序。
    // 选择排序通过多次遍历数组来找到每一轮的最小值，然后交换最小值和当前位置的元素，以达到排序的目的。
    // 运行程序后，你将得到排序前和排序后的数组。

        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90, 88, 76, 100};

            System.out.println("排序前的数组：");
            printArray(arr);

            selectionSort(arr);

            System.out.println("\n排序后的数组：");
            printArray(arr);
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                if (minIndex != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }



}
