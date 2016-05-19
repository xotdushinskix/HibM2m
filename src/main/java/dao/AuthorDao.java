package dao;

import table.Author;

import java.sql.SQLException;
import java.util.List;


/**
 * Created by FromxSoul on 19.05.2016.
 */
public interface AuthorDao {

    void addAuthor(Author author) throws SQLException;
    void deleteAuthor(Author author) throws SQLException;
    void editAuthor(Author author) throws SQLException;
    Author getAuthor(int authorId) throws SQLException;
    List<Author> getAllAuthors() throws SQLException;



}
