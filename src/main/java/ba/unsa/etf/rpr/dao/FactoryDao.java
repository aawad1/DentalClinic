package ba.unsa.etf.rpr.dao;

public class FactoryDao {
    private static final PatientDao patientDao = PatientDaoSQLImpl.getInstance();
    private static final DoctorDao doctorDao = DoctorDaoSQLImpl.getInstance();
    private static final AppointmentDao appointmentDao = AppointmentDaoSQLImpl.getInstance();
    private static final TreatmentDao treatmentDao = TreatmentDaoSQLImpl.getInstance();

    public FactoryDao(){

    }

    public static PatientDao patientDao() {
        return patientDao;
    }

    public static DoctorDao doctorDao() {
        return doctorDao;
    }

    public static AppointmentDao appointmentDao() {
        return appointmentDao();
    }

    public static TreatmentDao treatmentDao() {
        return treatmentDao();
    }
}
