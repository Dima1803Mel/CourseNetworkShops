package main.coursenetworkshops.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.coursenetworkshops.DataBaseConnection;

public class LoginController {

    @FXML
    private TextField Login;

    @FXML
    private PasswordField Password;

    @FXML
    private Button buttonReg;

    public void getData(ActionEvent event) {
        System.out.println(Login.getText());
        System.out.println(Password.getText());
        //DataBaseConnection.connection();
        if (Login.getText().equals("Dima") && Password.getText().equals("rome2")) {
            DataBaseConnection.writeToDatabase(Login.getText(), Password.getText());
        } else {
            System.out.println("Please Try Again");
        }


    }
}
