/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author buidu
 */
public class DataBaseConnection {
     private static final String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=FLP;user=sa;password=06122004;encrypt=false";
     public static Connection getConnection(){
         Connection conn = null;
         try {           
             conn = DriverManager.getConnection(connectionUrl);
         } catch (SQLException ex) {
             Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);            
         }
          return conn;
     }
}