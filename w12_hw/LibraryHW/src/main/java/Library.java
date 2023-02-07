import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryStock;
    private int stockCapacity;

    public Library(){
        this.libraryStock = new ArrayList<>();
        this.stockCapacity = 5;
    }


    public void addBook(Book book) {
        this.libraryStock.add(book);
    }

    public int getLibraryStock() {
        return this.libraryStock.size();
    }

    public int getStockCapacity() {
        return this.stockCapacity;
    }

    public boolean checkStockFull() {
        if (this.getLibraryStock() >= this.getStockCapacity()) {
            return true;
            } else
            {
            return false;
        }
    }

    public void stockCheckThenAddBook(Book book){
        if (this.getLibraryStock() < this.getStockCapacity()) {
            this.libraryStock.add(book);
        }
    }

    public void removeBook(Book book) {
        this.libraryStock.remove(book);
    }
}
