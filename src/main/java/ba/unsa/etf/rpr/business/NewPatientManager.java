package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.util.List;

public class NewPatientManager implements Manager<Patient>{

    @Override
    public Patient getById(int id) throws DentalClinicException {
        return null;
    }

    public List<Patient> getAll() throws DentalClinicException {
        return FactoryDao.patientDao().getAll();
    }

    @Override
    public void delete(int id) throws DentalClinicException {

    }

    @Override
    public void update(Patient item) throws DentalClinicException {

    }

    @Override
    public void add(Patient item) throws DentalClinicException {

    }
}
