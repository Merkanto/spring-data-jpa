package merkanto.springdatajpa.jdbc.repositories;

import merkanto.springdatajpa.jdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findBookByTitle(String title);

    Book readByTitle(String title);

    @Nullable
    Book getByTitle(@Nullable String title);
}
