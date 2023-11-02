package 类与对象;

import java.util.Scanner;
//上机任务5：
//从键盘接收三门课分数，计算三门课的平均分和总成绩，编写成绩计算类实现功能
public class 成绩计算类 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一门课的分数：");
        double java分数 = scanner.nextDouble();

        System.out.print("请输入第二门课的分数：");
        double c分数 = scanner.nextDouble();

        System.out.print("请输入第三门课的分数：");
        double DB分数 = scanner.nextDouble();


        double 总成绩 = java分数 + c分数 + DB分数;
        double 平均分 = (java分数 + c分数 + DB分数) / 3;
        System.out.println("平均分：" + 平均分);
        System.out.println("总成绩：" + 总成绩);

        scanner.close();
    }
}
