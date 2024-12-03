package com.alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        try {
            // Cargar el driver JDBC
            Class.forName("org.postgresql.Driver");
            // Establecer la conexión
            return DriverManager.getConnection(
                    "jdbc:postgresql:/localhost/algo", "postgres", "Julietita12"); // Cambia las credenciales
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver no encontrado", e);
        }
    }
}


