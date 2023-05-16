package Application.Manager;

import backend_files.Connect_DB;
import java.awt.Color;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Products extends javax.swing.JFrame {

    public Products() {
        initComponents();
        loadProducts();
        jPanel2.setBackground(new Color(25,25,25,200));
        tblProducts.setBackground(new Color(25,25,25,200));
        jPanel3.setBackground(new Color(25,25,25,200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblProDesc_New = new javax.swing.JLabel();
        txtProDesc_New = new javax.swing.JTextField();
        lblPrice_New = new javax.swing.JLabel();
        txtPrice_New = new javax.swing.JTextField();
        lblDiscount_New = new javax.swing.JLabel();
        txtDiscount_New = new javax.swing.JTextField();
        lblDiscountQty_New = new javax.swing.JLabel();
        txtDiscountQty_New = new javax.swing.JTextField();
        btnAddProduct_New = new javax.swing.JButton();
        btnClear_New = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtProDesc_Up = new javax.swing.JTextField();
        lblProDesc_Up = new javax.swing.JLabel();
        lblPrice_Up = new javax.swing.JLabel();
        txtPrice_Up = new javax.swing.JTextField();
        lblDiscount_Up = new javax.swing.JLabel();
        txtDiscount_Up = new javax.swing.JTextField();
        lblDiscountQty_Up = new javax.swing.JLabel();
        txtDiscountQty_Up = new javax.swing.JTextField();
        btUpdateProduct_Up = new javax.swing.JButton();
        btnClear_Up = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        productsForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 644, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProDesc_New.setForeground(new java.awt.Color(255, 255, 255));
        lblProDesc_New.setText("Product Description :");
        jPanel2.add(lblProDesc_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, -1, -1));

        txtProDesc_New.setBackground(new java.awt.Color(25, 25, 25));
        txtProDesc_New.setForeground(new java.awt.Color(255, 255, 255));
        txtProDesc_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtProDesc_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 34, 265, -1));

        lblPrice_New.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice_New.setText("Price :");
        jPanel2.add(lblPrice_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 77, -1, -1));

        txtPrice_New.setBackground(new java.awt.Color(25, 25, 25));
        txtPrice_New.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtPrice_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 74, 265, -1));

        lblDiscount_New.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount_New.setText("Discount :");
        jPanel2.add(lblDiscount_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 117, -1, -1));

        txtDiscount_New.setBackground(new java.awt.Color(25, 25, 25));
        txtDiscount_New.setForeground(new java.awt.Color(255, 255, 255));
        txtDiscount_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtDiscount_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 114, 265, -1));

        lblDiscountQty_New.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscountQty_New.setText("Discount Quantity :");
        jPanel2.add(lblDiscountQty_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 157, -1, -1));

        txtDiscountQty_New.setBackground(new java.awt.Color(25, 25, 25));
        txtDiscountQty_New.setForeground(new java.awt.Color(255, 255, 255));
        txtDiscountQty_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtDiscountQty_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 154, 265, -1));

        btnAddProduct_New.setBackground(new java.awt.Color(102, 102, 102));
        btnAddProduct_New.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduct_New.setForeground(new java.awt.Color(204, 204, 204));
        btnAddProduct_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnAddProduct_New.setText("Add Product");
        jPanel2.add(btnAddProduct_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 194, 123, -1));

        btnClear_New.setBackground(new java.awt.Color(102, 102, 102));
        btnClear_New.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear_New.setForeground(new java.awt.Color(204, 204, 204));
        btnClear_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invo.png"))); // NOI18N
        btnClear_New.setText("Clear");
        jPanel2.add(btnClear_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 194, -1, -1));

        jTabbedPane1.addTab("New Product", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProDesc_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtProDesc_Up.setForeground(new java.awt.Color(255, 255, 255));
        txtProDesc_Up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtProDesc_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 34, 265, -1));

        lblProDesc_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblProDesc_Up.setText("Product Description :");
        jPanel3.add(lblProDesc_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, -1, -1));

        lblPrice_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice_Up.setText("Price :");
        jPanel3.add(lblPrice_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 77, -1, -1));

        txtPrice_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtPrice_Up.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice_Up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtPrice_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 74, 265, -1));

        lblDiscount_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount_Up.setText("Discount :");
        jPanel3.add(lblDiscount_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 117, -1, -1));

        txtDiscount_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtDiscount_Up.setForeground(new java.awt.Color(255, 255, 255));
        txtDiscount_Up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtDiscount_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 114, 265, -1));

        lblDiscountQty_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscountQty_Up.setText("Discount Quantity :");
        jPanel3.add(lblDiscountQty_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 157, -1, -1));

        txtDiscountQty_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtDiscountQty_Up.setForeground(new java.awt.Color(255, 255, 255));
        txtDiscountQty_Up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtDiscountQty_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 154, 265, -1));

        btUpdateProduct_Up.setBackground(new java.awt.Color(102, 102, 102));
        btUpdateProduct_Up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btUpdateProduct_Up.setForeground(new java.awt.Color(204, 204, 204));
        btUpdateProduct_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btUpdateProduct_Up.setText("Update Product");
        jPanel3.add(btUpdateProduct_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 194, 123, -1));

        btnClear_Up.setBackground(new java.awt.Color(102, 102, 102));
        btnClear_Up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear_Up.setForeground(new java.awt.Color(204, 204, 204));
        btnClear_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invo.png"))); // NOI18N
        btnClear_Up.setText("Clear");
        jPanel3.add(btnClear_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 194, -1, -1));

        jTabbedPane1.addTab("Update Product", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 426, 290));

        tblProducts.setForeground(new java.awt.Color(204, 204, 204));
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Price", "Discount", "Discount_Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 83, 564, 480));

        productsForm.setBackground(new java.awt.Color(156, 43, 43));
        productsForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productsForm.setForeground(new java.awt.Color(153, 255, 255));
        productsForm.setText("Products");
        productsForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsFormActionPerformed(evt);
            }
        });
        getContentPane().add(productsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 110, 61));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maxresdefault (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsFormActionPerformed

        //Loads products data to products table from database
    private void loadProducts(){
        /*        
        try{       
            Connect_DB cdb = new Connect_DB();
            try (Connection conn = (Connection) cdb.getConnection()) {
                DefaultTableModel tableModel = null;
                tblProducts = new JTable(tableModel);
                String sql = "SELECT * FROM products";
                try (PreparedStatement statement = conn.prepareStatement(sql); ResultSet result = statement.executeQuery()) {
                    
                    while (result.next()) {
                        String[] rowData = { result.getString("Produc_ID"), result.getString("description"), result.getString("price"), result.getString("discount"), result.getString("discount_qty") };
                        tableModel.addRow(rowData);
                        
                    }
                }
            }
            
            System.out.println("OK");
        }catch (SQLException ex) {
            ex.toString();
        
        
    }*/
    
    }
    
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btUpdateProduct_Up;
    private javax.swing.JButton btnAddProduct_New;
    private javax.swing.JButton btnClear_New;
    private javax.swing.JButton btnClear_Up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDiscountQty_New;
    private javax.swing.JLabel lblDiscountQty_Up;
    private javax.swing.JLabel lblDiscount_New;
    private javax.swing.JLabel lblDiscount_Up;
    private javax.swing.JLabel lblPrice_New;
    private javax.swing.JLabel lblPrice_Up;
    private javax.swing.JLabel lblProDesc_New;
    private javax.swing.JLabel lblProDesc_Up;
    private javax.swing.JButton productsForm;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtDiscountQty_New;
    private javax.swing.JTextField txtDiscountQty_Up;
    private javax.swing.JTextField txtDiscount_New;
    private javax.swing.JTextField txtDiscount_Up;
    private javax.swing.JTextField txtPrice_New;
    private javax.swing.JTextField txtPrice_Up;
    private javax.swing.JTextField txtProDesc_New;
    private javax.swing.JTextField txtProDesc_Up;
    // End of variables declaration//GEN-END:variables
}
