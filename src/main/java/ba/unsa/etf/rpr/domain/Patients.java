package ba.unsa.etf.rpr.domain;

import java.util.ArrayList;
import java.util.List;

public class Patients {
    private List<Patient> patientList;

    public Patients() {
        patientList = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
