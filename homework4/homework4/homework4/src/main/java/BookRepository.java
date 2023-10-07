import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();

    Book getBookById(int bookId);

    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(int bookId);
}