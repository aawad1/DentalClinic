package ba.unsa.etf.rpr.controllers.components;

import ba.unsa.etf.rpr.controllers.OpenNewWindow;
import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Patient;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class ActionsCellFactory implements Callback<TableColumn<Patient, Void>, TableCell<Patient, Void>> {
    @Override
    public TableCell<Patient, Void> call(TableColumn<Patient, Void> param) {
        return new TableCell<Patient, Void>() {
            private final Button editButton = new Button("Edit");
            private final Button deleteButton = new Button("Delete");

            {
                editButton.setOnAction(event -> {
                    Patient patient = (Patient) getTableView().getItems().get(getIndex());
                    // Handle edit action here
                    try {
                        new OpenNewWindow().openDialog("Patient", "/Patient.fxml", null);
                    } catch (Exception e){
                        new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
                    }

                    System.out.println("Edit clicked for patient: " + patient.getName());
                });

                deleteButton.setOnAction(event -> {
                    Patient patient = (Patient) getTableView().getItems().get(getIndex());
                    // Handle delete action here
                    try {
                        FactoryDao.patientDao().delete(patient.getId());
                        //refreshButton.refreshPatients();
                    }catch (Exception e){
                        new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();

                    }
                    System.out.println("Delete clicked for patient: " + patient.getName());
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(createButtonsBox());
                }
            }

            private HBox createButtonsBox() {
                HBox buttonsBox = new HBox(10); // Spacing between buttons
                buttonsBox.getChildren().addAll(editButton, deleteButton);
                return buttonsBox;
            }
        };
    }
}
