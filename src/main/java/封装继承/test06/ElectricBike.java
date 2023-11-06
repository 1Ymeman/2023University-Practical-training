package 封装继承.test06;

public class ElectricBike extends Bicycle {
    public ElectricBike(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车正在运行。");
    }
}