package pl.connectis.projektgrupowy.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameOfBook;
    private String author;
    boolean borrowed;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client clientBorrowing;

    public Book() {
    }

}
