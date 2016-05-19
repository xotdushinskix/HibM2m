package dao;

import table.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by FromxSoul on 19.05.2016.
 */
public interface BookDao {

    void addBook(Book book) throws SQLException;
    void deleteBook(Book book) throws SQLException;
    void editBook(Book book) throws SQLException;
    Book getBook(int bookId) throws SQLException;
    List<Book> getAllBooks() throws SQLException;

}
