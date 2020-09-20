/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Conexion.BD;
import java.sql.Connection;
import java.sql.SQLException;
import Modelo.Login;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ArtemSupa
 */
public class Clases {
    
    
    public void Procedure_Login_select(Login lg) throws SQLException{
        BD b = new BD();
        Connection c = (Connection) b.ConexionBDOracle11g();
        CallableStatement cst = c.prepareCall("{call Proc_Consulta_Login(?,?)}");
        cst.setString(1, lg.getL_Correo());
        cst.setString(2, lg.getL_Password());
        cst.execute();
        ResultSet r = cst.executeQuery();
        if(r.next()){
            System.out.println("procedimienyo ccccc");
        }
    }
}
