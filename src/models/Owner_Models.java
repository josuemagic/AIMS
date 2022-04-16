package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class Owner_Models {

    public ResultSet getData() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM materials JOIN especifications ON materials.idespecifications = especifications.idespecifications WHERE especifications.width > \"0\" ORDER BY especifications.price");
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
            PreparedStatement ps = conectar.prepareStatement("SELECT * FROM tornilleria WHERE tornilleria.amount > 0");
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

    public boolean re_add_BigElement(String id, String extent) {
        int idEspecifications = Integer.parseInt(id);
        float extentEspecifications = Float.valueOf(extent);
        String SQL = "UPDATE especifications "
                + "SET especifications.width = especifications.width+\"" + extentEspecifications + "\" "
                + "WHERE especifications.idespecifications = " + "\'" + idEspecifications + "\'";
        Connection conectar = Conexion.getConexion(); // Conexion DB
        PreparedStatement ps;
        try {
            ps = conectar.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;

        //UPDATE especifications SET especifications.width = especifications.width+"1" WHERE especifications.idespecifications = '1'
    }

    public boolean re_add_LillteElemet(String id, String amount) {
        int idEspecifications = Integer.parseInt(id);
        float extentEspecifications = Float.valueOf(amount);
        String SQL = "UPDATE tornilleria "
                + "SET tornilleria.amount = tornilleria.amount+\"" + extentEspecifications + "\" "
                + "WHERE tornilleria.idtornilleria = " + "\'" + idEspecifications + "\'";
        Connection conectar = Conexion.getConexion(); // Conexion DB
        PreparedStatement ps;
        try {
            ps = conectar.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
