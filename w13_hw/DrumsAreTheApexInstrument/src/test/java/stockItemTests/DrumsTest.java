package stockItemTests;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;
import stock.InstrumentType;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    private InstrumentType instrumentType;

    @Before
    public void setup(){

        drums = new Drums(250, 1000, InstrumentType.PERCUSSION, 5, "Mapex", "Matte Black");
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(250, drums.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(1000, drums.getSellPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Percussion", drums.getInstrumentType());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(5, drums.getPieces());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Mapex", drums.getBrand());
    }

    @Test
    public void canGetColour(){
        assertEquals("Matte Black", drums.getColour());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(750, drums.getMarkUp(), 0.01);
    }
}
