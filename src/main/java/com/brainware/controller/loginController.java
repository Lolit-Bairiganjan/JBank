package com.brainware.controller;

import com.brainware.dao.UserDAO;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class loginController {
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() throws SQLException{
        String username = usernameField.getText();
        String password = passwordField.getText();
        if(username == null || username.isEmpty() || password.isEmpty()){
            System.out.println("Empty username or passord field!");
            usernameField.setPromptText("Username cannot be empty!");
            passwordField.setPromptText("Password cannot be empty!");
            return; 
        }
        UserDAO userDAO = new UserDAO();
        
        int userId = userDAO.login(username, password);
        
        if(userId > 0){
            System.out.println("Login Successfull! Welcome " + username);
        }
        else{
            System.out.println("Login Failed! Invalid username or password.");
        }
        
    }
}
