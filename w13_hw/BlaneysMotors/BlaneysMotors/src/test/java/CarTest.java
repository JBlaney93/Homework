import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyre;
import vehicles.Car;
import vehicles.CombustionCar;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine combustionEngine;
    private Tyre tyres;
    private Car combustionCar;

    @Before
    public void setup(){
        tyres = new Tyre("New", "Goodyear", "Summer");
        combustionEngine = new Engine(1.8, "Combustion");
        combustionCar = new CombustionCar("BMW", "M3", "Silver", 27000, combustionEngine, tyres);
    }

    @Test
    public void canGetMake(){
        assertEquals("BMW", combustionCar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("M3", combustionCar.getModel());
    }

    @Test
    public void canGetColour(){
        assertEquals("Silver", combustionCar.getColour());
    }

    @Test
    public void canGetPrice(){
        assertEquals(27000, combustionCar.getPrice(), 0.01);
    }

    @Test
    public void canGetEngineType(){
        assertEquals("Combustion", combustionCar.getEngine().getEngineType());
    }

    @Test
    public void canGetEngineSize(){
        assertEquals(1.8, combustionCar.getEngine().getEngineSize(), 0.01);
    }

    @Test
    public void canGetTyreCondition(){
        assertEquals("New", combustionCar.getTyre().getCondition());
    }

    @Test
    public void canGetTyreMake(){
        assertEquals("Goodyear", combustionCar.getTyre().getMake());
    }
}
