package Top50算法练习;
//题目：809*x=800*x+9*x+1
// 其中x代表的两位数,8*x的结果为两位数，9*x的结果为3位数。求x代表的两位数，及809*x后的结果。
//题目有问题   809*??=800*??+9*??+1 此等式明显不成立  0=1？
public class test42 {
    public static void main(String[] args) {
        for (int x = 10; x < 100; x++) {
            int leftSide = 809 * x;
            int rightSide = 800 * x + 9 * x + 1;

            if (leftSide == rightSide) {
                System.out.println("x 代表的两位数为: " + x);
                System.out.println("809*x 后的结果为: " + leftSide);
                break; // 找到解后退出循环
            }
        }
    }
}
