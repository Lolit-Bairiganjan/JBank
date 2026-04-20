package com.brainware.dao;

import com.brainware.dao.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class databaseTest {
    public static void main(String[] args){
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Successfully connected to the JBank Vault!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
    
}
