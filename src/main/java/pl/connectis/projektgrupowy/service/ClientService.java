package pl.connectis.projektgrupowy.service;

import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;

import java.util.List;
import java.util.Set;

public interface ClientService {

    Book borrowBook(Long bookId, Long clientId);

  Set<Book> showBorrowedBooks(Long clientId);

  void returnBorrowedBook(Long clientId,Long bookId);

    Client logoutUser(Client uderId);


}
