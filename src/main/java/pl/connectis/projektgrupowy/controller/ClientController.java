package pl.connectis.projektgrupowy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.service.ClientServiceImpl;

import java.util.List;

@Controller
@RestController
public class ClientController {


    private ClientServiceImpl clientServiceImpl;

    public ClientController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @PostMapping(value = "/books/{id}/borrow")
    public ResponseEntity<Book> borrowBook(
            @PathVariable Integer id) {
        Book borrowedBook = clientServiceImpl.borrowBook(id);
        return ResponseEntity.ok(borrowedBook);
    }


}
