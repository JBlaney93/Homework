import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;

    private Book book1;

    private Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Guards! Guards!", "Terry Pratchett", "Fantasy");
        borrower = new Borrower();
        library.addBook(book1);
        library.addBook(book1);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.getCollectionSize());
    }

    @Test
    public void removeBookFromLibraryAddToBorrower(){
        borrower.checkoutBookFromLibrary(library, book1);
        assertEquals(1, borrower.getCollectionSize());
    }
}
