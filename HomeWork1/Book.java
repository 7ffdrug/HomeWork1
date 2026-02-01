package DZ1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public boolean isAvailable() {
        return copies > 0;
    }

    public boolean borrow() {
        if (isAvailable()) {
            copies--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        copies++;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return title + " — " + author + " (ISBN: " + isbn + ", copies: " + copies + ")";
    }
}
