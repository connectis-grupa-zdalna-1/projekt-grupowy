package pl.connectis.projektgrupowy.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.repository.BookRepository;
import pl.connectis.projektgrupowy.repository.ClientRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    BookRepository bookRepository;
    ClientRepository clientRepository;

    public ClientServiceImpl(BookRepository bookRepository, ClientRepository clientRepository) {
        this.bookRepository = bookRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public Book borrowBook(Long bookId, Long clientId) {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        if (optionalClient.isPresent() && optionalBook.isPresent()) {
            Client client = optionalClient.get();
            Set<Book> bookSet = client.getBooks();
            bookSet.add(optionalBook.get());
            client.setBooks(bookSet);
            clientRepository.save(client);
            return optionalBook.get();
        }
        return null;
    }

    @Override
    public Set<Book> showBorrowedBooks(Long clientId) {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        if (optionalClient.isPresent()) {
            Client existingClient = optionalClient.get();
            if (!existingClient.getBooks().isEmpty()) {
                return existingClient.getBooks();
            }
        }
        return null;
    }


    @Override
    public Book returnBorrowedBook(Book bookId) {
        return null;
    }

    @Override
    public Client logoutUser(Client uderId) {
        return null;
    }

    @Override
    public Client borroweMaxTwoBooks() {
        return null;
    }
}
