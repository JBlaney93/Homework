import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Guards! Guards!", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getLibraryStock());
    }

    @Test
    public void canAddMultipleBooks(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(3, library.getLibraryStock());
    }

    @Test
    public void libraryHasStockLimit(){
        assertEquals(5, library.getStockCapacity());
    }

    @Test
    public void checkIfStockFull(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(true, library.checkStockFull());
    }

    @Test
    public void checkIfStockNotFull(){
        assertEquals(false, library.checkStockFull());
    }

    @Test
    public void checkIfStockNotFullAndAddBook(){
        library.stockCheckThenAddBook(book1);
        assertEquals(1, library.getLibraryStock());
    }

    @Test
    public void checkIfStockFullAndDoNotAddBook(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.stockCheckThenAddBook(book1);
        assertEquals(5, library.getLibraryStock());
    }
}
