package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Doctor;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class PatientDaoSQLImpl extends AbstractDao<Patient> implements PatientDao {
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

    @Override
    public Patient row2object(ResultSet rs) throws DentalClinicException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Patient object) {
        return null;
    }

    @Override
    public List<Patient> searchByDoctor(Doctor doctor) {
        return null;
    }

    @Override
    public List<Patient> searchByNameAndUin(String name, Long UIN) {
        return null;
    }

    @Override
    public List<Patient> searchByName(String name) {
        return null;
    }
}
