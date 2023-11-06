package 封装继承.test04;

public class Bus extends MotoVehicle {
    int SeatCount; // 座次
    int Daily_rate; // 日租费
    int Pedestrians; // 租车数量

    public int CalcRent(int days) {
        return days*Daily_rate*Pedestrians;
    }

    Bus(int no, int SeatCount) {// no表示租车数量，SeatCount表示车的座位数
        if (SeatCount <= 16)
            Daily_rate = 800;
        else if (SeatCount > 16)
            Daily_rate = 1500;
        this.Pedestrians = no;
    }

}
