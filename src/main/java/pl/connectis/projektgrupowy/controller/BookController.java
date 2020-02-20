package pl.connectis.projektgrupowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.service.BookService;
import pl.connectis.projektgrupowy.service.BookServiceImpl;

import java.util.List;

@Controller
@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> showAllBooks() {
        return bookService.showBooks();
    }
}
