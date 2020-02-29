package pl.connectis.projektgrupowy.service;

import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.exceptione.NoBookIDException;
import pl.connectis.projektgrupowy.exceptione.NoBorrowedBooksException;
import pl.connectis.projektgrupowy.exceptione.NomoreNooksException;

import java.util.List;
import java.util.Set;

public interface ClientService {

    Book borrowBook(Long bookId, Long clientId) throws NomoreNooksException;

  Set<Book> showBorrowedBooks(Long clientId) throws NoBorrowedBooksException;

  void returnBorrowedBook(Long clientId,Long bookId) throws NoBookIDException;

    Client logoutUser(Client uderId);


}
