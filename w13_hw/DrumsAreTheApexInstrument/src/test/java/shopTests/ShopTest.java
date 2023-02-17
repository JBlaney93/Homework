package shopTests;

import accessories.Accessories;
import accessories.DrumSticks;
import accessories.GuitarPicks;
import instruments.Drums;
import instruments.Guitar;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import stock.Instrument;
import stock.InstrumentType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ArrayList<ISell> stockList;
    private Instrument guitar;
    private Instrument drums;
    InstrumentType instrumentType;
    private Accessories pick;
    private Accessories sticks;

    @Before
    public void setup(){
        stockList = new ArrayList<ISell>();
        shop = new Shop(stockList);
        guitar = new Guitar(100.00, 200.00, instrumentType.STRING, 7, "Ibanez", "White");
        drums = new Drums(250, 1000, InstrumentType.PERCUSSION, 5, "Mapex", "Matte Black");
        pick = new GuitarPicks(0.1, 0.5, "Fluro Green");
        sticks = new DrumSticks(5.00, 12.00, "5B");
        shop.addItemToStock(drums);
        shop.addItemToStock(drums);
    }


    @Test
    public void canAddInstrumentToStockFunction(){
        shop.addItemToStock(guitar);
        assertEquals(3, shop.getStockList().size());
    }

    @Test
    public void canGetTotalMarkUp(){
        assertEquals(1500.00, shop.getTotalMarkUp(), 0.01);
    }

    @Test
    public void canGetMarkUpForMoreStockIncludingAccessories(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar);
        shop.addItemToStock(sticks);
        shop.addItemToStock(sticks);
        shop.addItemToStock(pick);
        shop.addItemToStock(pick);
        shop.addItemToStock(pick);
        assertEquals(1815.2, shop.getTotalMarkUp(), 1.0);
    }

}
