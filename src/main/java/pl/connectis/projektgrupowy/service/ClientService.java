package pl.connectis.projektgrupowy.service;

import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.User;

import java.util.List;

public interface ClientService {

    List<Book> showBooks();

    Book borrowBook(Integer id);

    List<Book> showBorrowedBooks();

    Book returnBorrowedBook(Book bookId);

    User logoutUser(User uderId);

    User borroweMaxTwoBooks();
}
