import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyre;
import vehicles.Car;
import vehicles.CombustionCar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ArrayList<Car> carsOwned;
    private CombustionCar combustionCar;
    private Engine combustionEngine;
    private Tyre tyres;

    @Before
    public void setup(){
        carsOwned = new ArrayList<>();
        tyres = new Tyre("New", "Goodyear", "Summer");
        combustionEngine = new Engine(1.8, "Combustion");
        combustionCar = new CombustionCar("Lamborghini", "Countach", "Yellow", 1000000, combustionEngine, tyres);
        customer = new Customer("Jimmy", 1600000, carsOwned);
    }

    @Test
    public void canGetCustomerName(){
        assertEquals("Jimmy", customer.getName());
    }

    @Test
    public void canGetCustomerMoney(){
        assertEquals(1600000, customer.getCashMoney(), 0.01);
    }

    @Test
    public void canGetCustomerCars(){
        assertEquals(0, customer.getCarsOwned().size());
    }

    @Test
    public void canAddCarToOwned(){
        customer.addCar(carsOwned, combustionCar);
        assertEquals(1, customer.getCarsOwned().size());
    }
}
