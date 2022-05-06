package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class cotization_Models {

    public ResultSet getLastIdSales() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM sales\n"
                    + "ORDER BY idSales DESC\n"
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

    public ResultSet insertElementSales(String[] dataElement, int id) {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        String wid = "";

        String[] arraySplit = dataElement[2].split("i"); // Saber si es bigMaterial o littleMaterial

        if (arraySplit.length > 1) {
            wid = arraySplit[0].replace(" ", "");
        } else {
            wid = dataElement[2];
        }

        String SQL1 = "INSERT INTO materialssales (idSales, name, width, price, amount) "
                + "VALUES (\'" + id + "\', \"" + dataElement[1] + "\", \"" + wid + "\","
                + "\"" + dataElement[3] + "\", \"" + dataElement[4] + "\" )";

        PreparedStatement ps;
        try {
            ps = conectar.prepareStatement(SQL1);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(addUsers_Models.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ResultSet addNewSales(String price, String date) {
        Connection conectar = Conexion.getConexion(); // Conexion DB

        String SQL1 = "INSERT INTO sales (priceTotal, date) VALUES (\"" + price + "\", \"" + date + "\")";

        PreparedStatement ps;
        try {
            ps = conectar.prepareStatement(SQL1);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(addUsers_Models.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
