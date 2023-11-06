package 封装继承.test03;

public class Student {
    private int studentNumber;
    private String name;
    private String gender;
    private int age;
    private Class currentClass;

    public Student(int studentNumber, String name, String gender, int age, Class currentClass) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.currentClass = currentClass;
    }

    public void study() {
        System.out.println("学生信息：姓名-" + name + "，学号-" + studentNumber + "，年龄-" + age);
        System.out.println("所在班级信息：");
        currentClass.introduceClass("加油，努力学习！");
    }
}