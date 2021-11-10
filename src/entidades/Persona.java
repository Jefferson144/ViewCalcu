/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jefferson Narvaez
 */

public class Persona {
    
    private long numeroIdentificacion;
    private String nombreApellido;
    private int edad;

    public Persona(long numeroIdentificacion, String nombreApellido, int edad) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreApellido = nombreApellido;
        this.edad = edad;
    }

    public Persona() {
        
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "numeroIdentificacion=" + numeroIdentificacion + ", nombreApellido=" + nombreApellido + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
