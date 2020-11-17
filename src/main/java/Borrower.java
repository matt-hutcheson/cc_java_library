import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
