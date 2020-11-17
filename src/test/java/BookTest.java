import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;
    @Before
    public void before(){
        book = new Book("Children Of Time", "Adrian Tchaikovsky", "Sci-Fi");
    }
    @Test
    public void hasTitle(){
        assertEquals("Children Of Time", this.book.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("Adrian Tchaikovsky", this.book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Sci-Fi", this.book.getGenre());
    }


}
