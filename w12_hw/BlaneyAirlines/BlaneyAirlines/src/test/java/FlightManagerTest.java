import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private FlightManager flightManager;

    @Before
    public void setup(){
        flightManager = new FlightManager(flight);
    }

//    @Test
//    public void canGetBaggageWeightPerPassenger(){
//        assertEquals(20, flightManager.howMuchBaggagePerPassenger());
//    }
}
