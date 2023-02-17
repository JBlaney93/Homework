package accessories;

import interfaces.ISell;
import stock.StockItem;

public abstract class Accessories extends StockItem {

    public Accessories(double boughtPrice, double sellPrice) {
        super(boughtPrice, sellPrice);
    }
}
