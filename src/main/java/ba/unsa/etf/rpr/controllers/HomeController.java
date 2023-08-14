package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Appointments;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomeController {
    public BorderPane homeScene;
    public Button idDoctors;
    public Button idPatients;
    public Button idAppointments;
    public Button idTreatments;
    public Label appCountLabel;
    public Appointments appointments;

    @FXML
    public void openDoctorWindow(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Doctors", "/Doctors.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }

    public void openPatientWindow(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }

    public void openTreatmentsWindow(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Treatments", "/Treatments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }

    public void openAppointmentsWindow(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Appointments", "/Appointments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }

    public void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.minutes(1), event -> {
            appCountLabel.setText(appCountLabel.getText() + appointments.getAppointmentList().size());
        }));
        timeline.setCycleCount(Timeline.INDEFINITE); // Repeat indefinitely
        timeline.play();

    }

}
