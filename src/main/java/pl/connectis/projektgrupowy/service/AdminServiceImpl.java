package pl.connectis.projektgrupowy.service;

import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Admin;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.User;
import pl.connectis.projektgrupowy.repository.BookRepository;
import pl.connectis.projektgrupowy.repository.UserRepository;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    private BookRepository bookRepository;
    private UserRepository userRepository;
@Override
    public List<User> showUsers() {return null;
    }
    @Override
    public User addUser(){return null;}
    @Override
    public User deleteUser(){return null;}
  @Override
    public Book addBook(){return null;}

    @Override
    public Book deleteBook() {
        return null;
    }

    @Override
    public List<Book> showBook() {
        return null;
    }

    @Override
    public Admin logOut() {
        return null;
    }
}
