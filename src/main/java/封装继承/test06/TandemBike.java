package 封装继承.test06;

public class TandemBike extends Bicycle {
    public TandemBike(String brand, String color) {
        super(brand, color);
        this.seats = 2;
    }

    @Override
    public void run() {
        System.out.println("多人车正在运行。");
    }
}