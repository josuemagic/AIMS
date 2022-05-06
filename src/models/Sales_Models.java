package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class Sales_Models {

    public ResultSet getEmployees() {

        Connection conectar = (Connection) Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT materialssales.idSales, materialssales.name, materialssales.amount, "
                    + "sales.priceTotal, sales.date "
                    + "FROM materialssales "
                    + "INNER JOIN sales "
                    + "ON materialssales.idSales = sales.idSales;");
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
