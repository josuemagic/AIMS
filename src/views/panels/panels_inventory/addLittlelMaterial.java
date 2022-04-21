package views.panels.panels_inventory;

import controllers.Inventory_Controllers;
import javax.swing.JOptionPane;

public class addLittlelMaterial extends javax.swing.JPanel {

    public addLittlelMaterial() {
        initComponents();
    }

    public boolean validationForm(String name, String inch, String amount, String price) {
        if (name.equals("") || inch.equals("") || price.equals("") || amount.equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser oblicatorios");
            return false;
        }
        if (inch.equals("0") || price.equals("0") || amount.equals("0")) {
            JOptionPane.showMessageDialog(null, "Inch, Cantida y Precio deben ser mayor a 0");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addLittlelMaterial = new javax.swing.JPanel();
        textName = new javax.swing.JTextField();
        textIncch = new javax.swing.JTextField();
        textAmount = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        addLittleMaterial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        addLittlelMaterial.setBackground(new java.awt.Color(0, 51, 51));

        textName.setText("Nombre");
        textName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                textNameMouseDragged(evt);
            }
        });
        textName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNameMouseClicked(evt);
            }
        });

        textIncch.setText("0");
        textIncch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textIncchMouseClicked(evt);
            }
        });

        textAmount.setText("0");
        textAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAmountMouseClicked(evt);
            }
        });

        textPrice.setText("0");
        textPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPriceMouseClicked(evt);
            }
        });

        addLittleMaterial.setText("Agregar Material");
        addLittleMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLittleMaterialActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inch");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        javax.swing.GroupLayout addLittlelMaterialLayout = new javax.swing.GroupLayout(addLittlelMaterial);
        addLittlelMaterial.setLayout(addLittlelMaterialLayout);
        addLittlelMaterialLayout.setHorizontalGroup(
            addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIncch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addComponent(addLittleMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addLittlelMaterialLayout.setVerticalGroup(
            addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(addLittleMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addLittlelMaterialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(addLittlelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textIncch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addLittlelMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addLittlelMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addLittleMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLittleMaterialActionPerformed
        String name = textName.getText();
        String inch = textIncch.getText();
        String price = textPrice.getText();
        String amount = textAmount.getText();

        if (validationForm(name, inch, amount, price)) {
            Inventory_Controllers AIC = new Inventory_Controllers();
            AIC.addLittleMaterial(name, inch, amount, price);

            JOptionPane.showMessageDialog(null, "Se agrego el material");
        }

    }//GEN-LAST:event_addLittleMaterialActionPerformed

    private void textNameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNameMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameMouseDragged

    private void textNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNameMouseClicked
        textName.setText("");
    }//GEN-LAST:event_textNameMouseClicked

    private void textAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAmountMouseClicked
        textAmount.setText("");
    }//GEN-LAST:event_textAmountMouseClicked

    private void textIncchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textIncchMouseClicked
        textIncch.setText("");
    }//GEN-LAST:event_textIncchMouseClicked

    private void textPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPriceMouseClicked
         textPrice.setText("");
    }//GEN-LAST:event_textPriceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLittleMaterial;
    private javax.swing.JPanel addLittlelMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textAmount;
    private javax.swing.JTextField textIncch;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPrice;
    // End of variables declaration//GEN-END:variables
}
