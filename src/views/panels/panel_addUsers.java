package views.panels;

import controllers.addUsers_controllers;
import controllers.cotizaciones_controllers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.addUsers_Models;
import models.Owner_Models;

/**
 *
 * @author Jimenez DE Lucio Josue
 */
public class panel_addUsers extends javax.swing.JPanel {

    public panel_addUsers() {
        initComponents();
        tableStructure();
        try {
            getEmployees();
        } catch (SQLException ex) {
            Logger.getLogger(panel_addUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getEmployees() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tableEmployees.getModel();

        addUsers_Models data = new addUsers_Models();
        ResultSet dataTable = data.getEmployees();

        while (dataTable.next()) {
            Object objeto[] = {dataTable.getString("idusers"), dataTable.getString("user"), dataTable.getString("password"), dataTable.getString("email")};
            model.addRow(objeto);
            tableEmployees.setModel(model);
        }
    }

    public void tableStructure() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Usuario");
        model.addColumn("Contraseña");
        model.addColumn("gmail");
        tableEmployees.setModel(model);
    }

    public void resetForm() {
        userTextField.setText("");
        passwordTextField.setText("");
        passwordTextField2.setText("");
        emailTextField.setText("");
        radioButtonRoot.setSelected(false);
        radioButtonNoRoot.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployees = new javax.swing.JTable();
        addEmployeesPanel = new javax.swing.JPanel();
        userTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        addEmployee = new javax.swing.JButton();
        radioButtonRoot = new javax.swing.JRadioButton();
        radioButtonNoRoot = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        passwordTextField = new javax.swing.JPasswordField();
        passwordTextField2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonDeletUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1306, 981));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Administracion de empleados");

        tableEmployees.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableEmployees.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tableEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmployees);

        addEmployeesPanel.setBackground(new java.awt.Color(102, 102, 102));
        addEmployeesPanel.setForeground(new java.awt.Color(255, 255, 255));

        userTextField.setText("Usuario");
        userTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTextFieldMouseClicked(evt);
            }
        });

        emailTextField.setText("Correo");
        emailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextFieldMouseClicked(evt);
            }
        });

        addEmployee.setBackground(new java.awt.Color(0, 0, 204));
        addEmployee.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addEmployee.setText("Agregar Usuario");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        radioButtonRoot.setBackground(new java.awt.Color(255, 0, 51));
        radioButtonRoot.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        radioButtonRoot.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonRoot.setText("Root");
        radioButtonRoot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioButtonRootMouseClicked(evt);
            }
        });

        radioButtonNoRoot.setBackground(new java.awt.Color(0, 153, 153));
        radioButtonNoRoot.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        radioButtonNoRoot.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonNoRoot.setText("No Root");
        radioButtonNoRoot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioButtonNoRootMouseClicked(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("El usuario root obtiene permisos\npara el manejo de modulos \ncomo: Cotizaciones,\nadministacionde empleados, \nadministracions de nominas, \nadministracion de usuarios e\ninventario \n");
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("El usuario no root tiene permisos\nlimitadosy solo puede acceder a \nmodulos como: Cotizaciones e \ninventario");
        jScrollPane3.setViewportView(jTextArea2);

        passwordTextField.setText("jkfs");
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextFieldMouseClicked(evt);
            }
        });

        passwordTextField2.setText("1234");
        passwordTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextField2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rectificar contraseña");

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/root.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/no_root.png"))); // NOI18N

        javax.swing.GroupLayout addEmployeesPanelLayout = new javax.swing.GroupLayout(addEmployeesPanel);
        addEmployeesPanel.setLayout(addEmployeesPanelLayout);
        addEmployeesPanelLayout.setHorizontalGroup(
            addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(radioButtonRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                            .addGap(104, 104, 104)
                                            .addComponent(radioButtonNoRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEmployeesPanelLayout.createSequentialGroup()
                                            .addGap(118, 118, 118)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        addEmployeesPanelLayout.setVerticalGroup(
            addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeesPanelLayout.createSequentialGroup()
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtonRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonNoRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Empleado");

        buttonDeletUser.setBackground(new java.awt.Color(0, 0, 0));
        buttonDeletUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/delete_people.png"))); // NOI18N
        buttonDeletUser.setEnabled(false);
        buttonDeletUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(buttonDeletUser)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(addEmployeesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(682, 682, 682))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeletUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(addEmployeesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextFieldMouseClicked
        userTextField.setText("");
    }//GEN-LAST:event_userTextFieldMouseClicked

    private void passwordTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMouseClicked
        passwordTextField.setText("");
    }//GEN-LAST:event_passwordTextFieldMouseClicked

    private void radioButtonRootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioButtonRootMouseClicked
        radioButtonNoRoot.setSelected(false);
    }//GEN-LAST:event_radioButtonRootMouseClicked

    private void radioButtonNoRootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioButtonNoRootMouseClicked
        radioButtonRoot.setSelected(false);
    }//GEN-LAST:event_radioButtonNoRootMouseClicked

    private void buttonDeletUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletUserActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableEmployees.getModel();
        String[] dataForDelet = new String[4];

        for (int i = 0; i < 4; i++) {
            dataForDelet[i] = (String) model.getValueAt(tableEmployees.getSelectedRow(), i);
        }

        int name = JOptionPane.showInternalConfirmDialog(null, "SEGURO QUE QUIERE ELIMINAR ESTE USUARIO?");
        if (name == 0) {
            addUsers_controllers AUC = new addUsers_controllers();
            AUC.validationDeletUser(dataForDelet[0]);
        } 
        buttonDeletUser.setEnabled(false);


        tableStructure();
        try {
            getEmployees();
        } catch (SQLException ex) {
            Logger.getLogger(panel_addUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDeletUserActionPerformed

    private void passwordTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextField2MouseClicked
        passwordTextField2.setText("");
    }//GEN-LAST:event_passwordTextField2MouseClicked

    private void emailTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextFieldMouseClicked
        emailTextField.setText("");
    }//GEN-LAST:event_emailTextFieldMouseClicked

    private void tableEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeesMouseClicked
        buttonDeletUser.setEnabled(true);
    }//GEN-LAST:event_tableEmployeesMouseClicked

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        addUsers_controllers AEM = new addUsers_controllers();

        String user = userTextField.getText();
        String password = passwordTextField.getText();
        String passwordValidation = passwordTextField2.getText();
        String email = emailTextField.getText();
        int root = 0;
        if (radioButtonRoot.isSelected() || radioButtonNoRoot.isSelected()) {
            root = radioButtonRoot.isSelected() ? 1 : 0;
        } else {
            root = 2;
        }

        AEM.validationAddEmployee(user, password, passwordValidation, email, root);
        tableStructure();
        try {
            getEmployees();
        } catch (SQLException ex) {
            Logger.getLogger(panel_addUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetForm();
    }//GEN-LAST:event_addEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployee;
    private javax.swing.JPanel addEmployeesPanel;
    private javax.swing.JButton buttonDeletUser;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPasswordField passwordTextField2;
    private javax.swing.JRadioButton radioButtonNoRoot;
    private javax.swing.JRadioButton radioButtonRoot;
    private javax.swing.JTable tableEmployees;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
