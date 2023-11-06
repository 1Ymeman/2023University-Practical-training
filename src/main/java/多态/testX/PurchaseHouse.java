package 多态.testX;


/**
 * @author lgj
 * @date 2023/11/6 15:48
 */

public class PurchaseHouse {
    /**
     * 房子类，抽象类
     * 属性：名称、价格、位置、面积
     * 方法: 购买（抽象方法）
     */
    public abstract class House {
        private String name;
        private float price;
        private String location;
        private float area;

        public House(String name, float price, String location, float area) {
            this.name = name;
            this.price = price;
            this.location = location;
            this.area = area;
        }

        public abstract void purchase();
    }

    /**
     * 别墅类
     * 属性：名称、价格、位置、面积、花园数量
     * 方法：购买（抽象方法）
     */
    public class Villa extends House {
        private int gardenNum;

        public Villa(String name, float price, String location, float area, int gardenNum) {
            super(name, price, location, area);
            this.gardenNum = gardenNum;
        }

        @Override
        public void purchase(){

        }
    }

    /**
     * 楼房
     * 属性：名称、价格、位置、面积、楼层
     * 方法：购买（抽象方法）
     */
    public class Building extends House{
        private int floor;

        public Building(String name, float price, String location, float area, int floor) {
            super(name, price, location, area);
            this.floor = floor;
        }

        @Override
        public void purchase() {

        }
    }

    public static void main(String[] args) {

    }
}
