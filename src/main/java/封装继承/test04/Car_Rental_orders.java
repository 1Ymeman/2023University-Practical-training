package 封装继承.test04;

import java.util.Scanner;

public class Car_Rental_orders {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int vehicle_code;
        System.out.println("输入选择的的车型代号（1.轿车 2.客车）");
        while (input.hasNext()) {
            vehicle_code = input.nextInt();
            if (vehicle_code == 1) {
                System.out.println("输入租车数量，租车型号" + "（\"别克商务舱GL8\"，\"宝马550i\"，\"别克林荫大道\"）");
                MotoVehicle order1 = new Car(input.nextInt(), input.next());
                System.out.println("输入租车天数");
                int Sum = order1.CalcRent(input.nextInt());
                System.out.println("订单金额：" + Sum);
            } else if (vehicle_code == 2) {
                System.out.println("输入租车数量，租车的座次数");
                MotoVehicle order2 = new Bus(input.nextInt(), input.nextInt());
                System.out.println("输入租车天数");
                int Sum = order2.CalcRent(input.nextInt());
                System.out.println("订单金额：" + Sum);
            }

            System.out.println("输入选择的的车型代号（1.轿车 2.客车）");
        }

    }

}

