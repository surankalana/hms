/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.app;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Owner
 */
public class Connect {
   
        public static Connection getConnection(){
             try{
       /* Getting connection from the database */    
       Connection con = null;
       String driver = "com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/hospital";
       String username = "root";
       String password = "";

       Class.forName(driver); // load MySQL driver
       con = DriverManager.getConnection(url, username, password);

       return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
