package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Patient;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class NewPatientController {
    public TextField name;
    public TextField age;
    public TextField phoneNumber;
    public Button savePatient;
    private Patient patient = new Patient();

    public void addNewPatient(ActionEvent actionEvent) {
        patient.setName(name.getText());
        patient.setAge(Integer.parseInt(age.getText()));
        patient.setPhoneNumber(phoneNumber.getText());

    }
}
