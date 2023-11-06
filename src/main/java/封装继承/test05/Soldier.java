package 封装继承.test05;

public class Soldier extends Person {
    private String unit;
    private String rank;
    private int yearsOfService;

    public Soldier(String name, int age, String unit, String rank, int yearsOfService) {
        super(name, age);
        this.unit = unit;
        this.rank = rank;
        this.yearsOfService = yearsOfService;
    }

    // Getters and setters
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}