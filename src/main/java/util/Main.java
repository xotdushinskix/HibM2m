package util;

import dao.AuthorDao;
import dao.BookDao;
import factory.Factory;
import table.Author;
import table.Book;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 19.05.2016.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        HibernateUtil.getSessionFactory();
        Factory factory = Factory.getInstance();
        AuthorDao authorDao = factory.getAutorDao();
        BookDao bookDao = factory.getBookDao();
//
//        Author author = authorDao.getAuthor(1);
//        Book book = bookDao.getBook(1);
//        Book book1 = bookDao.getBook(2);
//
//        author.getBooks().add(book);
//        author.getBooks().add(book1);
//        book.getAuthors().add(author);
//        book1.getAuthors().add(author);
//
//        authorDao.editAuthor(author);
//        bookDao.editBook(book);
//        bookDao.editBook(book1);


        System.out.println("Author 1 books =" + authorDao.getAuthor(1).getBooks());






//
//        Author author1 = new Author();
//        author1.setFirstName("Alan");
//        author1.setLastName("Jackson");
//        authorDao.addAuthor(author1);
//
//        Author author2 = new Author();
//        author2.setFirstName("Kevin");
//        author2.setLastName("Smith");
//        authorDao.addAuthor(author2);
//
//        Author author3 = new Author();
//        author3.setFirstName("Samuel");
//        author3.setLastName("Kendell");
//        authorDao.addAuthor(author3);
//
//
//
//        Book book1 = new Book();
//        book1.setBookTitle("Qwerty");
//        book1.setBookGenre("drama");
//        book1.setBookMPN(3421);
//        book1.setBookStock(21);
//        bookDao.addBook(book1);
//
//        Book book2 = new Book();
//        book2.setBookTitle("Panama");
//        book2.setBookGenre("fantastic");
//        book2.setBookMPN(3214);
//        book2.setBookStock(98);
//        bookDao.addBook(book2);
//
//        Book book3 = new Book();
//        book3.setBookTitle("Pol");
//        book3.setBookGenre("adventure");
//        book3.setBookMPN(8723);
//        book3.setBookStock(56);
//        bookDao.addBook(book3);
//
//        Book book4 = new Book();
//        book4.setBookTitle("Rotty");
//        book4.setBookGenre("philosophy");
//        book4.setBookMPN(4312);
//        book4.setBookStock(29);
//        bookDao.addBook(book4);


    }

}
