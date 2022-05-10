package views.panels;

import controllers.Inventory_Controllers;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import views.panels.panels_inventory.addBigMaterial;
import views.panels.panels_inventory.addLittlelMaterial;

public class panel_inventory extends javax.swing.JPanel {

    public panel_inventory() {
        initComponents();
        structureTable();
        try {
            getInventaryMaterial();
        } catch (SQLException ex) {
            Logger.getLogger(panel_inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getInventaryMaterial() throws SQLException {
        Inventory_Controllers GIBM = new Inventory_Controllers();
        DefaultTableModel model = (DefaultTableModel) tableInventary.getModel();

        tableInventary.setModel(model);

        ResultSet dataTable = GIBM.getInventoryBigMaterial();
        ResultSet LittledataTable = GIBM.getInventoryLittleMaterial();

        while (dataTable.next()) {
            Object objeto[] = {dataTable.getString("idespecifications"), dataTable.getString("name"), dataTable.getString("width"), dataTable.getString("price"), "1"};
            model.addRow(objeto);
            tableInventary.setModel(model);
        }

        while (LittledataTable.next()) {
            Object objeto[] = {LittledataTable.getString("idtornilleria"), LittledataTable.getString("name"), LittledataTable.getString("inch") + " in", LittledataTable.getString("price"), LittledataTable.getString("amount")};
            model.addRow(objeto);
            tableInventary.setModel(model);
        }
    }

    public void structureTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Medida");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        tableInventary.setModel(model);
    }

    private void ShowPanel(JPanel p) {
        p.setSize(1018, 406);
        p.setLocation(0, 0);

        panelDinamycAddMaterial.removeAll();
        panelDinamycAddMaterial.add(p, BorderLayout.CENTER);
        panelDinamycAddMaterial.revalidate();
        panelDinamycAddMaterial.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventary = new javax.swing.JTable();
        panelDinamycAddMaterial = new javax.swing.JPanel();
        addBigMaterial = new javax.swing.JButton();
        addLittlelMaterial = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventario");

        tableInventary.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableInventary.setModel(new javax.swing.table.DefaultTableModel(
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
        tableInventary.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tableInventary.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tableInventaryMouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(tableInventary);

        panelDinamycAddMaterial.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelDinamycAddMaterialLayout = new javax.swing.GroupLayout(panelDinamycAddMaterial);
        panelDinamycAddMaterial.setLayout(panelDinamycAddMaterialLayout);
        panelDinamycAddMaterialLayout.setHorizontalGroup(
            panelDinamycAddMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        panelDinamycAddMaterialLayout.setVerticalGroup(
            panelDinamycAddMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        addBigMaterial.setBackground(new java.awt.Color(0, 0, 0));
        addBigMaterial.setForeground(new java.awt.Color(255, 255, 255));
        addBigMaterial.setText("Agregar Material");
        addBigMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBigMaterialActionPerformed(evt);
            }
        });

        addLittlelMaterial.setBackground(new java.awt.Color(0, 0, 0));
        addLittlelMaterial.setForeground(new java.awt.Color(255, 255, 255));
        addLittlelMaterial.setText("Agregar Material De Herrajeria");
        addLittlelMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLittlelMaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBigMaterial)
                        .addGap(460, 460, 460)
                        .addComponent(addLittlelMaterial)
                        .addGap(116, 116, 116))
                    .addComponent(panelDinamycAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(695, 695, 695)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBigMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLittlelMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(panelDinamycAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableInventaryMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInventaryMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tableInventaryMouseDragged

    private void addBigMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBigMaterialActionPerformed
        addBigMaterial ABM = new addBigMaterial();
        ShowPanel(ABM);
    }//GEN-LAST:event_addBigMaterialActionPerformed

    private void addLittlelMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLittlelMaterialActionPerformed
        addLittlelMaterial ALM = new addLittlelMaterial();
        ShowPanel(ALM);
    }//GEN-LAST:event_addLittlelMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBigMaterial;
    private javax.swing.JButton addLittlelMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDinamycAddMaterial;
    private javax.swing.JTable tableInventary;
    // End of variables declaration//GEN-END:variables
}
