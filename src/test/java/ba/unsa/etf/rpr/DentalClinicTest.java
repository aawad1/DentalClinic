/*
import ba.unsa.etf.rpr.business.PatientManager;
import ba.unsa.etf.rpr.dao.*;
import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.domain.Doctor;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DentalClinicTest {



    private PatientManager patientManager;
    private Patient patient;
    @Mock
    private PatientDaoSQLImpl patientDaoSQLMock;
    private List<Patient> patientList;


    @BeforeEach
    public void setUp() {
        patient = new Patient();
        patient.setName("Kerim Kera");
        patient.setId(150687);

        patientDaoSQLMock = Mockito.mock(PatientDaoSQLImpl.class);
        patientList.addAll(Arrays.asList(new Patient("Mujo", 40, "456789"), new Patient("Kerim", 33, "13579")));
    }

    @Test
    public void testGetAllPatients() throws DentalClinicException {
        List<Patient> expectedPatients = Arrays.asList(new Patient(), new Patient());



    }

    }

    @Test
    public void testAddAppointment() throws DentalClinicException {

    }

    @Test
    public void testCalculateTotalCost() {
        Treatment treatment1 = new Treatment();
        treatment1.setCost(100.0);
        Treatment treatment2 = new Treatment();
        treatment2.setCost(150.0);
        List<Treatment> treatments = Arrays.asList(treatment1, treatment2);



        assertEquals(expectedTotalCost, actualTotalCost);
    }

    @Test
    public void testGetPatientByName() {
        String patientName = "Hamza Hamo";
        Patient expectedPatient = new Patient(patientName);
        when(patientDaoMock.getByName(patientName)).thenReturn(patientName);

        Doctor actualDoctor = dentalClinic.getDoctorByName(doctorName);

        assertEquals(expectedDoctor, actualDoctor);
    }

    @Test
    public void testMockitoUsage() throws DentalClinicException {
        Patient patient = new Patient();
        when(patientList.getById(1)).thenReturn(patient);

        Patient actualPatient = dentalClinic.getById(1);

        assertEquals(patient, actualPatient);
        verify(patientDaoMock).getPatientById(1);
    }

    @Test
    void addNewPatient() {
        Patient newPatient = new Patient("Hamza Hamo", 23, "123456");

    }
}
*/