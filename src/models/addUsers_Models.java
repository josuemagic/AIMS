package models;

import java.sql.Connection;
import java.sql.ResultSet;
import proyecto.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class addUsers_Models {

    public ResultSet getEmployees() {

        Connection conectar = (Connection) Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM `users` WHERE root = 1 or root = 0");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public ResultSet addEmployee(String user, String password, int root, String email) {
        String SQL = "INSERT INTO"
                + " users (user, password, root, email) "
                + "VALUES (\"" + user + "\", \"" + password + "\", \"" + root + "\", \"" + email + "\" )";
        Connection conectar = Conexion.getConexion(); // Conexion DB
        PreparedStatement ps;
        try {
            ps = conectar.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(addUsers_Models.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet deletEmpoyee(String id) {
        String SQL = "UPDATE users "
                + "SET root = 2"
                + " WHERE idusers = " + "\'" + id + "\'";
        Connection conectar = Conexion.getConexion(); // Conexion DB
        PreparedStatement ps;
        try {
            ps = conectar.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(addUsers_Models.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
