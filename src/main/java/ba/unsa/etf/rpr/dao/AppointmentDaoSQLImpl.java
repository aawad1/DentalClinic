package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
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
        return null;
    }

    @Override
    public Map<String, Object> object2row(Appointment object) {
        return null;
    }

    @Override
    public Appointment searchByName(String name) {
        return null;
    }
}
