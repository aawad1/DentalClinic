package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

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
    public Map<String, Object> object2row(Appointment object) throws DentalClinicException {
        Map<String, Object> item = new TreeMap<>();
        item.put("id", object.getId());
        Appointment a = new FactoryDao().appointmentDao().getById(object.getId());
        item.put("patient", a.getPatient().getName());
        item.put("date", object.getDate());
        item.put("notes", object.getNotes());
        return item;
    }

    @Override
    public Appointment searchByName(String name) throws DentalClinicException {
        try {
            Appointment a = executeQueryUnique("SELECT * FROM AppointmentsTable WHERE patient = ?", new Object[]{name});
             return a;
        }catch (DentalClinicException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Appointment searchByDate(LocalDate date) {
    /*    try {
            Appointment a = executeQueryUnique("SELECT * FROM AppointmentsTable WHERE date = ?", new Object[]{date});
            return a;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }*/
        return null;
    }
}
