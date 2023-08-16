package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.sql.ResultSet;
import java.util.Map;
import java.util.TreeMap;

public class TreatmentDaoSQLImpl extends AbstractDao<Treatment> implements TreatmentDao {

    private static TreatmentDaoSQLImpl instance = null;

    private TreatmentDaoSQLImpl() {
        super("TreatmentsTable");
    }

    @Override
    public Treatment row2object(ResultSet rs) throws DentalClinicException {
        try{
            Treatment treatment = new Treatment();
            treatment.setId(rs.getInt("id"));
            treatment.setName(rs.getString("name"));
            treatment.setCost(rs.getDouble("cost"));
            treatment.setDescription(rs.getString("description"));

            return treatment;
        } catch (Exception e){
            throw new DentalClinicException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Treatment object) {
        Map<String, Object> item = new TreeMap<>();
        item.put("id", object.getId());
        item.put("name", object.getName());
        item.put("cost", object.getCost());
        item.put("description", object.getDescription());
        return item;
    }

    public static TreatmentDaoSQLImpl getInstance(){
        if(instance == null)
            instance = new TreatmentDaoSQLImpl();
        return instance;
    }

    @Override
    public Treatment searchByName(String name) throws DentalClinicException {
        return executeQueryUnique("SELECT * FROM PatientsTable WHERE name = ?", new Object[]{name});
    }
}
