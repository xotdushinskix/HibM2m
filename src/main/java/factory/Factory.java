package factory;

import dao.AuthorDao;
import dao.BookDao;
import daoImpl.AuthorDaoImpl;
import daoImpl.BookDaoImpl;

/**
 * Created by FromxSoul on 19.05.2016.
 */
public class Factory {

    private static AuthorDao authorDao = null;
    private static BookDao bookDao = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }


    public static synchronized AuthorDao getAutorDao() {
        if (authorDao == null) {
            authorDao = new AuthorDaoImpl();
        }
        return authorDao;
    }


    public static synchronized BookDao getBookDao() {
        if (bookDao == null) {
            bookDao = new BookDaoImpl();
        }
        return bookDao;
    }

}
