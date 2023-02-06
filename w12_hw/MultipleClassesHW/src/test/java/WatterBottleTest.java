import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class WatterBottleTest {


    @Test
    public void testVolStartsAt100() {
        WaterBottle bottle = new WaterBottle();
        assertEquals(100, bottle.getVol());
    }

    @Test
    public void testDrinkSubtractsTen() {
        WaterBottle bottle = new WaterBottle();
        assertEquals(90, bottle.drink());
    }

    @Test
    public void testEmptyBottleFunction() {
        WaterBottle bottle = new WaterBottle();
        assertEquals(0, bottle.empty());
    }

    @Test
    public void testRefillBottle() {
        WaterBottle bottle = new WaterBottle();
        bottle.drink();
        bottle.drink();
        assertEquals(100, bottle.fill());
    }
}
