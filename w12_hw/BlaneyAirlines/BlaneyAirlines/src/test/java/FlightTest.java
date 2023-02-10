import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private Plane plane;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private CabinCrewMember attendant;
    private CabinCrewMember officer;
    private Passenger passenger;

    @Before
    public void setup(){
        pilot = new Pilot("Jim", Rank.CAPTAIN, "101");
        plane = new Plane(PlaneType.BLANEY747);
        passenger = new Passenger("Louise", 2);
        attendant = new CabinCrewMember("Courtney", Rank.FLIGHT_ATTENDANT);
        officer = new CabinCrewMember("Lee", Rank.FIRST_OFFICER);
        crew = new ArrayList<>();
        passengers = new ArrayList<>();
        flight = new Flight(
                        pilot,
                        plane,
                        "BA666",
                        "SYD",
                        "GLA",
                        "10/03/23 10:00AM"
        );
    }

    @Test
    public void flightHasPilot(){
        assertEquals("Jim", flight.getPilot());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger, passengers);
        assertEquals(1, passengers.size());
    }

    @Test
    public void canRemovePassenger(){
        flight.addPassenger(passenger, passengers);
        flight.removePassenger(passenger, passengers);
        assertEquals(0, passengers.size());
    }

    @Test
    public void canAddCrewMember(){
        flight.addCrewMember(attendant, crew);
        assertEquals(1, crew.size());
    }

    @Test
    public void canAddMultipleCrewMembers(){
        flight.addCrewMember(attendant, crew);
        flight.addCrewMember(officer, crew);
        assertEquals(2, crew.size());
    }

    @Test
    public void canRemoveCrewMember(){
        flight.addCrewMember(attendant, crew);
        flight.removeCrewMember(attendant, crew);
        assertEquals(0, crew.size());
    }

    @Test
    public void canGetRemainingSeats(){
        flight.addPassenger(passenger, passengers);
        assertEquals(9,flight.getRemainingSeats(plane, passengers));
    }

}
