package merkanto.springdatajpa.jdbc.repositories;

import merkanto.springdatajpa.jdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
