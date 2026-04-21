package com.brainware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public int login(String username, String password) throws SQLException{
        String sql = "select username, password from users where username = ?";
        
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)){
            
            pst.setString(0, username);
            try(ResultSet rs = pst.executeQuery()){
                if(rs.next()){
                    String retrivedPass = rs.getString("password");
                    
                    if(retrivedPass == password){
                        return rs.getInt("user_id");
                    }
                }
            }
        } catch(SQLException e){
            e.printStackTrace(); 
        }
        return -1;
        
        
    }
}
