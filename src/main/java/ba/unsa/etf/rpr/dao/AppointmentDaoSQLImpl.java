package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Map;

public class AppointmentDaoSQLImpl extends AbstractDao<Appointment> implements AppointmentDao {

    private static AppointmentDaoSQLImpl instance = null;

    public static AppointmentDaoSQLImpl getInstance(){
        if(instance == null)
            instance = new AppointmentDaoSQLImpl();
        return instance;
    }

    @Override
    public Appointment row2object(ResultSet rs) throws DentalClinicException {
        try{
            Appointment appointment = new Appointment();
            appointment.setId(rs.getInt("id"));
            appointment.setPatient(FactoryDao.patientDao().getById(rs.getInt("id")));
            appointment.setDate(rs.getDate("date").toLocalDate());
            appointment.setNotes(rs.getString("notes"));

            return appointment;
        } catch (Exception e){
            throw new DentalClinicException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Appointment object) {
        return null;
    }

    @Override
    public Appointment searchByName(String name) throws DentalClinicException {
        return executeQueryUnique("SELECT * FROM PatientsTable WHERE Name = ?", new Object[]{name});
    }

    @Override
    public Appointment searchByDate(LocalDate date) throws DentalClinicException {
        return executeQueryUnique("SELECT * FROM PatientsTable WHERE dateTime = ?", new Object[]{date});
    }
}
