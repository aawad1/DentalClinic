package ba.unsa.etf.rpr.dao;


public class DoctorDaoSQLImpl {

    private static DoctorDaoSQLImpl instance = null;
    //private DoctorDaoSQLImpl() { super("Doctors"); }


        public static DoctorDaoSQLImpl getInstance(){
            if(instance == null)
                instance = new DoctorDaoSQLImpl();
            return instance;
        }

        /*public static void removeInstance(){
            if(instance!=null)
                instance = null;
        }*/
}
