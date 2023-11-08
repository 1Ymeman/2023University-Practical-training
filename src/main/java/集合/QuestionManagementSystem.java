package 集合;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionManagementSystem {
    private List<QuestionInfo> questionList;

    public QuestionManagementSystem() {
        questionList = new ArrayList<>();
        // 初始化试题信息，可以从数据库中读取或手动添加
        // ...
    }

    public void displayMainMenu() {
        System.out.println("试题信息管理系统主菜单");
        System.out.println("1) 列出所有试题信息");
        System.out.println("2) 按科目查询");
        System.out.println("3) 按题干模糊查询");
        System.out.println("4) 添加试题");
        System.out.println("5) 删除试题");
        System.out.println("6) 退出系统");
        System.out.print("请选择操作：");
    }

    public void listAllQuestions() {
        // 列出所有试题信息的实现
        // ...
    }

    public void searchBySubject(String subject) {
        // 按科目查询试题的实现
        // ...
    }

    public void searchByQuestion(String question) {
        // 按题干模糊查询试题的实现
        // ...
    }

    public void addQuestion() {
        // 添加试题的实现
        // ...
    }

    public void deleteQuestion(int questionId) {
        // 删除试题的实现
        // ...
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMainMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // 清除输入缓冲区的换行符

            switch (choice) {
                case 1:
                    listAllQuestions();
                    break;
                case 2:
                    System.out.print("请输入科目：");
                    String subject = scanner.nextLine();
                    searchBySubject(subject);
                    break;
                case 3:
                    System.out.print("请输入题干：");
                    String question = scanner.nextLine();
                    searchByQuestion(question);
                    break;
                case 4:
                    addQuestion();
                    break;
                case 5:
                    System.out.print("请输入要删除的试题编号：");
                    int questionId = scanner.nextInt();
                    deleteQuestion(questionId);
                    break;
                case 6:
                    System.out.println("退出系统");
                    break;
                default:
                    System.out.println("无效的选择，请重新输入");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    public static void main(String[] args) {
        QuestionManagementSystem system = new QuestionManagementSystem();
        system.run();
    }
}