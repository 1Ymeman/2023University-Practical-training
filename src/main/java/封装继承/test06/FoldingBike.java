package 封装继承.test06;

public class FoldingBike extends Bicycle {
    public FoldingBike(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("折叠车正在运行。");
    }
}
