package 封装继承.test03;

public class Class {
    private int classNumber;
    private String className;

    public Class(int classNumber, String className) {
        this.classNumber = classNumber;
        this.className = className;
    }

    public void introduceClass(String slogan) {
        System.out.println("班级信息：编号-" + classNumber + "，名称-" + className);
        System.out.println("班级口号：" + slogan);
    }
}