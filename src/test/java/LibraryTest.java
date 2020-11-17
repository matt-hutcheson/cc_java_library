import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    @Before
    public void before(){
        this.library = new Library(3);
        this.book = new Book("Children Of Time", "Adrian Tchaikovsky", "Sci-Fi");
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
}
