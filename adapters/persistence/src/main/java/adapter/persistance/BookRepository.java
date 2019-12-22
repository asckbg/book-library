package adapter.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookJpaEntity, String> {

    List<BookJpaEntity> findByTitle(String title);
}
