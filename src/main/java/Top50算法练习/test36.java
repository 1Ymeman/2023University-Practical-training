package Top50算法练习;

//【程序36】
//题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
public class test36 {

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 输入的整数数组
            int m = 3; // 向后移动的位置数
            int n = array.length; // 数组的长度

            System.out.println("原始数组：");
            printArray(array);

            moveElements(array, m, n);

            System.out.println("移动后的数组：");
            printArray(array);
        }

        public static void moveElements(int[] arr, int m, int n) {
            int[] temp = new int[m];
            for (int i = 0; i < m; i++) {
                temp[i] = arr[i];
            }

            for (int i = m; i < n; i++) {
                arr[i - m] = arr[i];
            }

            for (int i = 0; i < m; i++) {
                arr[n - m + i] = temp[i];
            }
        }

        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


}
