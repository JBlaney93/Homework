package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.Tyre;

public class HybridCar extends Car {
    public HybridCar(String make, String model, String colour, double price, Engine engine, Tyre tyre) {
        super(make, model, colour, price, engine, tyre);
    }
}
