package 封装继承;

public class test02 {
    private String brand;
    private String model;
    private String color;
    private int speed;

    public test02() {
        this.brand = "宝马";
        this.model = "M6";
        this.color = "蓝色";
        this.speed = 370;
    }

    public test02(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.color = "红色";
    }

    public test02(String brand, String model, String color, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String start() {
        return "小轿车启动了，颜色：" + color + "，品牌：" + brand + "，型号：" + model;
    }

    public String stop() {
        return "小轿车停止了，品牌：" + brand + "，时速：" + speed + "，型号：" + model;
    }

    public static void main(String[] args) {
        test02 car1 = new test02();
        test02 car2 = new test02("奔驰", "C200");
        test02 car3 = new test02("丰田", "Camry", "黑色", 250);

        System.out.println(car1.start());
        System.out.println(car1.stop());

        System.out.println(car2.start());
        System.out.println(car2.stop());

        System.out.println(car3.start());
        System.out.println(car3.stop());
    }
}