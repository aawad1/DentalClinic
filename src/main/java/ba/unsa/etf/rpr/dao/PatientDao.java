package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

public interface PatientDao extends Dao<Patient>{

        /**
         * Method that lists out the patients that have the specified
         * name and password
         * @param name of the patient
         * @return list of patients that have the same name and password
         */

        Patient searchByName(String name) throws DentalClinicException;

    }

