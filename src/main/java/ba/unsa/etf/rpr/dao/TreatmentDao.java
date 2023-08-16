package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.util.List;

public interface TreatmentDao extends Dao<Treatment>{
    List<Treatment> getAll() throws DentalClinicException;

    Treatment searchByName(String name) throws DentalClinicException;
}
