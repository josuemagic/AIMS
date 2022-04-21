package controllers;

import javax.swing.JOptionPane;
import models.addUsers_Models;

public class addUsers_controllers {

    public boolean validationAddEmployee(String user, String password, String passwordValidation, String email, int root) {
        if ("".equals(user) || "".equals(password) || "".equals(passwordValidation) || "".equals(email) || root == 2) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben de estar llenos");
            return false;
        }
        if (!(password.equals(passwordValidation))) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coincide ");
            return false;
        }
        // LLamamos al insert de la tabla
        addUsers_Models AUM = new addUsers_Models();
        AUM.addEmployee(user, password, root, email);
        JOptionPane.showMessageDialog(null, "Se agrego el usuario");
        return true;
    }
    
    public void validationDeletUser(String id) {
        addUsers_Models AUM = new addUsers_Models();
        AUM.deletEmpoyee(id);
    }
}
