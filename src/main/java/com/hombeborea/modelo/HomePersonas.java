
package com.hombeborea.modelo;

import java.io.Serializable;


public class HomePersonas implements Serializable{
    
    private String nombrePersona;
    private String apellidoPersona;
    private String direccionPersona;
    private String correoPersona;
    private int dpiPersona;
    private int numeroPersona;
   
   

    public HomePersonas() {
    }

    
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public int getDpiPersona() {
        return dpiPersona;
    }

    public void setDpiPersona(int dpiPersona) {
        this.dpiPersona = dpiPersona;
    }
    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }
    public int getNumeroPersona() {
        return numeroPersona;
    }

    public void setNumeroPersona(int numeroPersona) {
        this.numeroPersona = numeroPersona;
    }

    @Override
    public String toString() {
        return "HomePersonas{" + "nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", direccionPersona=" + direccionPersona + ", correoPersona=" + correoPersona + ", dpiPersona=" + dpiPersona + ", numeroPersona=" + numeroPersona + '}';
    }

   

  
   
    
    
    
    
}
