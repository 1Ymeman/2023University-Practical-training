package 多态.test01;

public class Build extends House {

    int gardon;


    public Build() {

        super();

// TODO Auto-generated constructor stub

    }


    public Build(String name, float price, String location, float area,

                 int gardon) {

        super(name, price, location, area);

// TODO Auto-generated constructor stub

        this.gardon = gardon;

    }


    public String buy() {

        return "别墅: " + this.name + "\n价格: " + this.price + "\n位置: "

                + this.location + "\n面积: " + this.area + "\n花园: " + this.gardon;

    }


}
