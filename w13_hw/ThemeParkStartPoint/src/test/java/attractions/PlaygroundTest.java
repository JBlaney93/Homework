package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorYoung = new Visitor(9, 110.00, 5.00);
        visitorOld = new Visitor(27, 160.00, 2.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canVisitIfUnder15(){
        assertEquals(true, playground.isAllowedToVisit(visitorYoung));
    }

    @Test
    public void canNotVisitIfOver15(){
        assertEquals(false, playground.isAllowedToVisit(visitorOld));
    }
}
