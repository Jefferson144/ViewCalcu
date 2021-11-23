/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jefferson Naravaez
 */
public class login {
    
    private long numeroIdentificacion;
    private String contrasena;
    
    public login(){
        
    }

    public login(long numeroIdentificacion, String contrasena) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.contrasena = contrasena;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
