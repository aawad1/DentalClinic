package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import org.w3c.dom.Text;

public class HomeController {
    public Button idDoctors;
    public Button idPatients;
    public Button idAppointments;
    public Button idTreatments;
    public Text appointmentsCount;


    public void openDoctorWindow(ActionEvent actionEvent) {
        try {
            new OpenNewWindow<>()
        }
    }
}
