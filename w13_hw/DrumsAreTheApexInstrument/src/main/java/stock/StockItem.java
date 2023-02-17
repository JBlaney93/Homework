package stock;

public abstract class StockItem {

    private double boughtPrice;
    private double sellPrice;

    public StockItem(double boughtPrice, double sellPrice) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getMarkUp() {
        return sellPrice - boughtPrice;
    }
}
