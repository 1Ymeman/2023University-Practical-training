package 多态.test04;

import java.util.Scanner;

abstract class Beverage {
    private String name;

    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void purchase();
}

class Coffee extends Beverage {
    private boolean sugar;
    private boolean milk;

    public Coffee(String name, boolean sugar, boolean milk) {
        super(name);
        this.sugar = sugar;
        this.milk = milk;
    }

    @Override
    public void purchase() {
        System.out.println("购买咖啡：" + getName());
        System.out.println("加糖：" + (sugar ? "是" : "否"));
        System.out.println("加奶：" + (milk ? "是" : "否"));
    }
}

class Cola extends Beverage {
    private String brand;

    public Cola(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public void purchase() {
        System.out.println("购买可乐：" + getName());
        System.out.println("品牌：" + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入饮料类型（咖啡/矿泉水/可乐）：");
        String beverageType = scanner.nextLine();

        if (beverageType.equals("咖啡")) {
            System.out.print("请输入咖啡量：");
            String name = scanner.nextLine();
            System.out.print("是否加糖（是/否）：");
            String sugarInput = scanner.nextLine();
            boolean sugar = sugarInput.equals("是");
            System.out.print("是否加奶（是/否）：");
            String milkInput = scanner.nextLine();
            boolean milk = milkInput.equals("是");

            Beverage coffee = new Coffee(name, sugar, milk);
            coffee.purchase();
        } else if (beverageType.equals("可乐")) {
            System.out.print("请输入可乐量：");
            String name = scanner.nextLine();
            System.out.print("请选择品牌（可口可乐/百事可乐）：");
            String brand = scanner.nextLine();

            Beverage cola = new Cola(name, brand);
            cola.purchase();
        } else {
            System.out.println("无效的饮料类型！");
        }
    }
}