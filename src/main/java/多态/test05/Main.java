package 多态.test05;
class Employee {
    private int age;
    private String name;
    private String gender;
    private String employeeId;

    public Employee(int age, String name, String gender, String employeeId) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void sayHello() {
        System.out.println("你好，我是" + name + "，工号是" + employeeId);
    }
}

class Manager extends Employee {
    private String qualification;

    public Manager(int age, String name, String gender, String employeeId, String qualification) {
        super(age, name, gender, employeeId);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void assessEmployee(Employee employee, String evaluation, int score) {
        System.out.println("经理 " + getName() + " 对员工 " + employee.getName() + " 进行评价：" + evaluation);
        System.out.println("评分为：" + score);
    }
}

class Staff extends Employee {
    private int popularity;

    public Staff(int age, String name, String gender, String employeeId, int popularity) {
        super(age, name, gender, employeeId);
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }

    public void work() {
        System.out.println("职员 " + getName() + " 正在工作...");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(35, "张经理", "男", "M001", "高级");
        Staff staff = new Staff(28, "李职员", "女", "S001", 80);

        manager.sayHello();
        staff.sayHello();

        manager.assessEmployee(staff, "工作表现良好", 90);

        staff.work();

        System.out.println("经理资历：" + manager.getQualification());
        System.out.println("职员人气值：" + staff.getPopularity());
    }
}