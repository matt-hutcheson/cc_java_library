import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    @Before
    public void before(){
        borrower = new Borrower("Bob the Learned");
        book = new Book("Children Of Time", "Adrian Tchaikovsky", "Sci-Fi");
    }
    @Test
    public void hasName() {
        assertEquals("Bob the Learned", this.borrower.getName());
    }
    @Test
    public void canCheckBooksBorrowed(){
        assertEquals(0,this.borrower.booksCount());
    }
    @Test
    public void canAddBook(){
        this.borrower.borrowBook(this.book);
        assertEquals(1, this.borrower.booksCount());
    }
}
