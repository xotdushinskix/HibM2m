package table;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FromxSoul on 19.05.2016.
 */
@Entity
@Table(name = "book_m2m")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int booId;

    @Column(name = "title")
    private String bookTitle;

    @Column(name = "genre")
    private String bookGenre;

    @Column(name = "mpn")
    private int bookMPN;

    @Column(name = "stock")
    private int bookStock;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "books", cascade = CascadeType.ALL)
    private List<Author>authors = new ArrayList<Author>();

    public Book() {

    }

    public int getBooId() {
        return booId;
    }

    public void setBooId(int booId) {
        this.booId = booId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getBookMPN() {
        return bookMPN;
    }

    public void setBookMPN(int bookMPN) {
        this.bookMPN = bookMPN;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
