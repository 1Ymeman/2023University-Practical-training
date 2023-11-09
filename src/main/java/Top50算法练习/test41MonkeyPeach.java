package Top50算法练习;
//题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
// 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，
// 第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
public class test41MonkeyPeach {
        public static void main(String[] args) {
            int x = 1; // 假设桃子的数量从1开始

            while (true) {
                int total = x; // 初始化每只猴子拿到的桃子数量
                boolean found = true; // 标志变量，表示是否找到满足条件的数量

                for (int i = 0; i < 5; i++) {
                    if (total % 5 == 1) {
                        total = (total - 1) * 4 / 5;
                    } else {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    System.out.println("海滩上原来最少有 " + x + " 个桃子。");
                    break;
                }

                x++; // 尝试下一个数量
            }
        }
}
