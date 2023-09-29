package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.AppointmentManager;
import ba.unsa.etf.rpr.controllers.components.ActionsCellFactoryAppointments;
import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AppointmentsController {
    public TableView appointmentsTable;
    public TableColumn idColumn;
    public TableColumn patientNameColumn;
    public TableColumn dateColumn;
    public TableColumn<Appointment, Void> actionsColumn;
    public Button newAppointmentButton;
    public Button homeButton;
    private final Appointment appointment = new Appointment();
    private final AppointmentManager appointmentManager = new AppointmentManager();
    public Button refreshButton;


    @FXML
    public void initialize() {
        try {
            idColumn.setCellValueFactory(new PropertyValueFactory<Appointment, Integer>("id"));
            patientNameColumn.setCellValueFactory(new PropertyValueFactory<>("patient"));
            //patientNameColumn.setCellValueFactory();
                dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
                actionsColumn.setCellFactory(new ActionsCellFactoryAppointments());

            refreshAppointments();

        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }

    }

    private void refreshAppointments() {
        try {
            appointmentsTable.setItems(FXCollections.observableList(appointmentManager.getAll()));
            appointmentsTable.refresh();
        } catch (DentalClinicException e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }

    public void goHome(ActionEvent actionEvent) {
        System.out.println("idem kuci--->");
        try {
            new OpenNewWindow().openDialog("Home", "/Home.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }

    public void gotoNewAppointment(ActionEvent actionEvent) {
        System.out.println("novi appointment--->");
        try {
            new OpenNewWindow().openDialog("New Appointment", "/NewAppointment.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        } catch (Exception e) {
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }

    }

    public void refresh(ActionEvent actionEvent) {
        refreshAppointments();
    }
}
