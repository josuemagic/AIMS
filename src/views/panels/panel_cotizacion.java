/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.panels;

import controllers.cotizaciones_controllers;
import static java.lang.String.valueOf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import models.Owner_Models;

public class panel_cotizacion extends javax.swing.JPanel {

    // Public Variables
    String ticket = "";
    float price = 0;

    public panel_cotizacion() {
        initComponents();
        try {
            AddMaterialsList();
            AddLittleMaterialsList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar al servidor, revise su conexion");
        }

    }

    public void AddMaterialsList() throws SQLException {

        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
        ListMaterials.setModel(modelo);

        // Mandamos a llamar Owner_Models y llenariamos los datos
        Owner_Models data = new Owner_Models();
        ResultSet dataTable = data.getData();
        while (dataTable.next()) {
            modelo.addElement(dataTable.getString("name") + " / " + dataTable.getString("width") + " M / " + dataTable.getString("price") + " $ /" + dataTable.getString("idmaterials"));
        }
        // Agregamos los elementos al list
        ListMaterials.setModel(modelo);
    }

    public void AddLittleMaterialsList() throws SQLException {
        DefaultListModel modelo = new DefaultListModel();
        // Mandamos a llamar Owner_Models y llenariamos los datos
        Owner_Models data = new Owner_Models();
        ResultSet dataTable = data.getDataLitlelMaterials();
        while (dataTable.next()) {
            modelo.addElement(dataTable.getString("idtornilleria") + " " + dataTable.getString("name") + " " + dataTable.getString("inch") + "in " + "Cantidad: " + dataTable.getString("amount") + " Precio: " + dataTable.getString("price") + " $");
        }
        // Agregamos los elementos al list
        ListLittleMaterials.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        medida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMaterials = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListLittleMaterials = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaCotizacion = new javax.swing.JTextArea();
        totalPriceTextField = new javax.swing.JTextField();
        amountLittlelMaterials = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(153, 0, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cotizaciones");

        medida.setText("0");
        medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Introduzca la medida");

        ListMaterials.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ListMaterials.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListMaterials);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Material");

        ListLittleMaterials.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ListLittleMaterials.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListLittleMaterials);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Material pequeño ");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar Material");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Aregar Material Pequeño ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TextAreaCotizacion.setEditable(false);
        TextAreaCotizacion.setColumns(20);
        TextAreaCotizacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TextAreaCotizacion.setRows(5);
        jScrollPane3.setViewportView(TextAreaCotizacion);

        totalPriceTextField.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        totalPriceTextField.setForeground(new java.awt.Color(204, 0, 51));
        totalPriceTextField.setText("Precio");

        amountLittlelMaterials.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(531, 531, 531)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(medida, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountLittlelMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(220, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountLittlelMaterials)
                            .addComponent(medida, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ValueListMaterials = ListMaterials.getSelectedValue();

        float ValueMedida = Float.valueOf(medida.getText());

        if (ValueListMaterials != null && ValueMedida > 0) {
            // Obtener la logica del elemento y saber si la medida es menor a la del material 
            cotizaciones_controllers updateMaterial = new cotizaciones_controllers();
            updateMaterial.updateBigMaterial(ValueListMaterials, ValueMedida);

            // Separamos el string en un arreglo
            String[] arraySplit = ValueListMaterials.split("/");

            String TextWidt = arraySplit[1];
            String[] arrayWidth = TextWidt.split("M");

            if (Float.parseFloat(arrayWidth[0]) > ValueMedida) {
                // Vamos haciendo el ticket
                addElementsArea(ValueListMaterials, ValueMedida);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento y agregar su medida mayor a cero");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ValueListLittleMaterials = ListLittleMaterials.getSelectedValue();
        String cantLittleMaterials = amountLittlelMaterials.getText();
        if (ValueListLittleMaterials != null) {
            cotizaciones_controllers updateLittlelMaterial = new cotizaciones_controllers();
            try {
                updateLittlelMaterial.updateLittleMaterials(ValueListLittleMaterials, cantLittleMaterials);
            } catch (SQLException ex) {
                Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            String[] arraySplit = ValueListLittleMaterials.split("\\s+");

            if (Integer.parseInt(arraySplit[4]) > Integer.parseInt(cantLittleMaterials)) {
                // Vamos haciendo la structura del ticket para tornilleria
                addElementsTornilleriaArea(ValueListLittleMaterials, cantLittleMaterials);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento y agregar una cantidad mayor a 0");
    }//GEN-LAST:event_jButton2ActionPerformed

    }

    public void addElementsArea(String listMaterials, float medida) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String fetch = dtf.format(LocalDateTime.now());

        String head = "Nombre de la Empresa "
                + "\nFecha: " + fetch + "\n================================================ \n\n";
        cotizaciones_controllers structureBigTicket = new cotizaciones_controllers();
        String[] element = structureBigTicket.buildBigStructureTicket(listMaterials, medida);
        ticket += element[0];
        TextAreaCotizacion.setText(ticket);

        price += Float.parseFloat(element[1]);
        totalPriceTextField.setText(valueOf(price));
        try {
            AddMaterialsList();
        } catch (SQLException ex) {
            Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addElementsTornilleriaArea(String listLittlelMaterial, String amount) {
        cotizaciones_controllers buildTicket = new cotizaciones_controllers();
        String[] element = buildTicket.buildLittleStructureTicket(listLittlelMaterial, amount);
        ticket += element[0];
        TextAreaCotizacion.setText(ticket);

        price += Float.parseFloat(element[1]);
        totalPriceTextField.setText(valueOf(price));

        try {
            AddLittleMaterialsList();
        } catch (SQLException ex) {
            Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListLittleMaterials;
    private javax.swing.JList<String> ListMaterials;
    private javax.swing.JTextArea TextAreaCotizacion;
    private javax.swing.JTextField amountLittlelMaterials;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField medida;
    private javax.swing.JTextField totalPriceTextField;
    // End of variables declaration//GEN-END:variables
}
