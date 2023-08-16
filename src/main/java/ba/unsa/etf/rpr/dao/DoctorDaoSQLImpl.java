package ba.unsa.etf.rpr.dao;


import ba.unsa.etf.rpr.domain.Doctor;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class DoctorDaoSQLImpl extends AbstractDao<Doctor> implements DoctorDao{

    private static DoctorDaoSQLImpl instance = null;

    public DoctorDaoSQLImpl(String tableName) {
        super(tableName);
    }
    //private DoctorDaoSQLImpl() { super("Doctors"); }


        public static DoctorDaoSQLImpl getInstance(){
            if(instance == null)
                instance = new DoctorDaoSQLImpl(null);
            return instance;
        }

    @Override
    public Doctor row2object(ResultSet rs) throws DentalClinicException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Doctor object) {
        return null;
    }

    @Override
    public List<Doctor> searchByName(String name) {
        return null;
    }

        /*public static void removeInstance(){
            if(instance!=null)
                instance = null;
        }*/
}
