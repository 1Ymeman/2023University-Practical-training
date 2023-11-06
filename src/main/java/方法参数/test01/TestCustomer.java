package 方法参数.test01;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);//定义键盘输入
        Customer cus = new Customer();//创建一个Customers对象，因为我们要使用它的成员方法和成员变量
        /**
         * 做一个判断，每一次输入完后询问是否还要继续输入
         */
        boolean flag = true;//有返回值，当返回值为真时，进行while语句
        while(flag){
            System.out.print("请输入要添加的客户姓名：");
            String addedName = sc.next();
            cus.addName(addedName);//实际参数:实际存在的参数  在调用时需要传递的值
            System.out.print("继续输入吗？(y/n)");
            String con = sc.next();
            if(con.equals("n")){
                flag = false;
            }
        }
        cus.showNames();
        System.out.println("请输入要修改的用户姓名：");
        String oldName = sc.next();
        System.out.println("请输入新的用户姓名：");
        String newName = sc.next();
        System.out.println("修改结果...");
        if(cus.editName(oldName, newName)){//使用if语句，调用之前oldName,newName的方法，并判断是否修改成功
            System.out.println("找到并且成功修改！");
        }else{
            System.out.println("并未找到要修改的用户！请检查输入！");
        }
        cus.showNames();
    }

}