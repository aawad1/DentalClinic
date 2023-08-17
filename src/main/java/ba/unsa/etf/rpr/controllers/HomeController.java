package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HomeController {
    public BorderPane homeScene;
    public Button idDoctors;
    public Button idPatients;
    public Button idAppointments;
    public Button idTreatments;
    public Label appCountLabel;


    @FXML
    public void openDoctorWindow(ActionEvent actionEvent) {
         new OpenNewWindow().openDialog("Doctors", "/Doctors.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
    @FXML
    public void openPatientWindow(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }

    @FXML
    public void openTreatmentsWindow(ActionEvent actionEvent) {
        System.out.println("otvori");
        new OpenNewWindow().openDialog("Treatments", "/Treatments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
    @FXML
    public void openAppointmentsWindow(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Appointments", "/Appointments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
    @FXML
    public void initialize() {
        /* Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), event -> {
            try {
                //appCountLabel.setText(appCountLabel.getText() + new FactoryDao().appointmentDao().getAll().size());
            } catch (DentalClinicException e) {
                throw new RuntimeException(e);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE); // Repeat indefinitely
        timeline.play();
*/
    }

}
