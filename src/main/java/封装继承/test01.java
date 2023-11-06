package 封装继承;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//上机任务1：
//使用封装完成以下需求：
//汽车销售人员销售汽车，可售款式有凯越、君威
//	每款汽车有款式和编号，款式、编号不能修改
//	汽车销售人员有姓名，姓名不能修改
//销售人员有两种销售方式：
//	按车辆销售，每次一辆
//	按车型销售（凯越），要同时告诉销售人员购买数量
class Car {
    /**
     * 汽车编号
     */
    protected int id = 0;

    /**
     * 汽车款式
     */
    protected String type = null;

    /**
     * 构造汽车对象
     */
    public Car() {
    }

    /**
     * 构造汽车对象
     * @param id 汽车编号
     * @param type 汽车款式
     */
    public Car(int id, String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * 获得汽车编号
     * @return 汽车编号
     */
    public int getId() {
        return this.id;
    }

    /**
     * 获得汽车款式
     * @return 汽车款式
     */
    public String getType() {
        return this.type;
    }
}

/**
 * 汽车销售人员类
 */
class Saler {
    /**
     * 姓名
     */
    protected String name = null;

    public List<Car> cars = new ArrayList<Car>();

    /**
     * 构造销售汽车人员对象
     */
    public Saler() {
    }

    /**
     * 构造汽车销售人员对象
     * @param name 姓名
     */
    public Saler(String name) {
        this.name = name;
    }

    /**
     * 获得姓名
     * @return 姓名
     */
    public String getName() {
        return this.name;
    }
}

public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Car> allCar = new ArrayList<Car>();        //待售汽车对象的集合
        allCar.add(new Car(1001, "凯越"));
        allCar.add(new Car(1002, "凯越"));
        allCar.add(new Car(1003, "凯越"));
        allCar.add(new Car(1004, "凯越"));
        allCar.add(new Car(2001, "君威"));
        allCar.add(new Car(2002, "君威"));
        allCar.add(new Car(2003, "君威"));
        allCar.add(new Car(2004, "君威"));
        allCar.add(new Car(2005, "君威"));

        Saler saler = new Saler("张三其");

        int choice = 0;
        int type;          //销售车型
        int num;           //销售数量
        while(true) {
            System.out.println("请选择销售方式");
            System.out.println("按车辆销售：\t1");
            System.out.println("按车型销售：\t2");
            System.out.println("查看销售情况：\t3");
            System.out.println("退出：\t\t0");
            System.out.print("您的选择：");
            choice = scan.nextInt();

            switch(choice) {
                case 0:                    //退出系统
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
                case 1:                    //按车辆销售
                    for(Car car : allCar) {
                        if(! exists(saler.cars, car)) {
                            saler.cars.add(car);
                            System.out.printf("\t售出 %s 1 辆\n", car.getType());
                            break;
                        }
                    }
                    break;
                case 2:                    //按车型销售
                    System.out.print("车型（凯越  0/君威  1）：");
                    type = scan.nextInt();
                    System.out.print("销售数量：");
                    num = scan.nextInt();
                    int c = 0;           //实际销售数量

                    for(Car car : allCar) {
                        if(c >= num) {
                            break;
                        }
                        if(car.getType().equals(type == 0 ? "凯越" : "君威") && ! exists(saler.cars, car)) {
                            saler.cars.add(car);
                            c++;
                        }
                    }

                    if(c < num) {
                        System.out.printf("\t库存不足，实际售出 %s %d 辆\n", type == 0 ? "凯越" : "君威", c);
                    }
                    else {
                        System.out.printf("\t售出 %s %d 辆\n", type == 0 ? "凯越" : "君威", num);
                    }
                    break;
                case 3:                    //查看销售情况
                    System.out.println("\t当前销售情况一览");
                    System.out.printf("\t%10s%10s\n", "汽车款式", "汽车编号");
                    for(Car car : saler.cars) {
                        System.out.printf("\t%10s%10d\n", car.getType(), car.getId());
                    }
                    System.out.println("---------------------------");
                    System.out.printf("\t小计：\t%d 辆\n", saler.cars.size());
                    break;
                default:
                    break;
            }
            try {
                System.in.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    //判断car在cars中是否存在
    public static boolean exists(List<Car> cars, Car car) {
        for(Car c : cars) {
            if(c.getId() == car.getId()) {
                return true;
            }
        }

        return false;
    }
}