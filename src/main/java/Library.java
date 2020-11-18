import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }
    public int getStockCount(){
        return this.books.size();
    }
    public void addBook(Book book){
        if (this.getStockCount() < this.capacity) {
            this.books.add(book);
        }
    }
    public void lendBook(Book book, Borrower borrower){
        if (this.books.contains(book)) {
            borrower.borrowBook(book);
            this.books.remove(book);
        }
    }
}
