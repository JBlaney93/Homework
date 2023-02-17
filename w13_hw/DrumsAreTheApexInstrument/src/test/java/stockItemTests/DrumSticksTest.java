package stockItemTests;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks sticks;

    @Before
    public void setup(){
        sticks = new DrumSticks(5.00, 12.00, "5B");
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(5.00, sticks.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(12.00, sticks.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour(){
        assertEquals("5B", sticks.getSize());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(7.00, sticks.getMarkUp(), 0.01);
    }
}
