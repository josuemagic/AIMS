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

    public ResultSet getDataLitlelMaterials() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM tornilleria");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return null;
    }

    public ResultSet updateData(int idBigMaterials, float widthBigMaterials) throws SQLException {
        String SQL = "UPDATE especifications "
                + "SET width = " + "\"" + widthBigMaterials + "\""
                + " WHERE idespecifications = " + "\'" + idBigMaterials + "\'";
        Connection conectar = Conexion.getConexion(); // Conexion DB
        PreparedStatement ps = conectar.prepareStatement(SQL);
        ps.executeUpdate();
        return null;
    }

    public ResultSet updateDataLittleMaterials(int idLittlelMaterials, int amount) throws SQLException {
        String SQL = "UPDATE tornilleria "
                + "SET amount = " + "\"" + amount + "\""
                + " WHERE idtornilleria = " + "\'" + idLittlelMaterials + "\'";
        Connection conectar = Conexion.getConexion(); // Conexion DB
        PreparedStatement ps = conectar.prepareStatement(SQL);
        ps.executeUpdate();
        return null;
    }
}
