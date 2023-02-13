package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorYoungAndTall;
    Visitor visitorOldAndTall;
    Visitor visitorYoungAndShort;
    Visitor visitorOldAndShort;
    Visitor visitorOldAndMedium;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorYoungAndTall = new Visitor(11, 155.00, 5.00);
        visitorOldAndTall = new Visitor(31, 201.00, 200.00);
        visitorYoungAndShort = new Visitor(10, 125.00, 5.00);
        visitorOldAndShort = new Visitor(44, 130.00, 6000.00);
        visitorOldAndMedium = new Visitor(44, 170.00, 60.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideOldEnoughAndTallEnough(){
        assertEquals(true, rollerCoaster.isAllowedToVisit(visitorOldAndTall));
    }

    @Test
    public void cannotRideOldEnoughButTooShort(){
        assertEquals(false, rollerCoaster.isAllowedToVisit(visitorOldAndShort));
    }

    @Test
    public void cannotRideTooYoungButTallEnough(){
        assertEquals(false, rollerCoaster.isAllowedToVisit(visitorYoungAndTall));
    }

    @Test
    public void cannotRideTooYoungAndTooShort(){
        assertEquals(false, rollerCoaster.isAllowedToVisit(visitorYoungAndShort));
    }

    @Test
    public void chargedDoubleForBeingTall(){
        assertEquals(16.80, rollerCoaster.priceFor(visitorOldAndTall), 0.01);
    }

    @Test
    public void chargedNormalFareForCorrectHeight(){
        assertEquals(8.40, rollerCoaster.priceFor(visitorOldAndMedium), 0.01);
    }

}
