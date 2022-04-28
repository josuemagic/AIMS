package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.Conexion;

public class employees_models {

    public ResultSet getLastIdPayrolls() {
        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement("SELECT * \n"
                    + "FROM payrolls\n"
                    + "ORDER BY idPayrolls DESC\n"
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

    public void editEmployee(String id, String name, String SName, String Tname, String curp, String telephone, String email, String position, String wage) {
        String SQL = "UPDATE employees\n"
                + "  SET name = \"" + name + "\", secondName = \"" + SName + "\", thirdName = \"" + Tname + "\", \n"
                + "  email = \"" + email + "\", curp = \"" + curp + "\", telephone = \"" + telephone + "\" \n"
                + "  WHERE idEmployee = \"" + id + "\"";

        String SQL2 = "UPDATE payrolls\n"
                + "  SET wage = \"" + wage + "\", position = \"" + position + "\"\n"
                + "  WHERE idPayrolls = \"" + id + "\"";

        Connection conectar = Conexion.getConexion(); // Conexion DB
        try {
            PreparedStatement ps = conectar.prepareStatement(SQL);
            PreparedStatement ps2 = conectar.prepareStatement(SQL2);
            ps.executeUpdate();
            ps2.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addEmployee(String name, String SName, String Tname, String curp, String telephone, String email, String position, String wage, int id) {
        Connection conectar = Conexion.getConexion(); // Conexion DB

        String SQL = "INSERT INTO employees (employees.name, employees.secondName, employees.thirdName, \n"
                + "employees.email, employees.curp, employees.idPayrolls, employees.telephone)\n"
                + "VALUES (\"" + name + "\", \"" + SName + "\",\"" + Tname + "\", \"" + email + "\","
                + "\"" + curp + "\", \"" + id + "\",\"" + telephone + "\" )";

        String SQL2 = "INSERT INTO payrolls (payrolls.wage, payrolls.position, payrolls.idEmployee)\n"
                + "VALUES (\"" + wage + "\",\"" + position + "\", \"" + id + "\")";

        try {
            PreparedStatement ps = conectar.prepareStatement(SQL);
            PreparedStatement ps2 = conectar.prepareStatement(SQL2);
            ps.executeUpdate();
            ps2.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
