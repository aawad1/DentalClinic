package ba.unsa.etf.rpr.dao;

public class FactoryDao {

    public static final PatientDao patientDao = PatientDaoSQLImpl.getInstance();
    public static final DoctorDao doctorDao = DoctorDaoSQLImpl.getInstance();
    public static final AppointmentDao appointmentDao = AppointmentDaoSQLImpl.getInstance();
    public static final TreatmentDao treatmentDao = TreatmentDaoSQLImpl.getInstance();

    public FactoryDao(){}

    /**
     * Method that returns PatientDao object
     * @return PatientDao
     */
    public static PatientDao patientDao(){
        return patientDao;
    }

    /**
     * Method that returns DoctorDao object
     * @return DoctorDao
     */
    public static DoctorDao doctorDao(){
        return doctorDao;
    }

    /**
     * Method that returns HistoryDao object
     * @return HistoryDao
     */
    public static AppointmentDao appointmentDao(){
        return appointmentDao;
    }

    /**
     * Method that returns DepartmentDao
     * @return DepartmentDao
     */
    public static TreatmentDao treatmentDao(){
        return treatmentDao;
    }

}
