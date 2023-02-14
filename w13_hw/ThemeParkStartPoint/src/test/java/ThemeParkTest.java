import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ThemePark themePark;

    private Dodgems dodgems;

    @Before
    public void setup(){
        themePark = new ThemePark();
        dodgems = new Dodgems("cars", 10);
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addAttractionToList(dodgems);
        assertEquals(1, themePark.getAllReviewed().size());
    }
}
