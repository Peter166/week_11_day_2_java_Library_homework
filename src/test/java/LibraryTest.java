import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


        private Library library;
        private Book book;

        @Before
        public void before(){
            library = new Library(2);
            book = new Book("","","");
        }

        @Test
        public void canBookCount(){
            library.addBook(book);
            library.addBook(book);
            assertEquals(2, library.bookCount());
        }
        @Test
    public void canAddBook(){

            library.addBook(book);
            assertEquals(1, library.bookCount());
        }
    }


