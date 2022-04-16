
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
import javax.swing.table.DefaultTableModel;
import models.Owner_Models;

/**
 *
 * @author jo29h
 */
public class newPanel_cotizaciones extends javax.swing.JPanel {

    // Public Variables
    String ticket = "";
    float price = 0;

    public newPanel_cotizaciones() {
        initComponents();
        try {
            AddMaterialsList();
            AddLittleMaterialsList();
            tablaStructure();
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
            modelo.addElement(dataTable.getString("idtornilleria") + " / " + dataTable.getString("name") + " / " + dataTable.getString("inch") + "in / " + "Cantidad: " + dataTable.getString("amount") + " / Precio: " + dataTable.getString("price") + " $");
        }
        // Agregamos los elementos al list
        ListLittleMaterials.setModel(modelo);
    }

    public void addElementsArea(String listMaterials, float medida) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String fetch = dtf.format(LocalDateTime.now());

        cotizaciones_controllers structureBigTicket = new cotizaciones_controllers();
        String[] element = structureBigTicket.buildBigStructureTicket(listMaterials, medida);

        Object objeto[] = {element[0], element[1], element[2], element[3], "1"};
        model.addRow(objeto);
        jTable1.setModel(model);

        price += Float.parseFloat(element[3]);
        totalPriceTextField.setText(valueOf(price));
        try {
            AddMaterialsList();
        } catch (SQLException ex) {
            Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addElementsTornilleriaArea(String listLittlelMaterial, String amount) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        cotizaciones_controllers buildTicket = new cotizaciones_controllers();
        String[] element = buildTicket.buildLittleStructureTicket(listLittlelMaterial, amount);

        Object objeto[] = {element[0], element[1], element[2], element[3], element[4]};
        model.addRow(objeto);
        jTable1.setModel(model);

        price += Float.parseFloat(element[3]);
        totalPriceTextField.setText(valueOf(price));
        try {
            AddLittleMaterialsList();
        } catch (SQLException ex) {
            Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tablaStructure() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Medida");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMaterials = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListLittleMaterials = new javax.swing.JList<>();
        medida = new javax.swing.JTextField();
        amountLittlelMaterials = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchBigMaterials = new javax.swing.JTextField();
        searchLittleMaterial = new javax.swing.JTextField();
        totalPriceTextField = new javax.swing.JTextField();
        deleteMaterialButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Materiales");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Materiales pequeños");

        ListMaterials.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListMaterials);

        ListLittleMaterials.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListLittleMaterials);

        medida.setText("0");

        amountLittlelMaterials.setText("0");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Agregar Material");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setText("Agregar Material Pequeño");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        totalPriceTextField.setBackground(new java.awt.Color(0, 0, 51));
        totalPriceTextField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        totalPriceTextField.setForeground(new java.awt.Color(255, 0, 51));
        totalPriceTextField.setText("Precio");

        deleteMaterialButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteMaterialButton.setText("Eliminar");
        deleteMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMaterialButtonActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBigMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(medida)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchLittleMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                        .addComponent(amountLittlelMaterials))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(deleteMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchBigMaterials, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(searchLittleMaterial))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountLittlelMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medida, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMaterialButtonActionPerformed
        cotizaciones_controllers addReturnMaterial = new cotizaciones_controllers();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String[] dataForDelet = new String[5];

        for (int i = 0; i <=4; i++) {
            dataForDelet[i] = (String) model.getValueAt(jTable1.getSelectedRow(), i);
        }

        String[] arraySplit = dataForDelet[2].split("i"); // Saber si es bigMaterial o littleMaterial

        if (arraySplit.length > 1) {
            try {
                addReturnMaterial.deletElement(4, dataForDelet[0], dataForDelet[4]);
                AddLittleMaterialsList();
                model.removeRow(jTable1.getSelectedRow());
            } catch (SQLException ex) {
                Logger.getLogger(newPanel_cotizaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                addReturnMaterial.deletElement(1, dataForDelet[0], dataForDelet[2]);
                AddMaterialsList();
                model.removeRow(jTable1.getSelectedRow());
            } catch (SQLException ex) {
                Logger.getLogger(newPanel_cotizaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteMaterialButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cotizaciones_controllers updateLittlelMaterial = new cotizaciones_controllers();

        String ValueListLittleMaterials = ListLittleMaterials.getSelectedValue();
        String cantLittleMaterials = amountLittlelMaterials.getText();

        String[] arraySplit = ValueListLittleMaterials.split("/");
        String[] arrayAmountSplit = arraySplit[3].split("\\s+"); // Obtenemos la cantidad

        if (ValueListLittleMaterials != null & Integer.parseInt(cantLittleMaterials) > 0) {
            if (Integer.parseInt(arrayAmountSplit[2]) >= Integer.parseInt(cantLittleMaterials)) {
                try {
                    updateLittlelMaterial.updateLittleMaterials(ValueListLittleMaterials, cantLittleMaterials);
                    addElementsTornilleriaArea(ValueListLittleMaterials, cantLittleMaterials);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo hacer la actualizacion");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad es mayor a la disponible");
            }
            //try {
            //  updateLittlelMaterial.updateLittleMaterials(ValueListLittleMaterials, cantLittleMaterials);
            //} catch (SQLException ex) {
            //   Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
            //}
            //String[] arraySplit = ValueListLittleMaterials.split("\\s+");

//            if (Integer.parseInt(arraySplit[4]) > Integer.parseInt(cantLittleMaterials)) {
            // Vamos haciendo la structura del ticket para tornilleria
            //              addElementsTornilleriaArea(ValueListLittleMaterials, cantLittleMaterials);
            //        }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento y agregar una cantidad mayor a 0");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ValueListMaterials = ListMaterials.getSelectedValue();

        float ValueMedida = Float.valueOf(medida.getText());

        if (ValueListMaterials != null && ValueMedida > 0) {
            // Separamos el string en un arreglo
            String[] arraySplit = ValueListMaterials.split("/");

            String TextWidt = arraySplit[1];
            String[] arrayWidth = TextWidt.split("M");
            // Obtener la logica del elemento y saber si la medida es menor a la del material 

            if (Float.parseFloat(arrayWidth[0]) >= ValueMedida) {
                cotizaciones_controllers updateMaterial = new cotizaciones_controllers();
                updateMaterial.updateBigMaterial(ValueListMaterials, ValueMedida);
                // Vamos haciendo el ticket
                addElementsArea(ValueListMaterials, ValueMedida);
            } else {
                JOptionPane.showMessageDialog(null, "La medida que pide es mayor a la del producto \n"
                        + "Por favor seleccione otro producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento y agregar su medida mayor a cero");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListLittleMaterials;
    private javax.swing.JList<String> ListMaterials;
    private javax.swing.JTextField amountLittlelMaterials;
    private javax.swing.JButton deleteMaterialButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medida;
    private javax.swing.JTextField searchBigMaterials;
    private javax.swing.JTextField searchLittleMaterial;
    private javax.swing.JTextField totalPriceTextField;
    // End of variables declaration//GEN-END:variables
}
