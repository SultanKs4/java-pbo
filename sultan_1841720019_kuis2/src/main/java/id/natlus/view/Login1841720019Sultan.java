/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.natlus.view;

import id.natlus.model.QueryDatabase1841720019Sultan;

import javax.swing.*;

/**
 * @author kaito
 */
public class Login1841720019Sultan extends javax.swing.JFrame {

    QueryDatabase1841720019Sultan db = new QueryDatabase1841720019Sultan();

    /**
     * Creates new form login1841720019Sultan
     */
    public Login1841720019Sultan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mPwdField = new javax.swing.JPasswordField();
        mTxtField = new javax.swing.JTextField();
        mBtnLogin = new javax.swing.JButton();
        mBtnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        mBtnLogin.setText("Login");
        mBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnLoginActionPerformed(evt);
            }
        });

        mBtnRegister.setText("Register");
        mBtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mPanelLayout = new javax.swing.GroupLayout(mPanel);
        mPanel.setLayout(mPanelLayout);
        mPanelLayout.setHorizontalGroup(
                mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelLayout.createSequentialGroup()
                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mPanelLayout.createSequentialGroup()
                                                .addGap(167, 167, 167)
                                                .addComponent(jLabel1))
                                        .addGroup(mPanelLayout.createSequentialGroup()
                                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(mPanelLayout.createSequentialGroup()
                                                                .addGap(116, 116, 116)
                                                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(mBtnRegister)
                                                                .addGap(5, 5, 5)))
                                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mBtnLogin)
                                                        .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(mPwdField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                                .addComponent(mTxtField)))))
                                .addContainerGap(109, Short.MAX_VALUE))
        );
        mPanelLayout.setVerticalGroup(
                mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(mTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(mPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtnLogin)
                                        .addComponent(mBtnRegister))
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnRegisterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Register1841720019Sultan regis = new Register1841720019Sultan();
        regis.setVisible(true);
    }//GEN-LAST:event_mBtnRegisterActionPerformed

    private void mBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnLoginActionPerformed
        // TODO add your handling code here:
        String pwdText = new String(mPwdField.getPassword());
        Boolean check = db.checkLoginDataSultan(mTxtField.getText(), pwdText);
        if (check) {
            this.setVisible(false);
            Dashboard1841720019Sultan dashboard = new Dashboard1841720019Sultan();
            dashboard.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Username dan Password Salah");
        }

    }//GEN-LAST:event_mBtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1841720019Sultan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mBtnLogin;
    private javax.swing.JButton mBtnRegister;
    private javax.swing.JPanel mPanel;
    private javax.swing.JPasswordField mPwdField;
    private javax.swing.JTextField mTxtField;
    // End of variables declaration//GEN-END:variables
}