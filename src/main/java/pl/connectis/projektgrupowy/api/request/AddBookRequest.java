package pl.connectis.projektgrupowy.api.request;

public class AddBookRequest {
    private Long id;
    private String nameOfBook;
    private String author;

    public Long getId() { return id;   }

    public void setId(Long id) { this.id = id;   }

    public String getNameOfBook() { return nameOfBook;    }

    public void setNameOfBook(String nameOfBook) {this.nameOfBook = nameOfBook; }

    public String getAuthor() {return author; }

    public void setAuthor(String author) { this.author = author;  }

    public String getBorrowed() {return borrowed;}

    public void setBorrowed(String borrowed) { this.borrowed = borrowed;  }

    private String borrowed;

}
