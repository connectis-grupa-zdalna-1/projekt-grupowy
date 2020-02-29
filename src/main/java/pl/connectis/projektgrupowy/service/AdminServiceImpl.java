package pl.connectis.projektgrupowy.service;


import org.springframework.stereotype.Service;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.exceptione.NoBookIDException;
import pl.connectis.projektgrupowy.exceptione.NoClientIDException;
import pl.connectis.projektgrupowy.repository.BookRepository;
import pl.connectis.projektgrupowy.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService
{
	BookRepository bookRepository;
	ClientRepository clientRepository;
	
	@Override
	public Client addClient() {
		Client client=clientRepository.save(new Client());
return client;
	}
	@Override
	public void removeClient(Long id) throws NoClientIDException {
		Optional<Client> client=clientRepository.findById(id);
		if(client.isPresent()){
			clientRepository.delete(client.get());
			
		}
		else throw new NoClientIDException();
		
	}
	@Override
	public List<Client> showClient(){
		List<Client> clientlist=clientRepository.findAll();
		return clientlist;
	}
	@Override
	public Book addBook(){
		Book book=bookRepository.save(new Book());
		return book;
		
		
	}
	@Override
	public void removeBook(Long id) throws NoBookIDException {
		Optional<Book> book=bookRepository.findById(id);
		if(book.isPresent()){
		bookRepository.delete(book.get());
		
		}
		else throw new NoBookIDException();
		
	}
	@Override
	public List<Book> showBooks(){
		List<Book> booklist=bookRepository.findAll();
		return booklist;
		
	}
	
}
