/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BazaDanych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danuta
 */
public class SingletonBazy {
    
    private static SingletonBazy obiekt;
    private Connection con;
    
    private SingletonBazy(){
        
    }
    
    public static SingletonBazy getInstance(){
        
        if(obiekt == null)
            obiekt = new SingletonBazy();
          
        return obiekt;
            
        
    }
    
    public void polaczenie(String plik){
        
        try{
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection(plik);
        }
        catch(ClassNotFoundException | SQLException e){
            
        }
    }
    
    public ResultSet executeQuery(String query){
        
        try {
            PreparedStatement p = con.prepareStatement(query);
            return p.executeQuery();
        } 
        catch (SQLException ex) {
            
        }
        
        return null;
    }
    
    public int executeUpdate(String query){
        
        try {
            PreparedStatement p = con.prepareStatement(query);
            return p.executeUpdate();
        } 
        catch (SQLException ex) {
            
        }
        
        return -1;
        
    }
    
    public void close(){
        
        try {
            con.close();
        } 
        catch (SQLException ex) {
            
        }
        
    }
    
}
