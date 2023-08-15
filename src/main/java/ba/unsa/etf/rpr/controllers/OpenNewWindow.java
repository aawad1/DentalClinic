package ba.unsa.etf.rpr.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

/**
 * Class that opens the new view for us
 */
public class OpenNewWindow {

    /**
     * Method that opens the new window for us
     * @param title of the page
     * @param file name of the fxml file
     * @param previous view
     */


    public void openDialog(String title, String file, Stage previous) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(file));
            Stage stage = new Stage();
            stage.setScene(new Scene((Parent) loader.load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setTitle(title);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            if(previous != null) {
                previous.close();
            }
        } catch (Exception e){
            new Alert(Alert.AlertType.NONE, e.getMessage(), ButtonType.OK).show();
        }
    }





    /**
     * Method that pops up an alert window, that is usually called when something goes wrong
     * @param type of alert
     * @param title of alert
     * @param header of alert
     * @param context explanation of alert
     */

    public static void alert(Alert.AlertType type, String title, String header, String context){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(context);
        alert.showAndWait();
    }
}

