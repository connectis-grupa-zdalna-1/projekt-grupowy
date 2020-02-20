package pl.connectis.projektgrupowy.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.connectis.projektgrupowy.domain.Book;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository.save(new Book());
    }

    @Test
    public void viewBooks1() {
        List<Book> bookList = bookRepository.findAll();
        Assertions.assertEquals(1, bookList.size());
    }
//
//    @Test
//    public void viewBooks2() {
//        List<Book> bookList = bookRepository.findAll();
//        Assertions.assertEquals(1, bookList.size());
//    }
//
//    @Test
//    public void viewBooks3() {
//        List<Book> bookList = bookRepository.findAll();
//        Assertions.assertEquals(1, bookList.size());
//    }
}
