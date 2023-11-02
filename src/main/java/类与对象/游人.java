package 类与对象;
import java.util.Scanner;
//根据游人的年龄段返回不同的门票价格。你可以根据需要修改门票价格和年龄段的划分。


public class 游人 {
    private String 姓名;
    private int 年龄;

    public 游人(String 姓名, int 年龄) {
        this.姓名 = 姓名;
        this.年龄 = 年龄;
    }

    public String 票价() {
        if (年龄 < 6) {
            return "免费";
        } else if (年龄 < 18) {
            return "儿童票：10元";
        } else if (年龄 < 65) {
            return "成人票：20元";
        } else {
            return "老年票：15元";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入游人姓名：");
        String 姓名 = scanner.nextLine();

        System.out.print("请输入游人年龄：");
        int 年龄 = scanner.nextInt();

        游人 游人1 = new 游人(姓名, 年龄);
        System.out.println("姓名：" + 游人1.姓名 + "，年龄：" + 游人1.年龄 + "，门票价格：" + 游人1.票价());

        scanner.close();
    }
}