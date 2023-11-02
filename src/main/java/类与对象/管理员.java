package 类与对象;

//上机任务2：(类和对象)
//创建两个管理员类对象，输出他们的相关信息
// 下面是使用Java创建两个管理员类对象并输出相关信息
// （包括姓名和密码）的示例代码：

// 文件名：管理员.java
// 编程语言：Java


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

    public static void main(String[] args) {
        管理员 管理员1 = new 管理员("admin1", "123456");
        管理员 管理员2 = new 管理员("admin2", "222222");

        System.out.println("姓名：" + 管理员1.get姓名());
        System.out.println("密码：" + 管理员1.get密码());

        System.out.println("姓名：" + 管理员2.get姓名());
        System.out.println("密码：" + 管理员2.get密码());
    }
}
