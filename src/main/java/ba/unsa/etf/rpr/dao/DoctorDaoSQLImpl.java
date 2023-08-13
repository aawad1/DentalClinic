package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Doctor;

public class DoctorDaoSQLImpl extends AbstractDao<Doctor> implements DoctorDao{

    private static DoctorDaoSQLImpl instance = null;
    private DoctorDaoSQLImpl() {
        super("Doctors");
    }

    public static DoctorDao getInstance()  {

        public static DoctorDaoSQLImpl getInstance(){
            if(instance == null)
                instance = new DoctorDaoSQLImpl();
            return instance;
        }

        public static void removeInstance(){
            if(instance!=null)
                instance = null;
        }
}
