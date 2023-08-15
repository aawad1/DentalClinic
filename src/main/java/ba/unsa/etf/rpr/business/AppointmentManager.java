package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.util.List;

public class AppointmentManager implements Manager<Appointment> {
    @Override
    public Appointment getById(int id) throws DentalClinicException {
        return null;
    }

    @Override
    public List<Appointment> getAll() throws DentalClinicException {
        return FactoryDao.appointmentDao().getAll();
    }

    @Override
    public void delete(int id) throws DentalClinicException {

    }

    @Override
    public void update(Appointment item) throws DentalClinicException {

    }

    @Override
    public void add(Appointment item) throws DentalClinicException {

    }
}
