package Application.Cashier;

//package Application.Cashier;

//import Massege_boxes.CalculatorForm.SubTotal_Msgs;
import backend_files.Connect_DB;
import java.awt.Color;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Calculator1 extends javax.swing.JFrame {


    public Calculator1() {
        initComponents();
        filterProducts(txtSearchBar.getText());
        txtQty.setText("1");
        setTotals();
        jPanel4.setBackground(new Color(255,255,255,200));
        jPanel1.setBackground(new Color(25,25,25,200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblProductSet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTemp = new javax.swing.JTable();
        txtQty = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        btnRemoveProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        lblSubTotalCount = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblTotalQty = new javax.swing.JLabel();
        lblTotalQtyCount = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblTotalCount = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        lblDiscountCount = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductSet.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        lblProductSet.setForeground(new java.awt.Color(255, 255, 255));
        lblProductSet.setText("Product List");
        jPanel1.add(lblProductSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 160, 38));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 141, -1, -1));

        txtSearchBar.setBackground(new java.awt.Color(25, 25, 25));
        txtSearchBar.setForeground(new java.awt.Color(255, 255, 255));
        txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBarKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 141, 366, -1));

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product_ID", "Product_Description", "Unit Price", "Discount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 627, 93));

        tblTemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Product_ID", "Product_Description", "Unit Price", "Discount", "Quantity", "Sub Total", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class,java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTemp);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 290, 627, 225));

        txtQty.setBackground(new java.awt.Color(25, 25, 25));
        txtQty.setForeground(new java.awt.Color(204, 204, 204));
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 79, 165, -1));

        lblQty.setForeground(new java.awt.Color(255, 255, 255));
        lblQty.setText("Quantity :");
        jPanel1.add(lblQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        btnRemoveProduct.setBackground(new java.awt.Color(102, 102, 102));
        btnRemoveProduct.setForeground(new java.awt.Color(204, 204, 204));
        btnRemoveProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        btnRemoveProduct.setText("Remove Product");
        btnRemoveProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemoveProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveProductMouseClicked(evt);
            }
        });
        jPanel1.add(btnRemoveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 150, -1));

        btnUpdateProduct.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdateProduct.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnUpdateProduct.setText("Update Product");
        btnUpdateProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateProductMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 150, -1));

        btnClearTable.setBackground(new java.awt.Color(102, 102, 102));
        btnClearTable.setForeground(new java.awt.Color(204, 204, 204));
        btnClearTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invo.png"))); // NOI18N
        btnClearTable.setText("Clear Table");
        btnClearTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClearTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearTableMouseClicked(evt);
            }
        });
        jPanel1.add(btnClearTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 130, -1));

        btnPrintBill.setBackground(new java.awt.Color(102, 102, 102));
        btnPrintBill.setForeground(new java.awt.Color(204, 204, 204));
        btnPrintBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnPrintBill.setText("Print The Bill");
        btnPrintBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrintBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintBillMouseClicked(evt);
            }
        });
        jPanel1.add(btnPrintBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 710, 534));

        lblSubTotalCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubTotalCount.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTotalCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblSubTotalCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 122, 51));

        lblSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTotal.setText("Sub Total :");
        getContentPane().add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 122, 51));

        lblTotalQty.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalQty.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalQty.setText("Qty :");
        getContentPane().add(lblTotalQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, -1, 51));

        lblTotalQtyCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalQtyCount.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalQtyCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblTotalQtyCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 122, 51));

        lblDiscount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(0, 0, 0));
        lblDiscount.setText("Discount :");
        getContentPane().add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, -1, 51));

        lblTotalCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalCount.setForeground(new java.awt.Color(255, 0, 0));
        lblTotalCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblTotalCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 122, 51));

        lblTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal1.setText("Total :");
        getContentPane().add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, -1, 51));

        lblDiscountCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDiscountCount.setForeground(new java.awt.Color(51, 255, 51));
        lblDiscountCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblDiscountCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 122, 51));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 320, 2));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 380, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maxresdefault (1).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Objects
    Connect_DB cdb = new Connect_DB();
    
    
    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        filterProducts(txtSearchBar.getText());
    }//GEN-LAST:event_txtSearchBarKeyReleased

    private void tblProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductListMouseClicked
        loadProduct();
    }//GEN-LAST:event_tblProductListMouseClicked

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        loadProduct();
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnRemoveProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveProductMouseClicked
        removeProduct();
    }//GEN-LAST:event_btnRemoveProductMouseClicked

    private void btnUpdateProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateProductMouseClicked
        updateProduct();
    }//GEN-LAST:event_btnUpdateProductMouseClicked

    private void btnClearTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearTableMouseClicked
        clearTable();
    }//GEN-LAST:event_btnClearTableMouseClicked

    private void btnPrintBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintBillMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator1().setVisible(true);
            }
        });
    }
    
        //Change the productlist according to the searchbar text change
    private void filterProducts(String productDescription){
        try{
                        
            Connection conn = cdb.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Product_ID, description, price, discount FROM products WHERE description LIKE '%" + productDescription + "%';");
                        
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
            tblProductList.setModel(model);

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();
            
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
        
        }
    }
    
        //Copy searched data to the temporary table
    private void loadProduct(){
        
       // SubTotal_Msgs stm = new SubTotal_Msgs();

            // Get the selected row index from the source table
        int selectedRowIndex = tblProductList.getSelectedRow();
        
        int lastRowTempIndex = tblTemp.getRowCount();
      
            // Get the source table model
        TableModel tblProductListModel = tblProductList.getModel();
        
            // Create a new destination table model
        DefaultTableModel tblTempModel = (DefaultTableModel) tblTemp.getModel();
        
        if (tblTempModel == null) {
            tblTempModel = new DefaultTableModel();
        }
        
        String lastProductID = tblProductListModel.getValueAt(selectedRowIndex, 0).toString();
        
            //  Compare the last value is equal
        String preProductID;
        
        try{
            preProductID  = tblTempModel.getValueAt(lastRowTempIndex-1, 0).toString();
        }catch(Exception ex){
            preProductID  = "0";
        }
        
        
        if(preProductID.equals(lastProductID)){
            System.out.println("Match");
        }else{
            System.out.println("Won\'t Match");
            
            if (tblTempModel.getColumnCount() == 0) {
                for (int i = 0; i < tblProductList.getColumnCount(); i++) {
                    tblTempModel.addColumn(tblProductList.getColumnName(i));
                }
       
            // Add two more columns to the destination table model
            tblTempModel.addColumn("Quantity");
            tblTempModel.addColumn("Sub Total");
            tblTempModel.addColumn("Total");
            
            
        
        }
        
            // Copy the selected row from the source table model to the destination table model
        Vector<Object> selectedRowData = new Vector<Object>();
        
        for (int i = 0; i < tblProductListModel.getColumnCount(); i++) {
            if(i !=3){
                selectedRowData.add(tblProductListModel.getValueAt(selectedRowIndex, i));
            }else{
               // selectedRowData.add(stm.subDiscount(txtQty.getText(), tblProductListModel.getValueAt(selectedRowIndex, 3).toString()));

            }
        }
      //  double subTotal = stm.subDiscount(txtQty.getText(), tblProductListModel.getValueAt(selectedRowIndex, 2).toString());
      //  double total = stm.subTotal(txtQty.getText(), tblProductListModel.getValueAt(selectedRowIndex, 2).toString(), tblProductListModel.getValueAt(selectedRowIndex, 3).toString());
        
        selectedRowData.add(txtQty.getText());
       // selectedRowData.add(subTotal);
      //  selectedRowData.add(total);

        tblTempModel.addRow(selectedRowData);

            // Set the destination table model to the destination table
        tblTemp.setModel(tblTempModel);
        
        updateTotals();
        
        txtQty.setText("1");
            
        }        
    }
    
        //Remove the product from tblTemp
    private void removeProduct() {
        int selectedRow;
        try{
            selectedRow = tblTemp.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblTemp.getModel();
            model.removeRow(selectedRow);
            tblTemp.setModel(model);
            updateTotals();
            
        }catch(Exception ex){
            
        }      
    }
    
        //Update all 4 totals
    private void updateTotals(){
        getColumnSum(tblTemp,"Sub Total");
        getColumnSum(tblTemp,"Quantity");
        getColumnSum(tblTemp,"Total");
        getColumnSum(tblTemp,"Discount");
    }
    
        //Update the column sum of a given table
    private void getColumnSum(JTable table, String columnName) {
        
        int columnIndex = table.getColumnModel().getColumnIndex(columnName);
        double sum = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            sum += Double.parseDouble(table.getValueAt(i, columnIndex).toString());
        }
        
        if(columnName.equals("Quantity")){
            lblTotalQtyCount.setText(Double.toString(sum));
        }else if(columnName.equals("Sub Total")){
            lblSubTotalCount.setText(Double.toString(sum));
        }else if(columnName.equals("Total")){
            lblTotalCount.setText(Double.toString(sum));
        }else if(columnName.equals("Discount")){
            lblDiscountCount.setText(Double.toString(sum));
        }
    }

        //Update the products
    private void updateProduct(){
        
        int selectedRow = tblTemp.getSelectedRow();
        
        if (selectedRow != -1) {
            
            Object oldQty = tblTemp.getValueAt(selectedRow, 4);
            Object newQty = JOptionPane.showInputDialog(null, "Quantity : ", oldQty);
            
            Object oldDiscount  = tblTemp.getValueAt(selectedRow, 3);
            Object unitDiscount = parseDouble(oldDiscount.toString()) / parseDouble(oldQty.toString());
            Object newDiscount  = parseDouble(unitDiscount.toString()) * parseDouble(newQty.toString());
            
            Object oldSubTotal = tblTemp.getValueAt(selectedRow, 5);
            Object unitSubTotal = parseDouble(oldSubTotal.toString()) / parseDouble(oldQty.toString());
            Object newSubTotal = parseDouble(unitSubTotal.toString()) * parseDouble(newQty.toString());
            
            Object newTotal = ((parseDouble(newSubTotal.toString())) - parseDouble(newDiscount.toString()));
                      
            if (newQty != null) {
                
                DefaultTableModel model = (DefaultTableModel) tblTemp.getModel();
                model.setValueAt(newQty, selectedRow, 4);
                model.setValueAt(newDiscount, selectedRow, 3);
                model.setValueAt(newSubTotal, selectedRow, 5);
                model.setValueAt(newTotal, selectedRow, 6);
                tblTemp.setModel(model);
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Select a row");
        }       
    }
    
        //Clear the table
    private void clearTable(){
        
        String[] columnNames = new String[tblTemp.getColumnCount()];
        for (int i = 0; i < tblTemp.getColumnCount(); i++) {
            columnNames[i] = tblTemp.getColumnName(i);
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        tblTemp.setModel(model);
        updateTotals();
    }
    
        //Initialize totals when program starts
    private void setTotals(){
        lblTotalQtyCount.setText("0.0");
        lblSubTotalCount.setText("0.0");
        lblTotalCount.setText("0.0");
        lblDiscountCount.setText("0.0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscountCount;
    private javax.swing.JLabel lblProductSet;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblSubTotalCount;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotalCount;
    private javax.swing.JLabel lblTotalQty;
    private javax.swing.JLabel lblTotalQtyCount;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable tblTemp;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

}
