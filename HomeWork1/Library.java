package DZ1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    //Управление книгами
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    //Управление читателями
    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(int readerId) {
        readers.removeIf(r -> r.getReaderId() == readerId);
    }

    public Reader findReader(int readerId) {
        for (Reader r : readers) {
            if (r.getReaderId() == readerId) {
                return r;
            }
        }
        return null;
    }

    //Выдача книги
    public boolean issueBook(String isbn, int readerId) {
        Book book = findBook(isbn);
        Reader reader = findReader(readerId);

        if (book == null) {
            System.out.println("Книга не найдена.");
            return false;
        }
        if (reader == null) {
            System.out.println("Читатель не найден.");
            return false;
        }

        if (book.borrow()) {
            reader.borrowBook(book);
            System.out.println("Книга '" + book + "' выдана читателю " + reader + ".");
            return true;
        }

        System.out.println("Нет доступных экземпляров!");
        return false;
    }

    //Возврат книги
    public boolean returnBook(String isbn, int readerId) {
        Book book = findBook(isbn);
        Reader reader = findReader(readerId);

        if (book != null && reader != null) {
            book.returnBook();
            reader.returnBook(book);
            System.out.println("Читатель " + reader + " вернул книгу '" + book + "'.");
            return true;
        }

        System.out.println("Ошибка возврата!");
        return false;
    }
}
