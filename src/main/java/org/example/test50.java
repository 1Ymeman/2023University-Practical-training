package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//【程序50】
//题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
// 计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件 "stud "中。
public class test50 {

//这个程序允许您输入五个学生的信息（学号、姓名和三门课的成绩），然后计算平均成绩，并将所有数据保存到名为 "stud.txt" 的磁盘文件中。
// 程序使用 Student 类来表示学生信息，包括学号、姓名、课程成绩和平均成绩。
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Student[] students = new Student[5]; // 创建一个包含5个学生对象的数组

            for (int i = 0; i < students.length; i++) {
                System.out.println("学生 " + (i + 1) + " 的信息：");
                System.out.print("学号: ");
                int id = scanner.nextInt();
                System.out.print("姓名: ");
                String name = scanner.next();
                System.out.print("课程1成绩: ");
                double grade1 = scanner.nextDouble();
                System.out.print("课程2成绩: ");
                double grade2 = scanner.nextDouble();
                System.out.print("课程3成绩: ");
                double grade3 = scanner.nextDouble();

                students[i] = new Student(id, name, grade1, grade2, grade3); // 创建学生对象并存储到数组中
            }

            calculateAverage(students); // 计算学生的平均成绩

            saveToDisk(students); // 保存数据到磁盘文件

            System.out.println("成绩数据已保存到磁盘文件 \"stud.txt\" 中。");
        }

        // 计算学生的平均成绩
        public static void calculateAverage(Student[] students) {
            for (Student student : students) {
                double average = (student.getGrade1() + student.getGrade2() + student.getGrade3()) / 3.0;
                student.setAverage(average);
            }
        }

        // 保存学生数据到磁盘文件
        public static void saveToDisk(Student[] students) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("stud.txt"))) {
                for (Student student : students) {
                    writer.write(student.toString());
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 学生类，表示学生的信息
    class Student {
        private int id;
        private String name;
        private double grade1;
        private double grade2;
        private double grade3;
        private double average;

        public Student(int id, String name, double grade1, double grade2, double grade3) {
            this.id = id;
            this.name = name;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
        }

        public double getGrade1() {
            return grade1;
        }

        public double getGrade2() {
            return grade2;
        }

        public double getGrade3() {
            return grade3;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "学号: " + id + ", 姓名: " + name + ", 课程1: " + grade1 + ", 课程2: " + grade2 + ", 课程3: " + grade3 + ", 平均成绩: " + average;
        }




}
