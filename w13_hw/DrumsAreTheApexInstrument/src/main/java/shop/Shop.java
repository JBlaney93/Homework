package shop;

import interfaces.ISell;
import stock.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockList;

    public Shop(ArrayList<ISell> stockList){
        this.stockList = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }

    public void setStockList(ArrayList<ISell> stockList) {
        this.stockList = stockList;
    }

    public void addItemToStock(Instrument instrument){
        getStockList().add(instrument);
    }
}
