package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.PatientManager;
import ba.unsa.etf.rpr.controllers.components.ActionsCellFactory;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PatientsController {
    @FXML
    public BorderPane patientsScene;
    private final PatientManager patientManager = new PatientManager();
    public Button newPatientButton;
    public TableView patientsTable;
    public TableColumn idColumn;
    public TableColumn nameColumn;
    public TableColumn ageColumn;
    public TableColumn phoneNumberColumn;
    public TableColumn actionsColumn;


    public void initialize() {
        idColumn.setCellFactory(new PropertyValueFactory<Patient, String>("id"));
        nameColumn.setCellFactory(new PropertyValueFactory<Patient, String>("Name"));
        ageColumn.setCellFactory(new PropertyValueFactory<Patient, String>("age"));
        phoneNumberColumn.setCellFactory(new PropertyValueFactory<Patient, String>("phoneNumber"));
        actionsColumn.setCellFactory(new ActionsCellFactory());

        refreshPatients();
    }

    private void refreshPatients() {
        try {
            patientsTable.setItems(FXCollections.observableList(patientManager.getAll()));
            patientsTable.refresh();
        } catch (DentalClinicException e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }

    public void gotoNewPatient(ActionEvent actionEvent) {
        try {
            new OpenNewWindow().openDialog("New Patient", "/NewPatient.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        } catch (Exception e){
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }

    }
}
