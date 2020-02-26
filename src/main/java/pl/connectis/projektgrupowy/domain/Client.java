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

    public Client(String firstName, String email, Set<Book> books) {
        this.firstName = firstName;
        this.email = email;
        this.books = books;
    }
}
