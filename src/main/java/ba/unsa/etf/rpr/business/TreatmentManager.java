package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.util.List;

public class TreatmentManager implements Manager<Treatment> {
    @Override
    public Treatment getById(int id) throws DentalClinicException {
        return null;
    }

    public Treatment getByName(String name) throws DentalClinicException {
        return (Treatment) FactoryDao.treatmentDao().searchByName(name);
    }

    public List<Treatment> getAll() throws DentalClinicException {
        return FactoryDao.treatmentDao().getAll();
    }

    @Override
    public void delete(int id) throws DentalClinicException {

    }

    @Override
    public void update(Treatment item) throws DentalClinicException {

    }

    @Override
    public void add(Treatment item) throws DentalClinicException {

        if (getByName(item.getName()) != null)
            throw new DentalClinicException("Treatment with name: " + item.getName() + "already exists");

        FactoryDao.treatmentDao().add(item);
    }
}
