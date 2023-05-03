/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import Massege_boxes.Login_Msgs;
import backend_files.Encrypter;
import backend_files.Connect_DB;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import Application.Manager.Registration;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginMsg = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPsw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 10, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginMsg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginMsg.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(loginMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 330, 270, 42));

        lblLogin.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(8, 104, 192));
        lblLogin.setText("Welcome");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 70));

        btnLogin.setBackground(new java.awt.Color(8, 104, 192));
        btnLogin.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        btnClear.setBackground(new java.awt.Color(8, 104, 192));
        btnClear.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        lblUser.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(8, 104, 192));
        lblUser.setText("Username : ");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtUser.setBackground(new java.awt.Color(204, 204, 204));
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, -1));

        txtPsw.setBackground(new java.awt.Color(204, 204, 204));
        txtPsw.setForeground(new java.awt.Color(0, 0, 0));
        txtPsw.setBorder(null);
        txtPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPswKeyTyped(evt);
            }
        });
        jPanel1.add(txtPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 104, 192));
        jLabel1.setText("Password : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 330, 2));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 330, 2));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 390, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 480, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //login button
    
    /**
     * 
     * When button clicked check the all fields are filled *
     * If this condition won't fulfilled display three messages regarding to the particular situation.
     * If the condition fulfilled check the username and password available in the database.
     * 
        * If this fulfilled check then check the user's status.
        * 
            * If it is either Admin or Manager Go to sales section. pasindu - pb, rasanga - rs, avishna -av
            * If it is Cashier Go to Cashier's section.
            * 
        *Else
            * Show username and password is incorrect message   
    */
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        Login_Msgs logins = new Login_Msgs();
        
            // Login Validation
        
        if(txtUser.getText().equals("") & !(txtPsw.getText().equals(""))){
                //Show Enter Username Messege
            loginMsg.setText(logins.getUserEmptyMsg());
            txtPsw.setText("");
            
        }else if(!(txtUser.getText().equals("")) & (txtPsw.getText().equals(""))){
                //Show enter Password Messege
            loginMsg.setText(logins.getPswEmptyMsg());
            txtUser.setText("");

            
        }else if(txtUser.getText().equals("") & (txtPsw.getText().equals(""))){
                //Show enter both username and password Messege
            loginMsg.setText(logins.getBothEmptyMsg());
            txtUser.setText("");
            txtPsw.setText("");
            
        }else{  
            
            Encrypter enc = new Encrypter();
            String encryptedPsw = null;
            
            try {
                    //Encrypt the password
                encryptedPsw = enc.secure(txtPsw.getText());
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Connect_DB cdb = new Connect_DB();
            
            try {
                    //Execute the query
                Connection connection = cdb.getConnection();
                String sql = "SELECT username, status FROM users WHERE users.password = ? AND users.username = ?"; // Replace with your own SELECT query
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, encryptedPsw);
                statement.setString(2, txtUser.getText());
                ResultSet result = statement.executeQuery();

                    //Validations
                if (result.next()) {
                    char status = result.getString("status").charAt(0);

                    if(status == 'A' || status == 'M'){
                            //Admin and manager
                        
                        Registration reg = new Registration();
                        reg.setVisible(true);
                        this.dispose();
                        
                    }else if(status == 'C'){
                            //Cashier
                        this.dispose();
                    }
                } else {
                    loginMsg.setText(logins.getBothIncorrectMsg());
                    txtUser.setText("");
                    txtPsw.setText("");
                }
                connection.close();
            } catch (SQLException e) {
                loginMsg.setText("Error: " + e.getMessage());
            }           
        }
    }//GEN-LAST:event_btnLoginActionPerformed

        //clear button
        //clears the username and password
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     
        txtUser.setText("");
        txtPsw.setText("");
        loginMsg.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed

        this.loginMsg.setText("");
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPswKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPswKeyTyped
        this.loginMsg.setText("");
    }//GEN-LAST:event_txtPswKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel loginMsg;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
