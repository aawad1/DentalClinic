package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Treatment;

public interface TreatmentDao extends Dao<Treatment>{
    //List<Treatment> getAll() throws DentalClinicException;

    Treatment searchByName(String name);
}
