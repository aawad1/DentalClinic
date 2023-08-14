package ba.unsa.etf.rpr.dao;

public class AppointmentDaoSQLImpl {

    private static AppointmentDaoSQLImpl instance = null;

    public static AppointmentDaoSQLImpl getInstance(){
        if(instance == null)
            instance = new AppointmentDaoSQLImpl();
        return instance;
    }
}
