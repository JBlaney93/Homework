package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.Tyre;

public abstract class Car {

    private String make;
    private String model;
    private String colour;
    private double price;
    private Engine engine;
    private Tyre tyre;

    public Car(String make, String model, String colour, double price, Engine engine, Tyre tyre) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

}
