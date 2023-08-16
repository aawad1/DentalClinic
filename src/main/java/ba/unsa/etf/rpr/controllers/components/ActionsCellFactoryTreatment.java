package ba.unsa.etf.rpr.controllers.components;

import ba.unsa.etf.rpr.dao.FactoryDao;
import ba.unsa.etf.rpr.domain.Treatment;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.util.Callback;


public class ActionsCellFactoryTreatment implements Callback<TableColumn<Treatment, Void>, TableCell<Treatment, Void>> {
    @Override
    public TableCell<Treatment, Void> call(TableColumn<Treatment, Void> param) {
        return new TableCell<Treatment, Void>() {
            private final Button editButton = new Button("Edit");
            private final Button deleteButton = new Button("Delete");

            {
                editButton.setOnAction(event -> {
                    Treatment treatment = (Treatment) getTableView().getItems().get(getIndex());
                    // Handle edit action here
                    System.out.println("Edit clicked for treatment: " + treatment.getName());
                });

                deleteButton.setOnAction(event -> {
                    Treatment treatment = (Treatment) getTableView().getItems().get(getIndex());
                    // Handle delete action here
                    try {
                        FactoryDao.treatmentDao().delete(treatment.getId());
                    }catch (Exception e){
                        new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();

                    }
                    System.out.println("Delete clicked for treatment: " + treatment.getName());
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

