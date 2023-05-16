package Application.Manager;

import backend_files.Connect_DB;
import java.awt.Color;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Sales extends javax.swing.JFrame {

    public Sales() {
        initComponents();
        loadBills();
        displayAllTotals();
        jPanel2.setBackground(new Color(25,25,25,200));
        jPanel3.setBackground(new Color(25,25,25,200));
    }
    
    Connect_DB cdb = new Connect_DB();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBillSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBills = new javax.swing.JTable();
        chkByDate = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtSubTotal = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        lblQty1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubQtyValue = new javax.swing.JLabel();
        lblSubTotalValue = new javax.swing.JLabel();
        lblDiscountTotalValue = new javax.swing.JLabel();
        lblTotalValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBillSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtBillSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBillSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtBillSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 32, 311, -1));

        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setText("Search :");
        jPanel1.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 35, -1, -1));

        tblBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bill_ID", "Date", "Sub_Total", "Qty_Total", "Discount_Total", "Total"
            }
        ));
        tblBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBills);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 96, 427, -1));

        chkByDate.setForeground(new java.awt.Color(255, 255, 255));
        chkByDate.setText("Search By Date");
        chkByDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkByDateItemStateChanged(evt);
            }
        });
        jPanel1.add(chkByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 33, -1, -1));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Product_ID", "Description", "Qty", "Sub_Total", "Discount", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 96, 728, 221));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setText("Sub Total : ");
        jPanel2.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQty.setForeground(new java.awt.Color(255, 255, 255));
        lblQty.setText("Qty Total : ");
        jPanel2.add(lblQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblQty1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQty1.setForeground(new java.awt.Color(255, 255, 255));
        lblQty1.setText("Discount Total : ");
        jPanel2.add(lblQty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total : ");
        jPanel2.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lblSubQtyValue.setForeground(new java.awt.Color(255, 255, 255));
        lblSubQtyValue.setText("   ");
        lblSubQtyValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblSubQtyValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        lblSubTotalValue.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalValue.setText("   ");
        lblSubTotalValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblSubTotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, -1));

        lblDiscountTotalValue.setForeground(new java.awt.Color(51, 255, 0));
        lblDiscountTotalValue.setText("   ");
        lblDiscountTotalValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblDiscountTotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, -1));

        lblTotalValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalValue.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalValue.setText("   ");
        lblTotalValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblTotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 2));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 330, 190));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 590, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maxresdefault (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -1, 1280, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkByDateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkByDateItemStateChanged
        loadBills();
    }//GEN-LAST:event_chkByDateItemStateChanged

    private void tblBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillsMouseClicked
        loadProducts();
    }//GEN-LAST:event_tblBillsMouseClicked

    private void txtBillSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillSearchKeyReleased
        loadBills();
        displayAllTotals();
    }//GEN-LAST:event_txtBillSearchKeyReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }
    
        //Load bills from the database cosidering the bill ID
    private void loadBillsByBillID(){
        try{
                        
            Connection conn = cdb.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Bill_ID, Date, Sub_Total, Qty_Total, Discount_Total, Total FROM bills WHERE Bill_ID LIKE '%" + txtBillSearch.getText() + "%';");
                        
            // Create a new TableModel with the data from the ResultSet
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i-1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }
            
            
            // Set the new TableModel on the JTable
            tblBills.setModel(model);

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();
            
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
        
        }
    }

        //Load bills from the database considering the data
    private void loadBillsByDate(){
        try{
            Connection conn = cdb.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Bill_ID, Date, Sub_Total, Qty_Total, Discount_Total, Total FROM bills WHERE Date LIKE '%" + txtBillSearch.getText() + "%';");
                        
                // Create a new TableModel with the data from the ResultSet
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i-1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }
            
            
            // Set the new TableModel on the JTable
            tblBills.setModel(model);

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();
            
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
        
        }
    
    }
    
        //load Bills
    private void loadBills(){
        if(chkByDate.isSelected()){
            loadBillsByDate();
        }else{
            loadBillsByBillID();
        }
    }
    
        //load Products
    private void loadProducts(){
            // Get the selected row index from the source table
        int selectedRowIndex = tblBills.getSelectedRow();
        
            // Get the source table model
        TableModel tblBillsModel = tblBills.getModel();
    
            // get selected row's Product_ID
        String selectedBillID = tblBillsModel.getValueAt(selectedRowIndex, 0).toString();
        
        try {
            Connection conn = cdb.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT bill_product.product_ID,  products.description, bill_product.Qty, (products.price * bill_product.Qty) AS Sub_Total, (products.discount * bill_product.Qty) AS Discount, ((products.price - products.discount) * bill_product.Qty) AS Total FROM bill_product INNER JOIN products ON products.product_ID = bill_product.product_ID WHERE bill_ID = '" + selectedBillID + "';");

            // Create a new TableModel with the data from the ResultSet
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++) {
                
                model.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                
                Object[] rowData = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i-1] = rs.getObject(i);    
                    
                }
                
                model.addRow(rowData);
            }
            
            // Set the new TableModel on the JTable
            tblProducts.setModel(model);

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }      
    }

        //Display the all totals
    private void displayAllTotals(){
        displayTotal(tblBills, "Sub_Total");
        displayTotal(tblBills, "Qty_Total");
        displayTotal(tblBills, "Discount_Total");
        displayTotal(tblBills, "Total");
    }
    
        //Display the perticular column's total
    private void displayTotal(JTable table, String columnName){
        int columnIndex = table.getColumnModel().getColumnIndex(columnName);
        double sum = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            sum += Double.parseDouble(table.getValueAt(i, columnIndex).toString());
        }
        
        switch (columnName) {
            case "Sub_Total" -> lblSubTotalValue.setText(Double.toString(sum));
            case "Qty_Total" -> lblSubQtyValue.setText(Double.toString(sum));
            case "Discount_Total" -> lblDiscountTotalValue.setText(Double.toString(sum));
            case "Total" -> lblTotalValue.setText(Double.toString(sum));
            default -> {
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkByDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiscountTotalValue;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblQty1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSubQtyValue;
    private javax.swing.JLabel lblSubTotalValue;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JTable tblBills;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtBillSearch;
    private javax.swing.JLabel txtSubTotal;
    // End of variables declaration//GEN-END:variables
}
