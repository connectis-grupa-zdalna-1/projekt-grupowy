package pl.connectis.projektgrupowy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.connectis.projektgrupowy.domain.Admin;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.Client;
import pl.connectis.projektgrupowy.service.AdminServiceImpl;


import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RestController
public class AdminController {
//  - Może
//      - dodawać
//      - usuwać
//      - przeglądać
//  użytkowników
//
//   - Może
//      - dodawać
//      - usuwać
//      - przeglądać
//   książki

//   - Może się wylogować

    private AdminServiceImpl adminServiceImpl;

    public AdminController(AdminServiceImpl adminServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
    }

    @PostMapping(value = "/client/add")
    public ResponseEntity<Client> addClient(
            @PathParam("clientEmail") Long clientEmail){
        Client addClient = adminServiceImpl.addClient(clientEmail);
        return addClient==null? ResponseEntity.notFound().build() : ResponseEntity.ok(addClient);
    }

    @PostMapping(value = "/client/{id}/remove")
    public ResponseEntity<Client> removeClient(
            @PathVariable Long id) {
        Client removeClient = adminServiceImpl.removeClient(id);
        return ResponseEntity.ok(removeClient);
    }

    @GetMapping(value = "/client")
    public List<Client> showAllClient() {
        return adminServiceImpl.showAllClient();
    }

    @PostMapping(value = "/book/add")
    public ResponseEntity<Book> addBook(
            @PathParam("bookName") Long bookName){
        Book addBook = adminServiceImpl.addBook(bookName);
        return addBook==null? ResponseEntity.notFound().build() : ResponseEntity.ok(addBook);
    }

    @PostMapping(value = "/book/{id}/remove")
    public ResponseEntity<Book> removeBook(
            @PathVariable Long id) {
        Book removeBook = adminServiceImpl.removeBook(id);
        return removeBook==null? ResponseEntity.notFound().build() : ResponseEntity.ok(removeBook);
    }

    @GetMapping(value = "/book")
    public List<Book> showAllBooks() {
        return adminServiceImpl.showAllBooks();
    }

    @PostMapping(value = "/admin/{id}/logout")
    public ResponseEntity<Admin> logoutAdmin(
            @PathVariable Admin id) {
        Admin logoutAdmin = adminServiceImpl.logoutAdmin(id);
        return logoutAdmin==null? ResponseEntity.notFound().build() : ResponseEntity.ok(logoutAdmin);
    }


}