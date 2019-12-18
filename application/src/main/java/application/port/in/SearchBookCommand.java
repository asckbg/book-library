package application.port.in;

import domain.ISBN;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class SearchBookCommand {
    private final SearchCriteria searchCriteria;
    private final String searchValue;

    public SearchBookCommand(SearchCriteria searchCriteria, String searchValue) {
        this.searchCriteria = searchCriteria;
        this.searchValue = searchValue;
        this.validate();
        
    }

    private void validate() {
    }
}
