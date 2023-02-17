package stockItemTests;

import accessories.GuitarPicks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarPicksTest {

    private GuitarPicks pick;

    @Before
    public void setup(){
        pick = new GuitarPicks(0.1, 0.5, "Fluro Green");
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(0.1, pick.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0.5, pick.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour(){
        assertEquals("Fluro Green", pick.getColour());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(0.4, pick.getMarkUp(), 0.01);
    }
}
