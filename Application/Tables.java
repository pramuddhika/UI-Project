package Application.Cashier;

import backend_files.Connect_DB;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tables extends javax.swing.JFrame {

    public Tables() {
        initComponents();
        updateAllUI();
        jPanel1.setBackground(new Color(25,25,25,200));
        jPanel2.setBackground(new Color(25,25,25,200));
        jPanel3.setBackground(new Color(25,25,25,200));
    }

    Connect_DB cdb = new Connect_DB();
    String[] btnNames = {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "T1", "T2", "T3", "T4"};
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        F10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        T1 = new javax.swing.JButton();
        T2 = new javax.swing.JButton();
        T3 = new javax.swing.JButton();
        T4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C1.setForeground(new java.awt.Color(204, 204, 204));
        C1.setText("Couple_1");
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 56));

        C2.setForeground(new java.awt.Color(204, 204, 204));
        C2.setText("Couple_2");
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 90, 56));

        C3.setForeground(new java.awt.Color(204, 204, 204));
        C3.setText("Couple_3");
        C3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 210, 90, 56));

        C4.setForeground(new java.awt.Color(204, 204, 204));
        C4.setText("Couple_4");
        C4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 87, 56));

        C5.setForeground(new java.awt.Color(204, 204, 204));
        C5.setText("Couple_5");
        C5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });
        getContentPane().add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 90, 56));

        C6.setForeground(new java.awt.Color(204, 204, 204));
        C6.setText("Couple_6");
        C6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });
        getContentPane().add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 300, 90, 56));

        C7.setForeground(new java.awt.Color(204, 204, 204));
        C7.setText("Couple_7");
        C7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });
        getContentPane().add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 380, 90, 56));

        C8.setForeground(new java.awt.Color(204, 204, 204));
        C8.setText("Couple_8");
        C8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });
        getContentPane().add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 90, 56));

        C9.setForeground(new java.awt.Color(204, 204, 204));
        C9.setText("Couple_9");
        C9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C9MouseClicked(evt);
            }
        });
        getContentPane().add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 90, 56));

        C10.setForeground(new java.awt.Color(204, 204, 204));
        C10.setText("Couple_10");
        C10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C10MouseClicked(evt);
            }
        });
        getContentPane().add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 90, 56));

        F1.setForeground(new java.awt.Color(204, 204, 204));
        F1.setText("Family_1");
        F1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F1MouseClicked(evt);
            }
        });
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 90, 56));

        F2.setForeground(new java.awt.Color(204, 204, 204));
        F2.setText("Family_2");
        F2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F2MouseClicked(evt);
            }
        });
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 90, 56));

        F3.setForeground(new java.awt.Color(204, 204, 204));
        F3.setText("Family_3");
        F3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F3MouseClicked(evt);
            }
        });
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 90, 56));

        F4.setForeground(new java.awt.Color(204, 204, 204));
        F4.setText("Family_4");
        F4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F4MouseClicked(evt);
            }
        });
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 90, 56));

        F5.setForeground(new java.awt.Color(204, 204, 204));
        F5.setText("Family_5");
        F5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F5MouseClicked(evt);
            }
        });
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 90, 56));

        F6.setForeground(new java.awt.Color(204, 204, 204));
        F6.setText("Family_6");
        F6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F6MouseClicked(evt);
            }
        });
        getContentPane().add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 90, 56));

        F7.setForeground(new java.awt.Color(204, 204, 204));
        F7.setText("Family_7");
        F7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F7MouseClicked(evt);
            }
        });
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 90, 56));

        F8.setForeground(new java.awt.Color(204, 204, 204));
        F8.setText("Family_8");
        F8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F8MouseClicked(evt);
            }
        });
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 90, 56));

        F9.setForeground(new java.awt.Color(204, 204, 204));
        F9.setText("Family_9");
        F9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F9MouseClicked(evt);
            }
        });
        getContentPane().add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 90, 56));

        F10.setForeground(new java.awt.Color(204, 204, 204));
        F10.setText("Family_10");
        F10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F10MouseClicked(evt);
            }
        });
        getContentPane().add(F10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 90, 56));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Couple");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 380, 420));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Family");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 400, 420));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Team");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 40));

        T1.setForeground(new java.awt.Color(204, 204, 204));
        T1.setText("Team_01");
        T1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T1MouseClicked(evt);
            }
        });
        jPanel3.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 56));

        T2.setForeground(new java.awt.Color(204, 204, 204));
        T2.setText("Team_02");
        T2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T2MouseClicked(evt);
            }
        });
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        jPanel3.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 56));

        T3.setForeground(new java.awt.Color(204, 204, 204));
        T3.setText("Team_03");
        T3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T3MouseClicked(evt);
            }
        });
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        jPanel3.add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 56));

        T4.setForeground(new java.awt.Color(204, 204, 204));
        T4.setText("Team_04");
        T4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T4MouseClicked(evt);
            }
        });
        jPanel3.add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 56));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 200, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maxresdefault (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        changeTableStatus(selectedTable("C1"));
        updateAllUI();
    }//GEN-LAST:event_C1MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        changeTableStatus(selectedTable("C2"));
        updateAllUI();
    }//GEN-LAST:event_C2MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        changeTableStatus(selectedTable("C3"));
        updateAllUI();
    }//GEN-LAST:event_C3MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        changeTableStatus(selectedTable("C4"));
        updateAllUI();
    }//GEN-LAST:event_C4MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        changeTableStatus(selectedTable("C5"));
        updateAllUI();
    }//GEN-LAST:event_C5MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        changeTableStatus(selectedTable("C6"));
        updateAllUI();
    }//GEN-LAST:event_C6MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        changeTableStatus(selectedTable("C7"));
        updateAllUI();
    }//GEN-LAST:event_C7MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        changeTableStatus(selectedTable("C8"));
        updateAllUI();
    }//GEN-LAST:event_C8MouseClicked

    private void C9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseClicked
        changeTableStatus(selectedTable("C9"));
        updateAllUI();
    }//GEN-LAST:event_C9MouseClicked

    private void C10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseClicked
        changeTableStatus(selectedTable("C10"));
        updateAllUI();
    }//GEN-LAST:event_C10MouseClicked

    private void F1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseClicked
        changeTableStatus(selectedTable("F1"));
        updateAllUI();
    }//GEN-LAST:event_F1MouseClicked

    private void F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseClicked
        changeTableStatus(selectedTable("F2"));
        updateAllUI();
    }//GEN-LAST:event_F2MouseClicked

    private void F3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseClicked
        changeTableStatus(selectedTable("F3"));
        updateAllUI();
    }//GEN-LAST:event_F3MouseClicked

    private void F4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseClicked
        changeTableStatus(selectedTable("F4"));
        updateAllUI();
    }//GEN-LAST:event_F4MouseClicked

    private void F5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseClicked
        changeTableStatus(selectedTable("F5"));
        updateAllUI();
    }//GEN-LAST:event_F5MouseClicked

    private void F6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseClicked
        changeTableStatus(selectedTable("F6"));
        updateAllUI();
    }//GEN-LAST:event_F6MouseClicked

    private void F7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseClicked
        changeTableStatus(selectedTable("F7"));
        updateAllUI();
    }//GEN-LAST:event_F7MouseClicked

    private void F8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseClicked
        changeTableStatus(selectedTable("F8"));
        updateAllUI();
    }//GEN-LAST:event_F8MouseClicked

    private void F9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F9MouseClicked
        changeTableStatus(selectedTable("F9"));
        updateAllUI();
    }//GEN-LAST:event_F9MouseClicked

    private void F10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F10MouseClicked
        changeTableStatus(selectedTable("F10"));
        updateAllUI();
    }//GEN-LAST:event_F10MouseClicked

    private void T1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseClicked
        changeTableStatus(selectedTable("T1"));
        updateAllUI();
    }//GEN-LAST:event_T1MouseClicked

    private void T2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T2MouseClicked
        changeTableStatus(selectedTable("T2"));
        updateAllUI();
    }//GEN-LAST:event_T2MouseClicked

    private void T3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T3MouseClicked
        changeTableStatus(selectedTable("T3"));
        updateAllUI();
    }//GEN-LAST:event_T3MouseClicked

    private void T4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T4MouseClicked
        changeTableStatus(selectedTable("T4"));
        updateAllUI();
    }//GEN-LAST:event_T4MouseClicked

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F5ActionPerformed

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
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tables().setVisible(true);
            }
        });
    }

    //Return selected Table's Table ID
    private int selectedTable(String selectedButton) {

        for (int i = 0; i < btnNames.length; i++) {
            if (btnNames[i].equals(selectedButton)) {
                return numbers[i];
            }
        }
        return 0;
    }

    //Read current table's status
    private String getTableStatus(int tableID) {
        try {
            Connection conn = cdb.getConnection();
            String sqlQuery = "SELECT status FROM tables WHERE tableID = '" + tableID + "';";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                String status = resultSet.getString("status");
                return status;
            } else {
                return "";
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            return e.toString();
        }
    }

    //UI update according to the status
    private void updateUI(String tableName, String status) {

        Color available = Color.GREEN;
        Color reseved = Color.RED;
        Color bgColor;

        if (status.equals("A")) {
            bgColor = available;
        } else if (status.equals("R")) {
            bgColor = reseved;
        } else {
            bgColor = Color.BLUE;
        }

        switch (tableName) {
            case "C1":
                C1.setBackground(bgColor);
                break;
            case "C2":
                C2.setBackground(bgColor);
                break;
            case "C3":
                C3.setBackground(bgColor);
                break;
            case "C4":
                C4.setBackground(bgColor);
                break;
            case "C5":
                C5.setBackground(bgColor);
                break;
            case "C6":
                C6.setBackground(bgColor);
                break;
            case "C7":
                C7.setBackground(bgColor);
                break;
            case "C8":
                C8.setBackground(bgColor);
                break;
            case "C9":
                C9.setBackground(bgColor);
                break;
            case "C10":
                C10.setBackground(bgColor);
                break;
            case "F1":
                F1.setBackground(bgColor);
                break;
            case "F2":
                F2.setBackground(bgColor);
                break;
            case "F3":
                F3.setBackground(bgColor);
                break;
            case "F4":
                F4.setBackground(bgColor);
                break;
            case "F5":
                F5.setBackground(bgColor);
                break;
            case "F6":
                F6.setBackground(bgColor);
                break;
            case "F7":
                F7.setBackground(bgColor);
                break;
            case "F8":
                F8.setBackground(bgColor);
                break;
            case "F9":
                F9.setBackground(bgColor);
                break;
            case "F10":
                F10.setBackground(bgColor);
                break;
            case "T1":
                T1.setBackground(bgColor);
                break;
            case "T2":
                T2.setBackground(bgColor);
                break;
            case "T3":
                T3.setBackground(bgColor);
                break;
            case "T4":
                T4.setBackground(bgColor);
                break;
            default:
                System.out.println("Error");
        }

    }

    //Update all UI according to the database at once.
    private void updateAllUI() {

        updateUI("C1", getTableStatus(selectedTable("C1")));
        updateUI("C2", getTableStatus(selectedTable("C2")));
        updateUI("C3", getTableStatus(selectedTable("C3")));
        updateUI("C4", getTableStatus(selectedTable("C4")));
        updateUI("C5", getTableStatus(selectedTable("C5")));
        updateUI("C6", getTableStatus(selectedTable("C6")));
        updateUI("C7", getTableStatus(selectedTable("C7")));
        updateUI("C8", getTableStatus(selectedTable("C8")));
        updateUI("C9", getTableStatus(selectedTable("C9")));
        updateUI("C10", getTableStatus(selectedTable("C10")));

        updateUI("F1", getTableStatus(selectedTable("F1")));
        updateUI("F2", getTableStatus(selectedTable("F2")));
        updateUI("F3", getTableStatus(selectedTable("F3")));
        updateUI("F4", getTableStatus(selectedTable("F4")));
        updateUI("F5", getTableStatus(selectedTable("F5")));
        updateUI("F6", getTableStatus(selectedTable("F6")));
        updateUI("F7", getTableStatus(selectedTable("F7")));
        updateUI("F8", getTableStatus(selectedTable("F8")));
        updateUI("F9", getTableStatus(selectedTable("F9")));
        updateUI("F10", getTableStatus(selectedTable("F10")));

        updateUI("T1", getTableStatus(selectedTable("T1")));
        updateUI("T2", getTableStatus(selectedTable("T2")));
        updateUI("T3", getTableStatus(selectedTable("T3")));
        updateUI("T4", getTableStatus(selectedTable("T4")));

    }

    //Changee the table status
    private void changeTableStatus(int tableID) {

        Connection conn = cdb.getConnection();

        try {

            String sql = "UPDATE tables SET status = 'R' WHERE status = 'A' AND tableID = '" + tableID + "';";
            Statement statement = conn.createStatement();
            int rowsUpdated = statement.executeUpdate(sql);

            if (rowsUpdated == 0) {
                sql = "UPDATE tables SET status = 'A' WHERE status = 'R' AND tableID = '" + tableID + "';";
                statement = conn.createStatement();
                rowsUpdated = statement.executeUpdate(sql);
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JButton F1;
    private javax.swing.JButton F10;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton F9;
    private javax.swing.JButton T1;
    private javax.swing.JButton T2;
    private javax.swing.JButton T3;
    private javax.swing.JButton T4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
