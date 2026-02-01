package DZ1;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Книги
        Book b1 = new Book("1984", "George Orwell", "111", 3);
        Book b2 = new Book("The Hobbit", "Tolkien", "222", 1);

        library.addBook(b1);
        library.addBook(b2);

        // Читатели
        Reader r1 = new Reader("Alice", 1);
        Reader r2 = new Reader("Bob", 2);

        library.registerReader(r1);
        library.registerReader(r2);

        // Выдача книг
        library.issueBook("111", 1);  // OK
        library.issueBook("222", 1);  // OK
        library.issueBook("222", 2);  // Нет экземпляров

        // Возврат
        library.returnBook("222", 1);

        // Повторная попытка
        library.issueBook("222", 2);  // Теперь OK
    }
}
