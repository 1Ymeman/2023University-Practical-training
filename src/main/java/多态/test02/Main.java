package 多态.test02;

import java.util.Scanner;

abstract class Work {
     String type;
     String name;

    public Work(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public abstract void taskDescription();
}

class TestingWork extends Work {
    private int testCaseCount;
    private int bugCount;

    public TestingWork(String type, String name, int testCaseCount, int bugCount) {
        super(type, name);
        this.testCaseCount = testCaseCount;
        this.bugCount = bugCount;
    }

    @Override
    public void taskDescription() {
        System.out.println("测试工作：" + name);
        System.out.println("工作类型：" + type);
        System.out.println("编写的测试用例个数：" + testCaseCount);
        System.out.println("发现的Bug数量：" + bugCount);
    }
}

class CodingWork extends Work {
    private int linesOfCode;
    private int unresolvedBugCount;

    public CodingWork(String type, String name, int linesOfCode, int unresolvedBugCount) {
        super(type, name);
        this.linesOfCode = linesOfCode;
        this.unresolvedBugCount = unresolvedBugCount;
    }

    @Override
    public void taskDescription() {
        System.out.println("编码工作：" + name);
        System.out.println("工作类型：" + type);
        System.out.println("有效编码行数：" + linesOfCode);
        System.out.println("目前没有解决的Bug个数：" + unresolvedBugCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入工作类型（测试工作/编码工作）：");
        String workType = scanner.nextLine();

        if (workType.equals("测试工作")) {
            System.out.print("请输入工作名称：");
            String name = scanner.nextLine();
            System.out.print("请输入编写的测试用例个数：");
            int testCaseCount = scanner.nextInt();
            scanner.nextLine();
            System.out.print("请输入发现的Bug数量：");
            int bugCount = scanner.nextInt();

            Work testingWork = new TestingWork(workType, name, testCaseCount, bugCount);
            testingWork.taskDescription();
        } else if (workType.equals("编码工作")) {
            System.out.print("请输入工作名称：");
            String name = scanner.nextLine();
            System.out.print("请输入有效编码行数：");
            int linesOfCode = scanner.nextInt();
            scanner.nextLine();
            System.out.print("请输入目前没有解决的Bug个数：");
            int unresolvedBugCount = scanner.nextInt();

            Work codingWork = new CodingWork(workType, name, linesOfCode, unresolvedBugCount);
            codingWork.taskDescription();
        } else {
            System.out.println("无效的工作类型！");
        }
    }
}
