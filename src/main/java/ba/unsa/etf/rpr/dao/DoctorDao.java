package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Doctor;

import java.util.List;

public interface DoctorDao extends Dao<Doctor> {
    /**
     * Method that lets you search the Doctors table by doctors name and pasword
     * @param name of the Doctor
     * @param password of the Doctor
     * @return List of Doctors
     */
    List<Doctor> searchByNameAndPassword(String name, String password);

}
