package shop;

import interfaces.ISell;
import stock.Instrument;
import stock.StockItem;

import java.util.ArrayList;

public class Shop{

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

    public void addItemToStock(ISell instrument){
        getStockList().add(instrument);
    }


    public double getTotalMarkUp(){
       double total = 0;

        for (ISell item : stockList) {
            total += item.markUp();
        } return total;
    }


}
