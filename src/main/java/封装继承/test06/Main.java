package 封装继承.test06;

public class Main {
    public static void main(String[] args) {
        Bicycle foldingBike = new FoldingBike("折叠车品牌", "红色");
        Bicycle electricBike = new ElectricBike("电动车品牌", "蓝色");
        Bicycle tandemBike = new TandemBike("多人车品牌", "黄色");

        foldingBike.run();
        electricBike.run();
        tandemBike.run();
    }
}