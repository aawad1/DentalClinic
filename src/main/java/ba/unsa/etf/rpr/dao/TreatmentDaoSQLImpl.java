package ba.unsa.etf.rpr.dao;

public class TreatmentDaoSQLImpl {

    private static TreatmentDaoSQLImpl instance = null;
    public static TreatmentDaoSQLImpl getInstance(){
        if(instance == null)
            instance = new TreatmentDaoSQLImpl();
        return instance;
    }
}
