/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.panels;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.Payrolls_Models;
import models.addUsers_Models;

/**
 *
 * @author jo29h
 */
public class panel_payrolls extends javax.swing.JPanel {

    public panel_payrolls() {
        initComponents();
        tableStructure();
        try {
            getEmployees();
        } catch (SQLException ex) {
            Logger.getLogger(panel_payrolls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getEmployees() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tablePayrolls.getModel();

        Payrolls_Models data = new Payrolls_Models();
        ResultSet dataTable = data.getEmployees();

        while (dataTable.next()) {
            Object objeto[] = {dataTable.getString("idPayrolls"), dataTable.getString("name"),
                dataTable.getString("secondName"), dataTable.getString("thirdName"), dataTable.getString("curp"),
                dataTable.getString("telephone"), dataTable.getString("email"), dataTable.getString("position"),
                dataTable.getString("wage")};
            model.addRow(objeto);
            tablePayrolls.setModel(model);
        }
    }

    public void tableStructure() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Nomina");
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Curp");
        model.addColumn("Telefono");
        model.addColumn("Gmail");
        model.addColumn("Posicion");
        model.addColumn("Salario");
        tablePayrolls.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePayrolls = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nominas");

        tablePayrolls.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablePayrolls.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePayrolls);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(749, 749, 749)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(544, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePayrolls;
    // End of variables declaration//GEN-END:variables
}
