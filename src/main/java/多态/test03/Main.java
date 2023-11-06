package 多态.test03;

import java.util.Scanner;

abstract class Computer {
    private String model;
    private String brand;
    private String processorType;
    private String display;

    public Computer(String model, String brand, String processorType, String display) {
        this.model = model;
        this.brand = brand;
        this.processorType = processorType;
        this.display = display;
    }
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessorType() {
        return processorType;
    }

    public String getDisplay() {
        return display;
    }



    public abstract void infoDescription();
}

class Desktop extends Computer {
    private String chassisType;

    public Desktop(String model, String brand, String processorType, String display, String chassisType) {
        super(model, brand, processorType, display);
        this.chassisType = chassisType;
    }

    @Override
    public void infoDescription() {
        System.out.println("台式机信息描述：");
        System.out.println("型号名称：" + getModel());
        System.out.println("品牌：" + getBrand());
        System.out.println("处理器类型：" + getProcessorType());
        System.out.println("显示器：" + getDisplay());
        System.out.println("机箱类型：" + chassisType);
    }
}

class Laptop extends Computer {
    private String battery;

    public Laptop(String model, String brand, String processorType, String display, String battery) {
        super(model, brand, processorType, display);
        this.battery = battery;
    }

    @Override
    public void infoDescription() {
        System.out.println("笔记本信息描述：");
        System.out.println("型号名称：" + getModel());
        System.out.println("品牌：" + getBrand());
        System.out.println("处理器类型：" + getProcessorType());
        System.out.println("显示器：" + getDisplay());
        System.out.println("电池：" + battery);
    }
}

class PDA extends Computer {
    private String battery;
    private String touchscreen;

    public PDA(String model, String brand, String processorType, String display, String battery, String touchscreen) {
        super(model, brand, processorType, display);
        this.battery = battery;
        this.touchscreen = touchscreen;
    }

    @Override
    public void infoDescription() {
        System.out.println("PDA信息描述：");
        System.out.println("型号名称：" + getModel());
        System.out.println("品牌：" + getBrand());
        System.out.println("处理器类型：" + getProcessorType());
        System.out.println("显示器：" + getDisplay());
        System.out.println("电池：" + battery);
        System.out.println("触摸屏：" + touchscreen);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入计算机类型（台式机/笔记本/PDA）：");
        String computerType = scanner.nextLine();

        if (computerType.equals("台式机")) {
            System.out.print("请输入型号名称：");
            String model = scanner.nextLine();
            System.out.print("请输入品牌：");
            String brand = scanner.nextLine();
            System.out.print("请输入处理器类型：");
            String processorType = scanner.nextLine();
            System.out.print("请输入显示器：");
            String display = scanner.nextLine();
            System.out.print("请输入机箱类型：");
            String chassisType = scanner.nextLine();

            Computer desktop = new Desktop(model, brand, processorType, display, chassisType);
            desktop.infoDescription();
        } else if (computerType.equals("笔记本")) {
            System.out.print("请输入型号名称：");
            String model = scanner.nextLine();
            System.out.print("请输入品牌：");
            String brand = scanner.nextLine();
            System.out.print("请输入处理器类型：");
            String processorType = scanner.nextLine();
            System.out.print("请输入显示器：");
            String display = scanner.nextLine();
            System.out.print("请输入电池：");
            String battery = scanner.nextLine();

            Computer laptop = new Laptop(model, brand, processorType, display, battery);
            laptop.infoDescription();
        } else if (computerType.equals("PDA")) {
            System.out.print("请输入型号名称：");
            String model = scanner.nextLine();
            System.out.print("请输入品牌：");
            String brand = scanner.nextLine();
            System.out.print("请输入处理器类型：");
            String processorType = scanner.nextLine();
            System.out.print("请输入显示器：");
            String display = scanner.nextLine();
            System.out.print("请输入电池：");
            String battery = scanner.nextLine();
            System.out.print("请输入触摸屏：");
            String touchscreen = scanner.nextLine();

            Computer pda = new PDA(model, brand, processorType, display, battery, touchscreen);
            pda.infoDescription();
        } else {
            System.out.println("无效的计算机类型！");
        }
    }
}
