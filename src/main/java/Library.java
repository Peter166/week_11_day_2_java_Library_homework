import java.util.ArrayList;

public class Library {
    private int maxStock;
    private ArrayList<Book> book;
    public Library(int maxStock){
        this.maxStock = maxStock;
        this.book = new ArrayList<Book>();

    }
    public int bookCount(){
        return this.book.size();
    }

    public void addBook(Book book){
        if (this.bookCount() < this.maxStock) {
            this.book.add(book);
        }
    }

    public Book removeBook(){
        return this.book.remove(0);
    }
}
