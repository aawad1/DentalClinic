package ba.unsa.etf.rpr.controllers.components;

import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Appointment;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.util.Callback;


public class ActionsCellFactoryAppointments implements Callback<TableColumn<Appointment, Void>, TableCell<Appointment, Void>> {
    @Override
    public TableCell<Appointment, Void> call(TableColumn<Appointment, Void> param) {
        return new TableCell<Appointment, Void>() {
            private final Button editButton = new Button("Edit");
            private final Button deleteButton = new Button("Delete");

            {
                editButton.setOnAction(event -> {
                    Appointment appointment = (Appointment) getTableView().getItems().get(getIndex());
                    // Handle edit action here
                    System.out.println("Edit clicked for Appointment: " + appointment.getPatient().getName());
                });

                deleteButton.setOnAction(event -> {
                    Appointment appointment = (Appointment) getTableView().getItems().get(getIndex());
                    // Handle delete action here
                    try {
                        FactoryDao.appointmentDao().delete(appointment.getId());
                    }catch (Exception e){
                        new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();

                    }
                    System.out.println("Delete clicked for Appointment: " + appointment.getPatient().getName());
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


