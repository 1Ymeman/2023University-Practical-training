package 封装继承.test04;

public abstract class MotoVehicle {
    String No; // 车牌号
    String Brand; // 品牌
    String Color; // 颜色
    int Mileage; // 里程
    int num;
    public abstract int CalcRent(int days);// 计算租金

}
