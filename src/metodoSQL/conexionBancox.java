/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Narvaez
 */

public class conexionBancox {
    
    private static conexionBancox instancia;
    private static Connection conexion;
    
    private conexionBancox(){
        
    }
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //traer el driver con el que me voy a conectar
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bancox", "root", "1a2c3m4e.");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
        }
        return conexion;
    }
    
    public void cerrarConexion() throws SQLException{
        try{
            conexion.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }
    
    public static conexionBancox getInstance(){
        if (instancia==null){
            instancia = new conexionBancox();
        }
        return instancia;
    }
    
}
