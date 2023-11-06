package 封装继承.test03;

public class Main {
    public static void main(String[] args) {
        Class class1 = new Class(1, "一班");
        Class class2 = new Class(2, "二班");

        Student student1 = new Student(1001, "张三", "男", 18, class1);
        Student student2 = new Student(1002, "李四", "女", 19, class2);

        student1.study();
        System.out.println();
        student2.study();
    }
}