package com.brainware.jbanking;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class StageManager {
    public static Parent showLogin() throws IOException{
        return FXMLLoader.load(StageManager.class.getResource("login.fxml"));
    }
    
    public static Parent showRegister() throws IOException {
        return FXMLLoader.load(StageManager.class.getResource("register.fxml"));
    }
}
