package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class Owner_Models {

    public ResultSet getData() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM materials JOIN especifications ON materials.idespecifications = especifications.idespecifications ORDER BY especifications.price");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
