package main.coursenetworkshops.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    @FXML
    void initialize() {
        password.setPromptText("Enter Password");
        username.setPromptText("Enter Username");
        loginButton.setOnAction(event -> {});
    }

}
