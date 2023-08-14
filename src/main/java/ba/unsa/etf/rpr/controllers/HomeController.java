package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Appointments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class HomeController {
    public Button idDoctors;
    public Button idPatients;
    public Button idAppointments;
    public Button idTreatments;
    public Text appointmentsCount;
    @FXML
    public Label appCountLabel;
    public Appointments appointments;

    public void openDoctorWindow(ActionEvent actionEvent) {
        DoctorsController doctorsController = new DoctorsController();
        new OpenNewWindow<DoctorsController>().openDialog("Doctors", "/Home.fxml", doctorsController, (Stage) idDoctors.getScene().getWindow());
    }

    public void openPatientWindow(ActionEvent actionEvent) {
        PatientsController patientsController = new PatientsController();
        new OpenNewWindow<PatientsController>().openDialog("Patients", "/Patients.fxml", patientsController, (Stage) idDoctors.getScene().getWindow());
    }

    public void openTreatmentsWindow(ActionEvent actionEvent) {
        TreatmentsController treatmentsController = new TreatmentsController();
        new OpenNewWindow<TreatmentsController>().openDialog("Treatments", "/Treatments.fxml", treatmentsController, (Stage) idDoctors.getScene().getWindow());
    }

    public void openAppointmentsWindow(ActionEvent actionEvent) {
        AppointmentsController appointmentsController = new AppointmentsController();
        new OpenNewWindow<AppointmentsController>().openDialog("Appointments", "/Appointments.fxml", appointmentsController, (Stage) idDoctors.getScene().getWindow());
    }

    public void initialize() {
        appCountLabel.setText(appCountLabel.getText() + appointments.getAppointmentList().size());
    }

}
