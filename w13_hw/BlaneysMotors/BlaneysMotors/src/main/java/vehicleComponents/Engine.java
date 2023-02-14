package vehicleComponents;

public class Engine {

    private double engineSize;
    private String engineType;

    public Engine(double engineSize, String engineType) {
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getEngineType() {
        return engineType;
    }
}
