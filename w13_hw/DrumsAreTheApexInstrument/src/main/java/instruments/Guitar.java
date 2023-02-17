package instruments;

import stock.Instrument;
import stock.InstrumentType;

public class Guitar extends Instrument {

    private int strings;
    private String brand;
    private String colour;

    public Guitar(double boughtPrice, double sellPrice, InstrumentType instrumentType,int strings, String brand, String colour) {
        super(boughtPrice, sellPrice, instrumentType);
        this.strings = strings;
        this.brand = brand;
        this.colour = colour;
    }

    public int getStrings() {
        return strings;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }
}
