package merkanto.springdatajpa.jdbc.dao;

import merkanto.springdatajpa.jdbc.domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAllBooks();

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);

}
