package pl.connectis.projektgrupowy.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameOfBook;
    private String author;
    private String borrowed;
    @ManyToOne
    private Client clientBorrowing;

    public Book() {
    }
}
