import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int getCollectionSize() {
        return this.collection.size();
    }

    public void checkoutBookFromLibrary(Library library, Book book) {
        library.removeBook(book);
        this.collection.add(book);
    }
}
