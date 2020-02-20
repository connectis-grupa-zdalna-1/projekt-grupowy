package pl.connectis.projektgrupowy.service;

import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.repository.BookRepository;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> showBooks() {
      return  bookRepository.findAll();
    }
}
