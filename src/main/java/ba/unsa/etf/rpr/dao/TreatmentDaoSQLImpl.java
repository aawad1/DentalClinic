package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.util.Map;

public class TreatmentDaoSQLImpl extends AbstractDao<Treatment> implements TreatmentDao {

    private static TreatmentDaoSQLImpl instance = null;

    public TreatmentDaoSQLImpl() {
        super();
    }

    @Override
    public Treatment row2object(ResultSet rs) throws DentalClinicException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Treatment object) {
        return null;
    }

    public static TreatmentDaoSQLImpl getInstance(){
        if(instance == null)
            instance = new TreatmentDaoSQLImpl();
        return instance;
    }

    @Override
    public Treatment searchByName(String name) {
        return null;
    }
}
