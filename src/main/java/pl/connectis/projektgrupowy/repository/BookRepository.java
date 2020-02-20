package pl.connectis.projektgrupowy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.connectis.projektgrupowy.domain.Book;

import java.util.List;

@Repository
public interface  BookRepository extends JpaRepository<Book,Long> {
    @Override
    List<Book> findAll();
}
