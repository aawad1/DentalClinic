package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.controllers.OpenNewWindow;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Main class for working with JavaFX framework
 */

public class AppFX extends Application {



    @Override
    public void start(Stage primaryStage) throws IOException {
        new OpenNewWindow().openDialog("Dental Clinic", "/Home.fxml",  null);
    }


    /*public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Home.fxml"));
//        HomeController homeController = new HomeController();
//        fxmlLoader.setController(homeController);
        Parent root = fxmlLoader.load();
        stage.setTitle("Dental Clinic");
        stage.setScene(new Scene(root));

        stage.show();
    }*/
}
