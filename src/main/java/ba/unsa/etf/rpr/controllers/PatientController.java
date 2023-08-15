package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class PatientController {
    public Label nameId;
    public Label ageId;
    public Label phoneNumberId;
    public TableView appHistoryTable;
    public TableColumn historyDate;
    public TableColumn historyTreatment;
    public TableView appFutureTable;
    public TableColumn futureDate;
    public TableColumn futureTreatment;
    public Button backButton;

    @FXML
    public void initialize() {

    }

    public void goBack(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
}
