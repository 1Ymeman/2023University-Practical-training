package Top50算法练习;

//【程序10】
//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时，共经过多少米？第10次反弹多高？
public class test10 {
 //这个程序使用循环模拟了球的落地和反弹过程，然后计算出第10次落地时总共经过的距离和第10次反弹的高度。
        public static void main(String[] args) {
            int height = 100; // 初始高度
            int totalDistance = 0; // 总经过的距离

            for (int i = 1; i <= 10; i++) {
                totalDistance += height; // 落下
                height /= 2; // 反弹
                totalDistance += height; // 反弹后再落下
            }

            int finalHeight = height; // 第10次反弹的高度

            System.out.println("第10次落地时共经过 " + totalDistance + " 米");
            System.out.println("第10次反弹的高度为 " + finalHeight + " 米");
        }


}
