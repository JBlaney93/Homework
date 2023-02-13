package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorOld;
    Visitor visitorYoung;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorYoung = new Visitor(15, 125.00, 5.00);
        visitorOld = new Visitor(31, 180.00, 200.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyIfOver18(){
        assertEquals(true, tobaccoStall.isAllowedToVisit(visitorOld));
    }

    @Test
    public void canNotBuyIfUnder18(){
        assertEquals(false, tobaccoStall.isAllowedToVisit(visitorYoung));
    }
}
