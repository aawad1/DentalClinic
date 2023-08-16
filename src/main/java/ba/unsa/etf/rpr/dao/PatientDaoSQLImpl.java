package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class PatientDaoSQLImpl extends AbstractDao<Patient> implements PatientDao {
    private static PatientDaoSQLImpl instance = null;

    private PatientDaoSQLImpl() {
        super("PatientsTable");
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
    public Patient row2object(ResultSet rs) throws DentalClinicException, SQLException {
        try{
            Patient patient = new Patient();
            patient.setId(rs.getInt("id"));
            patient.setNotes(rs.getString("Notes"));
            patient.setName(rs.getString("Name"));
            patient.setAge(rs.getInt("Age"));
            patient.setPhoneNumber(rs.getString("phoneNumber"));

            //patient.setId(rs.getInt(1));
            //patient.setName(rs.getString(2));
            //patient.setAge(rs.getInt(3));
            //patient.setPhoneNumber(rs.getString(4));
            //patient.setNotes(rs.getString(5));

            return patient;
        } catch (Exception e){
            throw new DentalClinicException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Patient object) {
        return null;
    }

    @Override
    public Patient searchByName(String name) throws DentalClinicException {
        return executeQueryUnique("SELECT * FROM PatientsTable WHERE Name = ?", new Object[]{name});
    }
}
