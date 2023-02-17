package accessories;

import interfaces.ISell;
import stock.StockItem;

public abstract class Accessories extends StockItem implements ISell{

    public Accessories(double boughtPrice, double sellPrice) {
        super(boughtPrice, sellPrice);
    }

    @Override
    public double markUp() {
        return getSellPrice() - getBoughtPrice();
    }
}
