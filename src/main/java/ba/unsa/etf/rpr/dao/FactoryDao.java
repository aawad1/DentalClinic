package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;

/**
 * Factory method for singleton implementation of DAOs
 *
 * @author  Abdullah Awad
 */
public class DaoFactory {

    private static final AppointmentDao categoryDao = CategoryDaoSQLImpl.getInstance();
    private static final QuoteDao quoteDao = QuoteDaoSQLImpl.getInstance();
    private static final QuoteHistoryDao quoteHistoryDao = QuoteHistoryDaoSQLImpl.getInstance();
    private DaoFactory(){
    }

    public static CategoryDao categoryDao(){
        return categoryDao;
    }

    public static QuoteDao quoteDao(){
        return quoteDao;
    }

    public static QuoteHistoryDao quoteHistoryDao(){
        return quoteHistoryDao;
    }

}



