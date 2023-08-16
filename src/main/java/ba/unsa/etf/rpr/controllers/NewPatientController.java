package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.PatientManager;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class NewPatientController {
    public TextField name;
    public TextField age;
    public TextField phoneNumber;
    public Button savePatient;
    public TextArea notes;
    public Button backButton;
    private Patient patient = new Patient();
    private PatientManager patientManager = new PatientManager();

    public void addNewPatient(ActionEvent actionEvent) {
        try {
            patient.setName(name.getText());
            patient.setAge(Integer.parseInt(age.getText()));
            patient.setPhoneNumber(phoneNumber.getText());
            patient.setNotes(notes.getText());
        } catch (Exception e) {
            OpenNewWindow.alert(Alert.AlertType.ERROR, "ERROR!", "Something went wrong", e.getMessage());
        }

        try {
            patientManager.add(patient);
        } catch (DentalClinicException e) {
            OpenNewWindow.alert(Alert.AlertType.ERROR, "ERROR!", "Something went wrong", e.getMessage());
            throw new RuntimeException(e);
        } finally {
            new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        }
    }

    public void goBack(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
}
