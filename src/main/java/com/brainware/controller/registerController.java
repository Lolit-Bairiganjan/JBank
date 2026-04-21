package com.brainware.controller;

import com.brainware.dao.UserDAO;
import com.brainware.jbanking.StageManager;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class registerController{
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Hyperlink loginButton;
    
    @FXML
    private void handleRegister() throws SQLException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (username == null || username.isEmpty() || password.isEmpty()) {
            System.out.println("Empty username or passord field!");
            usernameField.setPromptText("Username cannot be empty!");
            passwordField.setPromptText("Password cannot be empty!");
            return;
        }
        
        UserDAO userDAO = new UserDAO();
        
        int rs = userDAO.register(username, password);
        if (rs > 0) {
            System.out.println("Registration Successfull! Welcome " + username);
        } else {
            System.out.println("Registration Failed!");
        }

    }
    
    @FXML
    private void handleLoginNavigation(ActionEvent event) {
        try {
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Parent root = StageManager.showLogin();
            stage.getScene().setRoot(root);
            stage.setTitle("JBank");

        } catch (IOException e) {
            System.err.println("Could not load registration screen!");
            e.printStackTrace();
        }
    }
}
