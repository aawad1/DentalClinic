package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.TreatmentManager;
import ba.unsa.etf.rpr.controllers.components.ActionsCellFactoryTreatment;
import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TreatmentsController {
    public TableView<Treatment> treatmentsTable;
    public TableColumn idColumn;
    public TableColumn nameColumn;
    public TableColumn costColumn;
    public TableColumn descriptionColumn;
    public TableColumn<Treatment, Void> actionsColumn;
    public Button newTreatmentButton;
    public Button homeButton;
    public Button refreshButton;
    private TreatmentManager treatmentManager = new TreatmentManager();


    @FXML
    public void initialize() {
        try{
        idColumn.setCellValueFactory(new PropertyValueFactory<Treatment, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Treatment, String>("name"));
        costColumn.setCellValueFactory(new PropertyValueFactory<Treatment, Double>("cost"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<Treatment, String>("description"));
        actionsColumn.setCellFactory(new ActionsCellFactoryTreatment());

            refreshTreatments();
        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }


    private void refreshTreatments() {
        try {
            treatmentsTable.setItems(FXCollections.observableList(treatmentManager.getAll()));
            treatmentsTable.refresh();
        } catch (DentalClinicException e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }

    public void gotoNewTreatment(ActionEvent actionEvent) {
            System.out.println("novi tretman--->");
            try {
                new OpenNewWindow().openDialog("New Treatment", "/NewTreatment.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
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
    public void refresh(ActionEvent actionEvent) {
        refreshTreatments();
    }
}
