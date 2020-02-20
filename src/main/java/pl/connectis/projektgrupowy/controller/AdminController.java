package pl.connectis.projektgrupowy.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.connectis.projektgrupowy.api.request.AddUserRequest;
import pl.connectis.projektgrupowy.domain.Book;
import pl.connectis.projektgrupowy.domain.User;
import pl.connectis.projektgrupowy.service.AdminServiceImpl;

import java.util.List;

@Controller
@RestController
public class AdminController {
    private AdminServiceImpl adminService;

    public  AdminController(AdminServiceImpl adminService){this.adminService=adminService;}

    @RequestMapping(value="/user",method= RequestMethod.GET)
    public List<User>showAllUsers(){return adminService.showUsers();}
    @RequestMapping(value="/create",method=RequestMethod.POST)
    public ResponseEntity<User>addUser(@RequestBody AddUserRequest request){
      return null;
    }
    @RequestMapping(value="/book",method=RequestMethod.GET)
    public List<Book>showAllBooks(){return adminService.showBook();}


}
