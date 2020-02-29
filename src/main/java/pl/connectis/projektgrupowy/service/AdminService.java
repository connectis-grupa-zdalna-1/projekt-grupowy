package pl.connectis.projektgrupowy.service;

import pl.connectis.projektgrupowy.domain.Admin;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;

import java.util.List;

public interface AdminService {

    Client addClient(Long clientName);

    Client removeClient(Long clientId);

    List<Client> showAllClient();

    Book addBook(Long bookName);

    Book removeBook(Long bookId);

    List<Book> showAllBooks();

    Admin logoutAdmin(Admin underId);


}

