package pl.connectis.projektgrupowy.service;

import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.User;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {


    @Override
    public Book borrowBook(Integer id) {
        return null;
    }

    @Override
    public List<Book> showBorrowedBooks() {
        return null;
    }

    @Override
    public Book returnBorrowedBook(Book bookId) {
        return null;
    }

    @Override
    public User logoutUser(User uderId) {
        return null;
    }

    @Override
    public User borroweMaxTwoBooks() {
        return null;
    }
}
