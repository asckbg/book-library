package adapter.persistance;

import application.port.out.SearchBookPort;
import domain.Book;
import domain.ISBN;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter(AccessLevel.PRIVATE)
public class BookPersistenceAdapter implements SearchBookPort {

    private final BookRepository bookRepository;


    @Override
    public List<Book> searchByTitle(String title) {
        return getBookRepository().findByTitle(title);
    }

    @Override
    public Book searchByISBN(ISBN isbn) {
        return null;
    }
}
