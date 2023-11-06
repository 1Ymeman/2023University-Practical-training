package 封装继承.test05;

public class Doctor extends Person {
    private String department;
    private String position;

    public Doctor(String name, int age, String department, String position) {
        super(name, age);
        this.department = department;
        this.position = position;
    }

    // Getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}