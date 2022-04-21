package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class Inventory_Models {

    public ResultSet getLastIdBigMaterial() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * \n"
                    + "FROM materials\n"
                    + "ORDER BY idmaterials DESC\n"
                    + "LIMIT 2");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public ResultSet addBigMaterial(String name, String color, float inch, float caliber, float price, float width, int id) {
        Connection conectar = Conexion.getConexion(); // Conexion DB

        String SQL1 = "INSERT INTO materials (idespecifications, name) VALUES (\"" + id + "\", \"" + name + "\")";
        String SQL2 = "INSERT INTO especifications (color, caliber, inch, price, width) "
                + "VALUES (\"" + color + "\", \"" + caliber + "\", \"" + inch + "\", \"" + price + "\", \"" + width + "\");";

        PreparedStatement ps;

        try {
            ps = conectar.prepareStatement(SQL1);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(addUsers_Models.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps = conectar.prepareStatement(SQL2);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(addUsers_Models.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet addLittleMaterial(String name, float inch, int amount, float price) {
        Connection conectar = Conexion.getConexion(); // Conexion DB

        String SQL = "INSERT INTO  tornilleria (name, inch, amount, price) "
                + "VALUES (\"" + name + "\", \"" + inch + "\", \"" + amount + "\",\"" + price + "\")";

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
