package pl.connectis.projektgrupowy.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.exceptione.NoBookIDException;
import pl.connectis.projektgrupowy.exceptione.NoBorrowedBooksException;
import pl.connectis.projektgrupowy.exceptione.NomoreNooksException;
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
    public Book borrowBook(Long bookId, Long clientId) throws NomoreNooksException {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        //added borrow validation
        if (optionalClient.isPresent() && optionalBook.isPresent()&&optionalClient.get().getBooks().size()<2 ){
            Client client = optionalClient.get();
            Set<Book> bookSet = client.getBooks();
            
            bookSet.add(optionalBook.get());
            client.setBooks(bookSet);
            clientRepository.save(client);
            return optionalBook.get();
        }
       throw new NomoreNooksException();
    }

    @Override
    @Transactional
    public Set<Book> showBorrowedBooks(Long clientId) throws NoBorrowedBooksException {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        if(optionalClient.isPresent()){
           
            Client client=optionalClient.get();
            return client.getBooks();
        }
        
        else
    
        throw new NoBorrowedBooksException();
        
       
    }

    @Override
    public void returnBorrowedBook(Long clientId,Long bookId) throws NoBookIDException {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        Optional<Book> optionalBook = bookRepository.findById(bookId);
     if(optionalClient.get().getBooks().contains(optionalBook.get())&&!optionalClient.isPresent()) {
         optionalClient.get().getBooks().remove(optionalBook.get());
         System.out.println("Zwrócono książkę "+optionalBook.get().getNameOfBook());

     }
    throw new NoBookIDException();
     
    }

   

   
}
