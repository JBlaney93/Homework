package stockItemTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import stock.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;
    private InstrumentType instrumentType;

    @Before
    public void setup(){

        guitar = new Guitar(100.00, 200.00, instrumentType.STRING, 7, "Ibanez", "White");
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(100, guitar.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(200, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(7, guitar.getStrings());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Ibanez", guitar.getBrand());
    }

    @Test
    public void canGetColour(){
        assertEquals("White", guitar.getColour());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(100, guitar.getMarkUp(), 0.01);
    }
}
