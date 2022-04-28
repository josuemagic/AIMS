package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.employees_models;

public class employees_controllers {

    public void conditionEmployee(String id, String name, String Sname, String Tname, String curp, String telephone, String email, String position, String wage) throws SQLException {

        if ("".equals(id)) {
            addEmployee(name, Sname, Tname, curp, telephone, email, position, wage);
        } else {
            editEmployee(id, name, Sname, Tname, curp, telephone, email, position, wage);
        }
    }

    public void addEmployee(String name, String SName, String Tname, String curp, String telephone, String email, String position, String wage) throws SQLException {
        employees_models GLI = new employees_models();
        ResultSet dataTable = GLI.getLastIdPayrolls();
        int id = 2;
        while (dataTable.next()) {
            id += Integer.valueOf(dataTable.getString("idPayrolls"));
        }        
        
        GLI.addEmployee(name, SName, Tname, curp, telephone, email, position, wage, id);
    }

    public void editEmployee(String id, String name, String SName, String Tname, String curp, String telephone, String email, String position, String wage) {
        employees_models EM = new employees_models();
        EM.editEmployee(id, name, SName, Tname, curp, telephone, email, position, wage);
    }

}
