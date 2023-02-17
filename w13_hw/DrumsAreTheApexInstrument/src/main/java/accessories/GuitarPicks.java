package accessories;

public class GuitarPicks extends Accessories{

    private String colour;


    public GuitarPicks(double boughtPrice, double sellPrice, String colour) {
        super(boughtPrice, sellPrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
