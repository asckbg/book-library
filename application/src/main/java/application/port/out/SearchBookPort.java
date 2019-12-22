package application.port.out;

import domain.Book;
import domain.ISBN;

import java.util.List;

public interface SearchBookPort {
    List<Book> searchByTitle(String title);

    Book searchByISBN(ISBN isbn);
}
