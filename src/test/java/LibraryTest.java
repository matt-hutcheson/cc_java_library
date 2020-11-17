import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Borrower borrower;
    @Before
    public void before(){
        this.library = new Library(3);
        this.book = new Book("Children Of Time", "Adrian Tchaikovsky", "Sci-Fi");
        this.borrower = new Borrower("Bob the Learned");
    }
    @Test
    public void libraryHasStock(){
        assertEquals(0, this.library.getStockCount());
    }
    @Test
    public void canAddBookToStock(){
        this.library.addBook(this.book);
        assertEquals(1, this.library.getStockCount());
    }
    @Test
    public void booksDoNotExceedCapacity(){
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        assertEquals(3, this.library.getStockCount());
    }
    @Test
    public void canLendBook(){
        this.library.addBook(this.book);
        this.library.lendBook(this.book, this.borrower);
        assertEquals(0, this.library.getStockCount());
        assertEquals(1, this.borrower.booksCount());
    }
}
