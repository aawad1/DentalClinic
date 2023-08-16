package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.AppointmentManager;
import ba.unsa.etf.rpr.dao.PatientDaoSQLImpl;
import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class NewAppointmentController {
    public TextField patientNameAppointment;
    public DatePicker datePickerAppointment;
    public TextArea notesAppointment;
    public Button backButton;
    public Button saveAppointment;
    private Appointment appointment = new Appointment();
    private AppointmentManager appointmentManager = new AppointmentManager();
    private PatientDaoSQLImpl patient = PatientDaoSQLImpl.getInstance();

    public void addNewAppointment(ActionEvent actionEvent) throws DentalClinicException {

        appointment.setPatient(patient.searchByName(patientNameAppointment.getText()));
        appointment.setDateTime(datePickerAppointment);
        appointment.setNotes(notesAppointment.getText());
        try {
            appointmentManager.add(appointment);
        } catch (DentalClinicException e) {
            OpenNewWindow.alert(Alert.AlertType.ERROR, "ERROR!", "Something went wrong", e.getMessage());
            throw new RuntimeException(e);
        } finally {
            new OpenNewWindow().openDialog("Appointments", "/Appointments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        }

    }

    public void goBack(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
}
