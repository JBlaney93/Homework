package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.Tyre;

public class CombustionCar extends Car {
    public CombustionCar(String make, String model, String colour, double price, Engine engine, Tyre tyre) {
        super(make, model, colour, price, engine, tyre);
    }
}
