package pl.connectis.projektgrupowy.domain;

import javax.persistence.*;

@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameOfBook;
    private String author;
    private String borrowed;

    public Book() {
    }

    public Book(String nameOfBook, String author, String borrowed) {

        this.nameOfBook = nameOfBook;
        this.author = author;
        this.borrowed = borrowed;
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

    public String getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book))
            return false;
        Book other = (Book) o;
        return id != null && id.equals(other.getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {

        return "Book{" +
                "id=" + id +
                ", nameOFBook'" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", borrowed='" + borrowed + '\'' +
                '}';
    }


}
