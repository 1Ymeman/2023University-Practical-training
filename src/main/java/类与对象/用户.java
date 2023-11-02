package 类与对象;

import java.util.Date;
//上机任务4：(类和对象)
//某公司要开发“天天灌水论坛”，请使用面向对象的思想，设计注册用户信息
//参考分析思路：
//用户类：
//属性:
//用户昵称，密码，性别，年龄，注册时间，等级
//方法：个人信息展示
public class 用户 {
    private String 用户昵称;
    private String 密码;
    private String 性别;
    private int 年龄;
    private Date 注册时间;
    private int 等级;

    public 用户(String 用户昵称, String 密码, String 性别, int 年龄, Date 注册时间, int 等级) {
        this.用户昵称 = 用户昵称;
        this.密码 = 密码;
        this.性别 = 性别;
        this.年龄 = 年龄;
        this.注册时间 = 注册时间;
        this.等级 = 等级;
    }

    public String get用户昵称() {
        return 用户昵称;
    }

    public void set用户昵称(String 用户昵称) {
        this.用户昵称 = 用户昵称;
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public int get年龄() {
        return 年龄;
    }

    public void set年龄(int 年龄) {
        this.年龄 = 年龄;
    }

    public Date get注册时间() {
        return 注册时间;
    }

    public void set注册时间(Date 注册时间) {
        this.注册时间 = 注册时间;
    }

    public int get等级() {
        return 等级;
    }

    public void set等级(int 等级) {
        this.等级 = 等级;
    }
//个人信息展示  方法
    public void 个人信息展示() {
        System.out.println("用户昵称：" + 用户昵称);
        System.out.println("性别：" + 性别);
        System.out.println("年龄：" + 年龄);
        System.out.println("注册时间：" + 注册时间);
        System.out.println("等级：" + 等级);
    }
//主方法调用个人信息展示
    public static void main(String[] args) {
        用户 用户1 = new 用户("张三", "123456", "男", 25, new Date(), 1);
        用户1.个人信息展示();

        用户 用户2 = new 用户("李四", "abcdef", "女", 30, new Date(), 2);
        用户2.个人信息展示();
    }
}