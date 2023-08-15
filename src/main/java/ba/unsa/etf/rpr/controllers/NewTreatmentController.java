package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.TreatmentManager;
import ba.unsa.etf.rpr.domain.Treatment;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewTreatmentController {
    public TextField treatmentName;
    public TextField treatmentCost;
    public TextArea treatmentDescription;
    public Button saveTreatment;
    public Button backButton;
    private Treatment treatment = new Treatment();
    private TreatmentManager treatmentManager = new TreatmentManager();

    public void addNewTreatment(ActionEvent actionEvent) {
            treatment.setName(treatmentName.getText());
            treatment.setCost(Double.parseDouble(treatmentCost.getText()));
            treatment.setDescription(treatmentDescription.getText());
            try {
                treatmentManager.add(treatment);
            } catch (DentalClinicException e) {
                OpenNewWindow.alert(Alert.AlertType.ERROR, "ERROR!", "Something went wrong", e.getMessage());
                throw new RuntimeException(e);
            } finally {
                new OpenNewWindow().openDialog("Treatments", "/Treatments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
            }
    }

    public void goBack(ActionEvent actionEvent) {
        new OpenNewWindow().openDialog("Treatments", "/Treatments.fxml", (Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
    }
}
