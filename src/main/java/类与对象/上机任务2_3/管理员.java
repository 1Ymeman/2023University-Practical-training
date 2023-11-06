package 类与对象.上机任务2_3;

//上机任务2：(类和对象)
//创建两个管理员类对象，输出他们的相关信息
// 下面是使用Java创建两个管理员类对象并输出相关信息
// （包括姓名和密码）的示例代码：

// 文件名：管理员.java
// 编程语言：Java

//上机任务3：(类和对象)
//输入旧的用户名和密码，如果正确，方有权限更新
//从键盘获取新的密码，进行更新
import java.util.Scanner;

public class 管理员 {
    private String 姓名;
    private String 密码;

    public 管理员(String 姓名, String 密码) {
        this.姓名 = 姓名;
        this.密码 = 密码;
    }

    public String get姓名() {
        return 姓名;
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 创建两个管理员对象
        管理员 管理员1 = new 管理员("admin1", "123456");
        管理员 管理员2 = new 管理员("admin2", "222222");

        // 输出管理员的相关信息
        System.out.println("管理员1的姓名：" + 管理员1.get姓名());
        System.out.println("管理员1的密码：" + 管理员1.get密码());
        System.out.println("管理员2的姓名：" + 管理员2.get姓名());
        System.out.println("管理员2的密码：" + 管理员2.get密码());

        // 输入旧的用户名和密码进行验证
        System.out.print("请输入旧的用户名：");
        String 输入的用户名 = scanner.nextLine();
        System.out.print("请输入旧的密码：");
        String 输入的密码 = scanner.nextLine();

        // 验证用户名和密码是否正确
        if (输入的用户名.equals(管理员1.get姓名()) && 输入的密码.equals(管理员1.get密码())) {
            System.out.print("请输入新的密码：");
            String 新密码 = scanner.nextLine();
            管理员1.set密码(新密码);
            System.out.println("密码已成功更新！");
        } else {
            System.out.println("旧的用户名或密码不正确，无法更新密码！");
        }

        scanner.close();
    }
}