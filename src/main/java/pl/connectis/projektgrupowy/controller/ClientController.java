package pl.connectis.projektgrupowy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.service.ClientServiceImpl;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Set;

@Controller
@RestController
public class ClientController {




    private ClientServiceImpl clientServiceImpl;

    public ClientController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @PostMapping(value = "/books/borrow")
    public ResponseEntity<Book> borrowBook(
            @PathParam("bookId") Long bookId,
            @PathParam("clientId") Long clientId) {
        Book borrowedBook = clientServiceImpl.borrowBook(bookId, clientId);
        return borrowedBook==null? ResponseEntity.notFound().build() : ResponseEntity.ok(borrowedBook);
    }

    @GetMapping(value = "/books/showBorrowed", produces = "application/json")
    public ResponseEntity<Set<Book>> showBorrowBooks(
            @PathParam("clientId") Long clientId) {
        Set<Book> clientBorrowedBooks = clientServiceImpl.showBorrowedBooks(clientId);
        return clientBorrowedBooks == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(clientBorrowedBooks);
    }
}
