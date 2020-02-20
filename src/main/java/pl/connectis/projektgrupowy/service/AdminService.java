package pl.connectis.projektgrupowy.service;

import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Admin;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.User;

import java.util.List;
@Service

    public interface AdminService {
        List<User> showUsers();

        User addUser();
        User deleteUser();
        Book addBook();
        Book deleteBook();
        List<Book>showBook();
        Admin logOut();

    }

