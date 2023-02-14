import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyre;
import vehicles.Car;
import vehicles.CombustionCar;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private ArrayList carsInStock;
//    private ArrayList<Car> carsInStock2;
    private CombustionCar combustionCar;
    private ElectricCar electricCar;
    private HybridCar hybridCar;
    private Engine combustionEngine;
    private Engine electricEngine;
    private Engine hybridEngine;
    private Tyre tyres;

    @Before
    public void setup(){
        carsInStock = new ArrayList<Car>();
        dealership = new Dealership(carsInStock, 10000000);
//        carsInStock2 = Arrays.asList(combustionCar, electricCar, hybridCar);

        combustionEngine = new Engine(1.8, "Combustion");
        electricEngine = new Engine(1, "Electric");
        hybridEngine = new Engine(2.0, "Hybrid");

        combustionCar = new CombustionCar("BMW", "M3", "Silver", 27000, combustionEngine, tyres);
        electricCar = new ElectricCar("Tesla", "3", "White", 60000, electricEngine, tyres);
        hybridCar = new HybridCar("Audi", "Q5", "Black", 35000, hybridEngine, tyres);

        carsInStock.add(combustionCar);
        carsInStock.add(electricCar);
        carsInStock.add(hybridCar);
    }

    @Test
    public void canGetTill(){
        assertEquals(10000000, dealership.getTill(), 0.01);
    }

    @Test
    public void canGetCarsInStock3(){
        assertEquals(3, dealership.getCarsInStock().size());
    }

    @Test
    public void canAddCarToStock(){
        dealership.addCarsToStock(combustionCar);
        assertEquals(4, dealership.getCarsInStock().size());
    }

    @Test
    public void canRemoveCarFromStock(){
        dealership.removeCarFromStock(combustionCar);
        assertEquals(2, dealership.getCarsInStock().size());
    }

}
