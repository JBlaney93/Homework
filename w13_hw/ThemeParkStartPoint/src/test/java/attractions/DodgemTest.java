package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorYoung = new Visitor(11, 145.00, 5.00);
        visitorOld = new Visitor(31, 201.00, 200.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canBeChargedHalfPriceUnder12(){
        assertEquals(2.25, dodgems.priceFor(visitorYoung), 0.01);
    }

    @Test
    public void canBeChargedFullPriceOver12(){
        assertEquals(4.50, dodgems.priceFor(visitorOld), 0.01);
    }
}
