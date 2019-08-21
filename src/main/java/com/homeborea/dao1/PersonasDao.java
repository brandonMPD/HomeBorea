
package com.homeborea.dao1;

import com.hombeborea.modelo.HomePersonas;
import com.homeborea.interfaces.PersonasInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PersonasDao implements PersonasInterface {
    
    ConexionHome conexion = new ConexionHome();
    HomePersonas homePersonas;
    private String mensaje = null;
    private String sql = null;
    private PreparedStatement ejecutar;
    private ResultSet resultadoSelect;
    private HomePersonas datosPersonas = new HomePersonas();
    

    @Override
    public String agregarPersona(HomePersonas homePersona) {
        try {
            
            conexion.abrirConexion();
            sql = "INSERT INTO personas(nombre, apellido, dpi, correo) VALUES (?,?,?,?)"; 
            ejecutar = conexion.getMiConexion().prepareStatement(sql);
            
            ejecutar.setString(1, homePersona.getNombrePersona());
            ejecutar.setString(2, homePersona.getApellidoPersona());
            ejecutar.setInt(3, homePersona.getDpiPersona());
            ejecutar.setString(4, "inventado@gmail.com");
            
            int a = ejecutar.executeUpdate();
            System.out.println(a);
            mensaje = " Datos Agregados Exitosamente";
        } catch (Exception e) {
            mensaje = " No se pudo Agregar datos";
            System.out.println(mensaje + e);
        } finally {
            conexion.cerrarConexion();
        }
        return mensaje;
    }
    
    
}
