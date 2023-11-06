package 多态.test01;
import java.util.Scanner;


public class House {

    String name;
    float  price;
    String location;
    float  area;

    public House(){

    }

    public House(String name, float price, String location, float area) {
        super();
        this.name = name;
        this.price = price;
        this.location = location;
        this.area = area;
    }

    public String buy(){
        return "";
    }

}


