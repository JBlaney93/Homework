package vehicleComponents;

public class Tyre {

    private String condition;
    private String make;
    private String season;

    public Tyre(String condition, String make, String season) {
        this.condition = condition;
        this.make = make;
        this.season = season;
    }

    public String getCondition() {
        return condition;
    }

    public String getMake() {
        return make;
    }

    public String getSeason() {
        return season;
    }
}
