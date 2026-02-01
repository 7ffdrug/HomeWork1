package DZ1;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private int readerId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(String name, int readerId) {
        this.name = name;
        this.readerId = readerId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public int getReaderId() {
        return readerId;
    }

    @Override
    public String toString() {
        return "Reader: " + name + ", ID: " + readerId;
    }
}
