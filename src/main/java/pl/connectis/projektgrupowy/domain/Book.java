package pl.connectis.projektgrupowy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import javax.persistence.*;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameOfBook;
    private String author;
    private boolean borrowed;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    public Book() {
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", nameOfBook='").append(nameOfBook).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", borrowed=").append(borrowed);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Book{");
//        sb.append("id=").append(id);
//        sb.append(", nameOfBook='").append(nameOfBook).append('\'');
//        sb.append(", author='").append(author).append('\'');
//        sb.append(", borrowed=").append(borrowed);
//        sb.append(", client=").append(client);
//        sb.append('}');
//        return sb.toString();
//    }
}
