package main.coursenetworkshops;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import main.coursenetworkshops.Controllers.LoginController;

import java.io.IOException;

public class Primary extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //FXMLLoader fxmlLoader = FXMLLoader.load(getClass().getResource("Login.fxml"));
       //fxmlLoader.setController(new LoginController());
        //Pane pane = fxmlLoader.load();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Primary.class.getResource("/pages/Login.fxml"));
        Parent root = fxmlLoader.load();
        //Parent root = FXMLLoader.load(getClass().getResource("/pages/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Course Network Shops");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}