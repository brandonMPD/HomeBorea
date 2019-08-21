package com.homeborea.dao1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionHome {

    //atributos
    private Connection miConexion;
    private static final String URL = "jdbc:mysql://localhost/java19_Home";
    private static final String PASSWORD = "";
    private static final String USER = "root";

    public Connection getMiConexion() {
        return miConexion;
    }

    public void setMiConexion(Connection miConexion) {
        this.miConexion = miConexion;
    }

    public void abrirConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            miConexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion abierta");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en conexion: " + ex);
        }
    }

    public void cerrarConexion() {
        if (miConexion != null) {
            try {
                if (miConexion.isClosed() == false) {
                    miConexion.close();
                    System.out.println("Conexion cerrada");
                }
            }catch (SQLException ex) {
                System.out.println("No se puede cerrar la conexion"+ex);
            }
            }
        }
}

