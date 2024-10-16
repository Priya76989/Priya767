package org.example.priya11;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    private int failedAttempts = 0;
    private final String correctUsername = "Priya";
    private final String correctPassword = "456";
    private final int maxAttempts = 5;

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please Provide Username or Password");
            return;
        }

        if (failedAttempts >= maxAttempts) {
            messageLabel.setText("Sorry, Your Account is Locked!!!");
            return;
        }

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            messageLabel.setText("Success!!!");
        } else {
            failedAttempts++;
            messageLabel.setText("Sorry, Invalid Username or Password");
        }
    }
}
