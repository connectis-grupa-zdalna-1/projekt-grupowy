package pl.connectis.projektgrupowy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.exceptione.NoBookIDException;
import pl.connectis.projektgrupowy.exceptione.NoBorrowedBooksException;
import pl.connectis.projektgrupowy.exceptione.NomoreNooksException;
import pl.connectis.projektgrupowy.service.ClientServiceImpl;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Set;

@Controller
@RestController
public class ClientController {

//    Może przejrzeć książki wypożyczone
//    Może zwrócić książkę
//    Może się wylogować
//    Może wypożyczyć maksymalnie 2 książki

@Autowired
    private ClientServiceImpl clientServiceImpl;

    public ClientController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @PostMapping(value = "/books/borrow")
    public ResponseEntity<Book> borrowBook(
            @PathParam("bookId") Long bookId,
            @PathParam("clientId") Long clientId) throws NomoreNooksException {
        Book borrowedBook = clientServiceImpl.borrowBook(bookId, clientId);
        return borrowedBook==null? ResponseEntity.notFound().build() : ResponseEntity.ok(borrowedBook);
    }
   
   
   
    @RequestMapping("/showborrowed/{clientId}")
    @ResponseBody
    public Set<Book> showBorrowedBooks(@PathVariable Long  clientId) throws NoBorrowedBooksException {
        return clientServiceImpl.showBorrowedBooks(clientId);
    
    }
    
    @RequestMapping("/return/{client}/{book}")
    @ResponseBody

    public void returnBorrowedBook(@PathVariable Long clientId,@PathVariable Long bookId) throws NoBookIDException {
      clientServiceImpl.returnBorrowedBook(clientId,bookId);
      
    }
    


}
