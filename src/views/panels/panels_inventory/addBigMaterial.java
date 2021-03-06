package views.panels.panels_inventory;

import controllers.Inventory_Controllers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import views.panels.panel_inventory;

public class addBigMaterial extends javax.swing.JPanel {

    public addBigMaterial() {
        initComponents();
    }

    public boolean validationForm(String name, String color, String inch, String caliber, String price, String width) {
        if (name.equals("") || color.equals("") || inch.equals("") || caliber.equals("") || price.equals("") || width.equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser oblicatorios");
            return false;
        }
        if (inch.equals("0") || caliber.equals("0") || price.equals("0") || width.equals("0")) {
            JOptionPane.showMessageDialog(null, "Inch, Medida, Calibre y Precio deben ser mayor a 0");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPanelBigMaterial = new javax.swing.JPanel();
        nameMaterial = new javax.swing.JTextField();
        colotMaterial = new javax.swing.JTextField();
        caliberMaterial = new javax.swing.JTextField();
        inchMaterial = new javax.swing.JTextField();
        priceMaterial = new javax.swing.JTextField();
        widthMaterial = new javax.swing.JTextField();
        addButtonMaterial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        addPanelBigMaterial.setBackground(new java.awt.Color(153, 153, 153));

        nameMaterial.setText("Nombre ");
        nameMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMaterialMouseClicked(evt);
            }
        });
        nameMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameMaterialKeyTyped(evt);
            }
        });

        colotMaterial.setText("Color");
        colotMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colotMaterialMouseClicked(evt);
            }
        });
        colotMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colotMaterialKeyTyped(evt);
            }
        });

        caliberMaterial.setText("0");
        caliberMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caliberMaterialMouseClicked(evt);
            }
        });
        caliberMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caliberMaterialKeyTyped(evt);
            }
        });

        inchMaterial.setText("0");
        inchMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inchMaterialMouseClicked(evt);
            }
        });
        inchMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inchMaterialKeyTyped(evt);
            }
        });

        priceMaterial.setText("0");
        priceMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceMaterialMouseClicked(evt);
            }
        });
        priceMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceMaterialKeyTyped(evt);
            }
        });

        widthMaterial.setText("0");
        widthMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                widthMaterialMouseClicked(evt);
            }
        });
        widthMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                widthMaterialKeyTyped(evt);
            }
        });

        addButtonMaterial.setBackground(new java.awt.Color(0, 0, 0));
        addButtonMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/confirm.png"))); // NOI18N
        addButtonMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonMaterialActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Color");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Calibre");

        jLabel4.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Inch");

        jLabel5.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Largo");

        jLabel7.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Confirmar");

        javax.swing.GroupLayout addPanelBigMaterialLayout = new javax.swing.GroupLayout(addPanelBigMaterial);
        addPanelBigMaterial.setLayout(addPanelBigMaterialLayout);
        addPanelBigMaterialLayout.setHorizontalGroup(
            addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                        .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caliberMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(priceMaterial))
                        .addGap(80, 80, 80)
                        .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(widthMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelBigMaterialLayout.createSequentialGroup()
                                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                                        .addComponent(inchMaterial)
                                        .addGap(172, 172, 172)))
                                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButtonMaterial)
                                    .addComponent(jLabel7))
                                .addGap(96, 96, 96))))
                    .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                        .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(159, 159, 159))
                            .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                                .addComponent(nameMaterial)
                                .addGap(80, 80, 80)))
                        .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colotMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(319, 344, Short.MAX_VALUE))))
        );
        addPanelBigMaterialLayout.setVerticalGroup(
            addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colotMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButtonMaterial))
                    .addGroup(addPanelBigMaterialLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inchMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caliberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelBigMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(widthMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanelBigMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addPanelBigMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonMaterialActionPerformed
        String name = nameMaterial.getText();
        String color = colotMaterial.getText();
        String inch = inchMaterial.getText();
        String caliber = caliberMaterial.getText();
        String price = priceMaterial.getText();
        String width = widthMaterial.getText();

        if (validationForm(name, color, inch, caliber, price, width)) {
            Inventory_Controllers IC = new Inventory_Controllers();
            try {
                IC.addBigMaterial(name, color, inch, caliber, price, width);
            } catch (SQLException ex) {
                Logger.getLogger(addBigMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Se agrego el material");
        }
    }//GEN-LAST:event_addButtonMaterialActionPerformed

    private void nameMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMaterialMouseClicked
        nameMaterial.setText("");
    }//GEN-LAST:event_nameMaterialMouseClicked

    private void colotMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colotMaterialMouseClicked
        colotMaterial.setText("");
    }//GEN-LAST:event_colotMaterialMouseClicked

    private void caliberMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caliberMaterialMouseClicked
        caliberMaterial.setText("");
    }//GEN-LAST:event_caliberMaterialMouseClicked

    private void inchMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inchMaterialMouseClicked
        inchMaterial.setText("");
    }//GEN-LAST:event_inchMaterialMouseClicked

    private void priceMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMaterialMouseClicked
        priceMaterial.setText("");
    }//GEN-LAST:event_priceMaterialMouseClicked

    private void widthMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widthMaterialMouseClicked
        widthMaterial.setText("");
    }//GEN-LAST:event_widthMaterialMouseClicked

    private void widthMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthMaterialKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (widthMaterial.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_widthMaterialKeyTyped

    private void priceMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceMaterialKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (priceMaterial.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_priceMaterialKeyTyped

    private void caliberMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caliberMaterialKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (caliberMaterial.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_caliberMaterialKeyTyped

    private void nameMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameMaterialKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameMaterialKeyTyped

    private void colotMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colotMaterialKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_colotMaterialKeyTyped

    private void inchMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inchMaterialKeyTyped
         int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }

    if (inchMaterial.getText().trim().length() == 10) {
        evt.consume();
    }
    }//GEN-LAST:event_inchMaterialKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButtonMaterial;
    private javax.swing.JPanel addPanelBigMaterial;
    private javax.swing.JTextField caliberMaterial;
    private javax.swing.JTextField colotMaterial;
    private javax.swing.JTextField inchMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameMaterial;
    private javax.swing.JTextField priceMaterial;
    private javax.swing.JTextField widthMaterial;
    // End of variables declaration//GEN-END:variables
}
