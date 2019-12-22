package application.service;

import application.port.in.SearchBookCommand;
import application.port.in.SearchBookUseCase;
import application.port.in.SearchCriteria;
import application.port.out.SearchBookPort;
import domain.Book;
import domain.ISBN;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
class SearchBookService implements SearchBookUseCase {

    private final SearchBookPort searchBookPort;

    @Override
    public List<Book> searchBook(SearchBookCommand searchBookCommand) {
        List<Book> books = new ArrayList<>();
        if (searchBookCommand.getSearchCriteria().equals(SearchCriteria.ISBN)){
            books.add(searchBookPort.searchByISBN(new ISBN(searchBookCommand.getSearchValue())));
        }else {
            books.addAll(searchBookPort.searchByTitle(searchBookCommand.getSearchValue()));
        }
        return books;
    }
}
