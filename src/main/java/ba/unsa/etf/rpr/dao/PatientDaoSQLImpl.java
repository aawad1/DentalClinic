package ba.unsa.etf.rpr.dao;

public class PatientDaoSQLImpl {
    private static PatientDaoSQLImpl instance = null;

    public PatientDaoSQLImpl() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    /**
     * Factory method for singleton design pattern
     * @return PatientDaoSqlImpl
     */
    public static PatientDaoSQLImpl getInstance(){
        if(instance == null)
            instance = new PatientDaoSQLImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance = null;
    }
}
