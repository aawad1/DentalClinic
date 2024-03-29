package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.AppointmentManager;
import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Appointment;
import ba.unsa.etf.rpr.domain.Patient;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.List;

public class NewAppointmentController {
    public TextField patientNameAppointment;
    public DatePicker datePickerAppointment;
    public TextArea notesAppointment;
    public Button backButton;
    public Button saveAppointment;
    private final Appointment appointment = new Appointment();
    //private Patient p;
//public NewAppointmentController(Patient p) throws DentalClinicException {p = this.p;}
    private final AppointmentManager appointmentManager = new AppointmentManager();
    public MenuButton menuButton;
    //private final Patient patient = PatientDaoSQLImpl.getInstance().searchByName(patientNameAppointment.getText());

    public NewAppointmentController() throws DentalClinicException {
    }

    public void initialize() throws DentalClinicException {
        List<Patient> patients = new FactoryDao().patientDao().getAll();

        for (Patient p : patients) {
            MenuItem menuItem = new MenuItem(p.getName());
            menuItem.setOnAction(event -> setPatientName(p.getName())); // Handle selection
            menuButton.getItems().add(menuItem);
        }
    }
    private void setPatientName(String name) {
        //patientNameAppointment.setText(name);
        menuButton.setText(name);
    }

    public void addNewAppointment(ActionEvent actionEvent) throws DentalClinicException {
        try {
            Patient p = FactoryDao.patientDao().searchByName(menuButton.getText());
        appointment.setPatient(p);
        appointment.setDate(datePickerAppointment.getValue());
        appointment.setNotes(notesAppointment.getText());

            //appointmentManager.add(appointment);
        } catch (DentalClinicException e) {
            OpenNewWindow.alert(Alert.AlertType.ERROR, "ERROR!", "Something went wrong", e.getMessage());
            //throw new RuntimeException(e);
        }/*inally {
            new OpenNewWindow().openDialog("Appointments", "/Appointments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        }*/
        try {
            appointmentManager.add(appointment);
        } catch (DentalClinicException e) {
            OpenNewWindow.alert(Alert.AlertType.ERROR, "ERROR!", "Something went wrong", e.getMessage());
//            throw new RuntimeException(e);
        } finally {
            new OpenNewWindow().openDialog("Appointments", "/Appointments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        }
    }

    public void goBack(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Patients", "/Patients.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
}
