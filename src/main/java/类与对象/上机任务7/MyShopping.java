package 类与对象.上机任务7;

import java.util.Scanner;

public class MyShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 菜单项编号;

        do {
            显示菜单();
            System.out.print("请输入菜单项编号（输入0退出）：");
            菜单项编号 = scanner.nextInt();

            切换菜单(菜单项编号);
        } while (菜单项编号 != 0);

        scanner.close();
    }

    public static void 显示菜单() {
        System.out.println("======= MyShopping 菜单 =======");
        System.out.println("1. 商品浏览");
        System.out.println("2. 购物车");
        System.out.println("3. 下单结算");
        System.out.println("0. 退出");
        System.out.println("=============================");
    }

    public static void 切换菜单(int 菜单项编号) {
        switch (菜单项编号) {
            case 1:
                商品浏览();
                break;
            case 2:
                购物车();
                break;
            case 3:
                下单结算();
                break;
            case 0:
                System.out.println("已退出 MyShopping 菜单");
                break;
            default:
                System.out.println("无效的菜单项编号，请重新输入");
                break;
        }
        System.out.println();
    }

    public static void 商品浏览() {
        System.out.println("欢迎浏览商品！");
        // 实现商品浏览的逻辑
    }

    public static void 购物车() {
        System.out.println("欢迎进入购物车！");
        // 实现购物车的逻辑
    }

    public static void 下单结算() {
        System.out.println("欢迎下单结算！");
        // 实现下单结算的逻辑
    }
}