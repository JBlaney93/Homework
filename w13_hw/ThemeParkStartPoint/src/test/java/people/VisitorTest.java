package people;

import attractions.Attraction;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    private Attraction attraction;
    private ArrayList<Attraction> visitedAttractions;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddVisitedAttraction(){
        visitor.visitAttraction(attraction);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}
