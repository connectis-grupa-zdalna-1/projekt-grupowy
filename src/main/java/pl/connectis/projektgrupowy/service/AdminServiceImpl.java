package pl.connectis.projektgrupowy.service;

import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Admin;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.repository.AdminRepository;
import pl.connectis.projektgrupowy.repository.BookRepository;
import pl.connectis.projektgrupowy.repository.ClientRepository;

import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class AdminServiceImpl implements AdminService {

    BookRepository bookRepository;
    ClientRepository clientRepository;

    public AdminServiceImpl(BookRepository bookRepository, ClientRepository clientRepository) {
        this.bookRepository = bookRepository;
        this.clientRepository = clientRepository;
    }


    @Override
    @Transactional
    public Client addClient(Long clientEmail) {
        Optional<Client> optionalClient = clientRepository.findById(clientEmail);
        if (optionalClient.isEmpty()) {
            Client client = new Client();
            return clientRepository.save(client);
        }

        return null;
    }

    @Override
    public Client removeClient(Long clientId) {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        if (optionalClient.isPresent()) {
            Client client = optionalClient.get();
            clientRepository.delete(client);
            return removeClient(clientId);
        }
        return null;
    }

    @Override
    public List<Client> showAllClient() {
        return (List<Client>) clientRepository;
    }

    @Override
    public Book addBook(Long id) {
        return null;
    }

    @Override
    public Book removeBook(Long bookId) {
        return null;
    }

    @Override
    public List<Book> showAllBooks() {
        return null;
    }

    @Override
    public Admin logoutAdmin(Admin underId) {
        return null;
    }
}