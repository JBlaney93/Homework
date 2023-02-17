package instruments;

import stock.Instrument;
import stock.InstrumentType;

public class Drums extends Instrument {

    private int pieces;
    private String brand;
    private String colour;


    public Drums(double boughtPrice, double sellPrice, InstrumentType instrumentType, int pieces, String brand, String colour) {
        super(boughtPrice, sellPrice, instrumentType);
        this.pieces = pieces;
        this.brand = brand;
        this.colour = colour;
    }

    public int getPieces() {
        return pieces;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }
}
