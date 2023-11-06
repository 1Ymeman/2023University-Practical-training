package 封装继承.test06;

public abstract class Bicycle {
    private String brand;
    private String color;
    private int wheels;
    int seats;

    public Bicycle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.wheels = 2;
        this.seats = 1;
    }

    public abstract void run();
}