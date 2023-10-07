import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@DisplayName("Тесты BookService")
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    @DisplayName("Получение книг")
    public void testGetAllBooks() {
        List<Book> mockBooks = new ArrayList<>();
        mockBooks.add(new Book(1, "Книга 1", "Автор 1", 2022));
        mockBooks.add(new Book(2, "Книга 2", "Автор 2", 2023));

        when(bookRepository.getAllBooks()).thenReturn(mockBooks);

        List<Book> result = bookService.getAllBooks();

        assertEquals(mockBooks, result);
    }

    @Test
    @DisplayName("Получение книги по ID")
    public void testGetBookById() {
        Book mockBook = new Book(1, "Книга 1", "Автор 1", 2022);

        when(bookRepository.getBookById(1)).thenReturn(mockBook);

        Book result = bookService.getBookById(1);

        assertEquals(mockBook, result);
    }

    @Test
    @DisplayName("Добавление")
    public void testAddBook() {

        Book newBook = new Book(3, "Книга 3", "Автор 3", 2024);

        bookService.addBook(newBook);

        verify(bookRepository).addBook(newBook);
    }

    @Test
    @DisplayName("Обновление")
    public void testUpdateBook() {
        Book updatedBook = new Book(1, "Обновление Книги 1", "Обновление Автора 1", 2025);

        bookService.updateBook(updatedBook);

        verify(bookRepository).updateBook(updatedBook);
    }

    @Test
    @DisplayName("Удаление")
    public void testDeleteBook() {
        bookService.deleteBook(1);

        verify(bookRepository).deleteBook(1);
    }
}