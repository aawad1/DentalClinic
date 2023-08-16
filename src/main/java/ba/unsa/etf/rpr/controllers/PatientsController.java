package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.PatientManager;
import ba.unsa.etf.rpr.controllers.components.ActionsCellFactory;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PatientsController {

    public TableColumn idColumn;
    public TableColumn nameColumn;
    public TableColumn ageColumn;
    public TableColumn phoneNumberColumn;
    public TableColumn<Patient, Void> actionsColumn;
    public TableView<Patient> patientsTable;
    public Button newPatientButton;
    public Button homeButton;
    private final PatientManager patientManager = new PatientManager();


    public void initialize() {
        try {
            idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
            ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
            phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
            actionsColumn.setCellFactory(new ActionsCellFactory());

            refreshPatients();
        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
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
        System.out.println("klikk--->");
        try {
            new OpenNewWindow().openDialog("New Patient", "/NewPatient.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }

    }

    public void goHome(ActionEvent actionEvent) {
        System.out.println("idiKucii--->");
        try {
            new OpenNewWindow().openDialog("Home", "/Home.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }
}
