package pl.connectis.projektgrupowy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Borrowed {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer numbersOfBooks;

    public Borrowed() {
    }

    public Borrowed(Long id, Integer numbersOfBooks) {
        this.id = id;
        this.numbersOfBooks = numbersOfBooks;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumbersOfBooks() {
        return numbersOfBooks;
    }

    public void setNumbersOfBooks(Integer numbersOfBooks) {
        this.numbersOfBooks = numbersOfBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Borrowed))
            return false;
        Borrowed other = (Borrowed) o;
        return id != null && id.equals(other.getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {

        return "Borrowed{" +
                "id=" + id +
                ", numbersOFBook'" + numbersOfBooks + '\'' +
                '}';
    }
}
