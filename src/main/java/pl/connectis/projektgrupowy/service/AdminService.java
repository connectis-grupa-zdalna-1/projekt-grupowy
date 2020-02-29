package pl.connectis.projektgrupowy.service;

import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.exceptione.NoBookIDException;
import pl.connectis.projektgrupowy.exceptione.NoClientIDException;
import pl.connectis.projektgrupowy.repository.BookRepository;

import java.util.List;

public interface AdminService {
Client addClient();
void removeClient(Long id) throws NoClientIDException;
List<Client> showClient();
Book addBook();
void removeBook(Long id) throws NoBookIDException;
List<Book> showBooks();




}
