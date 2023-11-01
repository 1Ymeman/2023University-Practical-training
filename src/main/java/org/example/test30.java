package org.example;
import java.util.Arrays;
import java.util.Scanner;
//【程序30】
//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
//1.   程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
public class test30 {


//这个程序首先接受用户输入的已排序数组和要插入的数，然后使用 insertIntoArray 方法来插入这个数。
// 方法中，遍历数组找到插入位置，然后将原数组中剩余的元素复制到新数组中，最后返回新数组。运行程序后，你将得到插入后的数组。
        public static void main(String[] args) {
            int[] sortedArray = {1, 3, 5, 7, 9};
            Scanner scanner = new Scanner(System.in);

            System.out.println("已排序的数组：" + Arrays.toString(sortedArray));
            System.out.print("请输入要插入的数：");
            int numberToInsert = scanner.nextInt();
            scanner.close();

            sortedArray = insertIntoArray(sortedArray, numberToInsert);

            System.out.println("插入后的数组：" + Arrays.toString(sortedArray));
        }

        public static int[] insertIntoArray(int[] sortedArray, int numberToInsert) {
            int length = sortedArray.length;
            int[] newArray = new int[length + 1];
            int index = 0;

            // 遍历数组，找到插入位置
            while (index < length && sortedArray[index] < numberToInsert) {
                newArray[index] = sortedArray[index];
                index++;
            }

            newArray[index] = numberToInsert;

            // 将原数组中剩余的元素复制到新数组中
            System.arraycopy(sortedArray, index, newArray, index + 1, length - index);

            return newArray;
        }


}
