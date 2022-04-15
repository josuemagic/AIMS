/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Login_Models;

/**
 *
 * @author jo29h
 */
public class Login_View extends javax.swing.JFrame {

    /**
     * Creates new form Login_View
     */
    public Login_View() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrincipalPanel = new javax.swing.JPanel();
        PanelForm = new javax.swing.JPanel();
        LabelImageLogo = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        TextFieldUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelButtonLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LabelCloseSystem = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrincipalPanel.setBackground(new java.awt.Color(0, 0, 51));
        PrincipalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelForm.setBackground(new java.awt.Color(0, 0, 51));
        PanelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelImageLogo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LabelImageLogo.setForeground(new java.awt.Color(255, 255, 255));
        LabelImageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/favicon.png"))); // NOI18N
        LabelImageLogo.setText("Iniciar Sesion");
        PanelForm.add(LabelImageLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 14, 286, 83));

        LabelUser.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(255, 255, 255));
        LabelUser.setText("Usuario");
        PanelForm.add(LabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 103, 121, 44));

        TextFieldUser.setBackground(new java.awt.Color(0, 0, 51));
        TextFieldUser.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldUser.setText("Introducir usuario");
        TextFieldUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TextFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldUserMousePressed(evt);
            }
        });
        PanelForm.add(TextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 290, 46));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        PanelForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 175, 37));

        PasswordField.setBackground(new java.awt.Color(0, 0, 51));
        PasswordField.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(204, 204, 204));
        PasswordField.setText("********");
        PasswordField.setBorder(null);
        PasswordField.setNextFocusableComponent(PanelButtonLogin);
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordFieldMousePressed(evt);
            }
        });
        PanelForm.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 46));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("________________________________________________");
        PanelForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_____________________________________________");
        PanelForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 300, 30));

        PanelButtonLogin.setBackground(new java.awt.Color(0, 102, 153));

        jLabel5.setBackground(new java.awt.Color(0, 102, 204));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Entrar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonLoginLayout = new javax.swing.GroupLayout(PanelButtonLogin);
        PanelButtonLogin.setLayout(PanelButtonLoginLayout);
        PanelButtonLoginLayout.setHorizontalGroup(
            PanelButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtonLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelButtonLoginLayout.setVerticalGroup(
            PanelButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtonLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelForm.add(PanelButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 150, 60));

        LabelCloseSystem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelCloseSystem.setForeground(new java.awt.Color(255, 0, 51));
        LabelCloseSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCloseSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/exit.png"))); // NOI18N
        LabelCloseSystem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelCloseSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabelCloseSystemMousePressed(evt);
            }
        });
        PanelForm.add(LabelCloseSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 70, 70));

        PrincipalPanel.add(PanelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 490));

        LabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        PrincipalPanel.add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldUserMousePressed
        // Event in TextFieldUser 
        TextFieldUser.setText("");
    }//GEN-LAST:event_TextFieldUserMousePressed

    private void PasswordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMousePressed
        // Event in PasswordField
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // Event in ButtonEnter
        String user = TextFieldUser.getText();
        String password = PasswordField.getText();
        Login_Models log = new Login_Models(user, password);
        var access = log.Login();
        if (access != null) {
            Menu_Owner_View MV = new Menu_Owner_View();
            Menu_Empleados_View MEV = new Menu_Empleados_View();
            try {
                if (access.getInt(3) == 1) {
                    MV.setVisible(true);
                } else {
                    MEV.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login_View.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        } else {
            TextFieldUser.setText("");
            PasswordField.setText("");
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
        }
    }//GEN-LAST:event_jLabel5MousePressed

    private void LabelCloseSystemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCloseSystemMousePressed
        // Evento in ButtonExit
        System.exit(0);
    }//GEN-LAST:event_LabelCloseSystemMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCloseSystem;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JLabel LabelImageLogo;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JPanel PanelButtonLogin;
    private javax.swing.JPanel PanelForm;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JTextField TextFieldUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
