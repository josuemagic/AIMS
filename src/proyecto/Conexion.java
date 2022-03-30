/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author jo29h
 */
public class Conexion {

    Connection conectar = null;

    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/aimsv1", "root", "");
            // JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            return conectar;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la base de datos, error:" + e);
            System.out.println(e);
        }
        return null;
    }
}
