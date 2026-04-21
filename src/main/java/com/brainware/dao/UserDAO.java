package com.brainware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public int login(String username, String password) throws SQLException{
        String sql = "select user_id, username, password from users where username = ?";
        
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)){
            
            pst.setString(1, username);
            try(ResultSet rs = pst.executeQuery()){
                if(rs.next()){
                    String retrivedPass = rs.getString("password");
                    
                    if(retrivedPass.equals(password)){
                        return rs.getInt("user_id");
                    }
                }
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return -1; 
    }
    
    public int register(String username, String password) throws SQLException{
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, 'USER')";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)){
            
            pst.setString(1, username);
            pst.setString(2, password);
            
            int rs = pst.executeUpdate();
            
            if(rs > 0){
                System.out.println(rs + " row(s) updated...");
                return rs;
            }
            return -1;
        }
    }
}
