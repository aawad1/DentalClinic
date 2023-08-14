package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Appointments;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
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


    public void openDoctorWindow(ActionEvent actionEvent) {
        DoctorsController doctorsController = new DoctorsController();
        new OpenNewWindow<DoctorsController>().openDialog("Doctors", "/Home.fxml", doctorsController, (Stage) homeScene.getScene().getWindow());
    }

    public void openPatientWindow(ActionEvent actionEvent) {
        PatientsController patientsController = new PatientsController();
        new OpenNewWindow<PatientsController>().openDialog("Patients", "/Patients.fxml", patientsController, (Stage) homeScene.getScene().getWindow());
    }

    public void openTreatmentsWindow(ActionEvent actionEvent) {
        TreatmentsController treatmentsController = new TreatmentsController();
        new OpenNewWindow<TreatmentsController>().openDialog("Treatments", "/Treatments.fxml", treatmentsController, (Stage) homeScene.getScene().getWindow());
    }

    public void openAppointmentsWindow(ActionEvent actionEvent) {
        AppointmentsController appointmentsController = new AppointmentsController();
        new OpenNewWindow<AppointmentsController>().openDialog("Appointments", "/Appointments.fxml", appointmentsController, (Stage) homeScene.getScene().getWindow());
    }

    public void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.minutes(1), event -> {
            appCountLabel.setText(appCountLabel.getText() + appointments.getAppointmentList().size());
        }));
        timeline.setCycleCount(Timeline.INDEFINITE); // Repeat indefinitely
        timeline.play();

    }

}
