package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.time.LocalDate;

public interface AppointmentDao extends Dao<Appointment> {
    Appointment searchByName(String name) throws DentalClinicException;

    Appointment searchByDate(LocalDate date) throws DentalClinicException;
}
