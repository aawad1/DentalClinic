package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AppointmentDaoSQLImpl extends AbstractDao<Appointment> implements AppointmentDao {

    private static AppointmentDaoSQLImpl instance = null;
    private AppointmentDaoSQLImpl() {
        super("AppointmentsTable");
    }

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
            Patient p = new FactoryDao().patientDao().getById(rs.getInt("patient"));
            appointment.setPatient(p);
            appointment.setDate(rs.getDate("date").toLocalDate());
            appointment.setNotes(rs.getString("notes"));

            return appointment;
        } catch (Exception e){
            throw new DentalClinicException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Appointment object) throws DentalClinicException {

        try {
            Map<String, Object> item = new TreeMap<>();
            item.put("id", object.getId());
            item.put("date", object.getDate());
            item.put("notes", object.getNotes());
            item.put("patient", object.getPatient().getId());

            return item;
        }catch (Exception e){
            try {
                throw new DentalClinicException(e.getMessage(), e);
            } catch (DentalClinicException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public Appointment searchByName(String name) throws DentalClinicException {
        try {
            Patient p = FactoryDao.patientDao().searchByName(name);
            Appointment a = executeQueryUnique("SELECT * FROM AppointmentsTable WHERE patient = ?", new Object[]{p.getId()});
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
