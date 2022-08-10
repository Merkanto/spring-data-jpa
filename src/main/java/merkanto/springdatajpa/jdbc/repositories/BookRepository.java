package merkanto.springdatajpa.jdbc.repositories;

import merkanto.springdatajpa.jdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findBookByTitle(String title);
}
