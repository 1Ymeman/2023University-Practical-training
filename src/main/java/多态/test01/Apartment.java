package 多态.test01;

public class Apartment extends House {

    int floor;


    public Apartment() {

        super();

// TODO Auto-generated constructor stub

    }


    public Apartment(String name, float price, String location, float area,

                     int floor) {

        super(name, price, location, area);

// TODO Auto-generated constructor stub

        this.floor = floor;

    }


    public String buy() {

        return "楼房: " + this.name + "\n价格: " + this.price + "\n地址: "

                + this.location + "\n面积: " + this.area + "\n层数: " + this.floor;

    }


}
