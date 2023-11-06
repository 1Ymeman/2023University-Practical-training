package 封装继承.test05;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三", 30);
        person.work();

        Doctor doctor = new Doctor("李四", 35, "内科", "主治医生");
        doctor.work();
        System.out.println("所在科室：" + doctor.getDepartment());
        System.out.println("职务：" + doctor.getPosition());

        Soldier soldier = new Soldier("王五", 25, "陆军", "中士", 5);
        soldier.work();
        System.out.println("部队：" + soldier.getUnit());
        System.out.println("职务：" + soldier.getRank());
        System.out.println("军龄：" + soldier.getYearsOfService() + "年");
    }
}