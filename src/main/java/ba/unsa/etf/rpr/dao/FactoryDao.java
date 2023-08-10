package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Appointment;
import jdk.internal.foreign.SystemLookup;

public interface FactoryDao {
    private static final AppointmentDao appointmentDao = AppointmentDaoSQLImpl.getInstance();
    private static final DoctorDao doctorDao = DoctorDaoSQLImpl.getInstance();
    private static final PatientDao patientDao = PatientDaoSQLImpl.getInstance();

    private static final TreatmentDao treatmentDao = TreatmentDaoSQLImpl.getInstance();

    private FactoryDao(){
    }

    public static AppointmentDao appointmentDao(){
        return appointmentDao;
    }

    public static DoctorDao doctorDao() { return doctorDao; }

    public static PatientDao PatientDao(){
        return patientDao;
    }
}
