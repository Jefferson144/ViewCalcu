/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import entidades.*;

/**
 *
 * @author Jefferson Naravaez
 */
public class bancoSQL {

    public static conexionBancox conexion = conexionBancox.getInstance();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;

    public String consultarUsuario(login dato) {
        String usuario = "No se encuentra";
        try {
            Connection conexion = (Connection) conexionBancox.getConnection();
            String sentencia = ("SELECT * FROM usuario WHERE numeroIdentificacion = '" + dato.getNumeroIdentificacion() + "' and password = '" + dato.getContrasena() + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                usuario = "Se encontro";
            }
            bancoSQL.conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e);
        }
        return usuario;
    }
    
    public String consultarNomApellUsuario(login dato){
        String usuario = null;
        try {
            Connection conexion = (Connection) conexionBancox.getConnection();
            String sentencia = ("SELECT primerNombre, primerApellido FROM usuario WHERE numeroIdentificacion = '" + dato.getNumeroIdentificacion() + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                usuario = resultado.getString("primerNombre");
                usuario = usuario + " " + resultado.getString("primerApellido");
            }
            bancoSQL.conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e);
        }
        return usuario;
    }

    public void insertarUsuario(Persona datos) {
        int resultado = 0;
        try {
            Connection conexion = (Connection) conexionBancox.getConnection();
            String sentencia = ("INSERT INTO usuario (numeroIdentificacion, primerNombre, primerApellido, Telefono, password) VALUES (?,?,?,?,?)");
            sentencia_preparada = conexion.prepareStatement(sentencia);
            sentencia_preparada.setLong(1, datos.getNumeroIdentificacion());
            sentencia_preparada.setString(2, datos.getNombre());
            sentencia_preparada.setString(3, datos.getApellido());
            sentencia_preparada.setLong(4, datos.getTelefono());
            sentencia_preparada.setString(5, datos.getPassword());
            resultado = sentencia_preparada.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se inserto correctamente", "Insercion con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error a la hora de insertar, intenta nuevamente", "Operacion fallo", JOptionPane.ERROR_MESSAGE);
            }
            sentencia_preparada.close();
            bancoSQL.conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e);
        }
    }

    public void actualizarUsuario(Persona datos) {
        int resultado = 0;
        try {
            Connection conexion = (Connection) conexionBancox.getConnection();
            String sentencia = ("UPDATE usuario SET primerNombre = ?, primerApellido = ?, Telefono = ? WHERE numeroIdentificacion = '" + datos.getNumeroIdentificacion() + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia);
            sentencia_preparada.setString(1, datos.getNombre());
            sentencia_preparada.setString(2, datos.getApellido());
            sentencia_preparada.setLong(3, datos.getTelefono());
            resultado = sentencia_preparada.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente", "Actualizacion con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error a la hora de actualizar, intenta nuevamente", "Operacion fallo", JOptionPane.ERROR_MESSAGE);
            }
            sentencia_preparada.close();
            bancoSQL.conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e);
        }
    }
    
    public void eliminarUsuario(Persona datos){
        int resultado = 0;
        try {
            Connection conexion = (Connection) conexionBancox.getConnection();
            String sentencia = ("DELETE FROM usuario WHERE numeroIdentificacion = '" + datos.getNumeroIdentificacion() + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia);
            resultado = sentencia_preparada.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente", "Actualizacion con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error a la hora de eliminar, intenta nuevamente", "Operacion fallo", JOptionPane.ERROR_MESSAGE);
            }
            sentencia_preparada.close();
            bancoSQL.conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e);
        }
    }

}
