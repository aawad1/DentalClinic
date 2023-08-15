package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Treatment;

import java.util.List;

public interface TreatmentDao extends Dao<Treatment>{
    List<Treatment> getAll();

    Treatment searchByName(String name);
}
