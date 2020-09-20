/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Controlador.Clases;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ArtemSupa
 */
public class BD {
    
        String Url = "jdbc:oracle:thin:@localhost:1521:XE";
        String Usuario = "adminjava";
        String PassWord ="adminjava";
        public Connection conn = null;
        public Statement st = null;
        
    
    public Statement  ConexionBDOracle11g() throws SQLException{
        try{
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            Connection conn = DriverManager.getConnection(Url,Usuario,PassWord);
            System.out.println("Conexion bd realizada con exito");
            
            
        }catch(SQLException i){
        
            System.out.println("Error:"+i);
        
        }
            return null;
        
    }
        
        
    
}
   
