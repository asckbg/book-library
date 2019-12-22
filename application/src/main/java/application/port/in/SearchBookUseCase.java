package application.port.in;

import domain.Book;
import domain.ISBN;

import java.util.List;

public interface SearchBookUseCase {
    List<Book> searchBook(SearchBookCommand searchBookCommand);
}
