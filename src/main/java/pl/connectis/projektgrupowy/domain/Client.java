package pl.connectis.projektgrupowy.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Client {
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
   
    private String firstName;
    private String email;
    
    
    
    @OneToMany(mappedBy = "clientBorrowing",cascade = CascadeType.ALL)
    private Set<Book> books;

    public Client() {
    }
    public Set<Book> getBooks() {
        return books;
    }
    
    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    public Client(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
}
