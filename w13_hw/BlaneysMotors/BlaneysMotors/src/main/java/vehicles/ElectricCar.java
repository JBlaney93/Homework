package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.Tyre;

public class ElectricCar extends Car {
    public ElectricCar(String make, String model, String colour, double price, Engine engine, Tyre tyre) {
        super(make, model, colour, price, engine, tyre);
    }
}
