package stock;

import interfaces.ISell;

public abstract class Instrument extends StockItem implements ISell {

    private InstrumentType instrumentType;

    public Instrument(double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        super(boughtPrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType.getType();
    }

    @Override
    public double markUp() {
        return getSellPrice() - getBoughtPrice();
    }
}
