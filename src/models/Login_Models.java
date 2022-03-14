package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class Login_Models {

    String user = "";
    String password = "";

    public Login_Models(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return "SELECT * FROM `users` WHERE user = " + "\"" + this.user + "\"" + " AND password = " + "\"" + this.password + "\"";
    }

    public ResultSet Login() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM `users` WHERE user = " + "\"" + this.user + "\"" + " AND password = " + "\"" + this.password + "\"");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // No puedo retornar null
        return null;
    }
}
