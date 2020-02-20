package pl.connectis.projektgrupowy.service;

import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;

import java.util.List;

public interface ClientService {

    Book borrowBook(Long bookId, Long clientId);

    List<Book> showBorrowedBooks();

    Book returnBorrowedBook(Book bookId);

    Client logoutUser(Client uderId);

    Client borroweMaxTwoBooks();
}
