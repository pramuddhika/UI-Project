package Application.Manager;

import Massege_boxes.AdminAccount_Msgs;
import backend_files.Connect_DB;
import backend_files.Encrypter;
import Massege_boxes.PasswordValidation_Msgs;
import Massege_boxes.Position_Msgs;
import Massege_boxes.Username_Msgs;
import backend_files.UserTypeChanger;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Registration extends javax.swing.JFrame {
   
    PasswordValidation_Msgs test = new PasswordValidation_Msgs();
    Position_Msgs pos            = new Position_Msgs();
    AdminAccount_Msgs aacm       = new AdminAccount_Msgs();
    Username_Msgs umsg           = new Username_Msgs();
    
    public Registration() {
        initComponents();
        showUsers();
        buttons.setBackground(new Color(255,255,255,255));
        registration.setBackground(new Color(255,255,255,200));
        left.setBackground(new Color(25,25,25,200));
        right1.setBackground(new Color(25,25,25,200));
        right.setBackground(new Color(25,25,25,200));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        btnSales = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        btnTables = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        registration = new javax.swing.JPanel();
        lblReg = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        lblUsers = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUser1 = new javax.swing.JLabel();
        txtPsw = new javax.swing.JPasswordField();
        lblUser2 = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox<>();
        txtAdminUser = new javax.swing.JTextField();
        txtAdminPsw = new javax.swing.JPasswordField();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        txtRetype = new javax.swing.JPasswordField();
        lblPswMessege = new javax.swing.JLabel();
        lblRtpMessege = new javax.swing.JLabel();
        lblAdminUserMessege = new javax.swing.JLabel();
        lblAdminPswMessege = new javax.swing.JLabel();
        lblUserMessege = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblAdminUser1 = new javax.swing.JLabel();
        lblAdminPsw1 = new javax.swing.JLabel();
        lblPosition1 = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        lblUsers1 = new javax.swing.JLabel();
        lblUser_PswRst = new javax.swing.JLabel();
        txtUser_PswRst = new javax.swing.JTextField();
        txtPsw_PswRst = new javax.swing.JPasswordField();
        txtNewPsw_PswRst = new javax.swing.JTextField();
        txtRtpPsw_PswRst = new javax.swing.JPasswordField();
        btnClearRecords = new javax.swing.JButton();
        lblAdminUser = new javax.swing.JLabel();
        lblAdminPsw = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        right1 = new javax.swing.JPanel();
        lblUsers2 = new javax.swing.JLabel();
        lblUser_PswRst1 = new javax.swing.JLabel();
        txtUser_PswRst1 = new javax.swing.JTextField();
        lblPsw_PswRst1 = new javax.swing.JLabel();
        txtPsw_PswRst1 = new javax.swing.JPasswordField();
        lblNewPsw_PswRst1 = new javax.swing.JLabel();
        txtNewPsw_PswRst1 = new javax.swing.JTextField();
        lblRtpPsw_PswRst1 = new javax.swing.JLabel();
        txtRtpPsw_PswRst1 = new javax.swing.JPasswordField();
        btnClearRecords1 = new javax.swing.JButton();
        btnUpdatePsw1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSales.setBackground(new java.awt.Color(156, 43, 43));
        btnSales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSales.setForeground(new java.awt.Color(255, 255, 255));
        btnSales.setText("Sales");
        buttons.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 120, 40));

        btnReg.setBackground(new java.awt.Color(156, 43, 43));
        btnReg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 255, 255));
        btnReg.setText("Registration");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        buttons.add(btnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 120, 40));

        btnTables.setBackground(new java.awt.Color(156, 43, 43));
        btnTables.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTables.setForeground(new java.awt.Color(255, 255, 255));
        btnTables.setText("Tables");
        buttons.add(btnTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 120, 40));

        getContentPane().add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 680, -1));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Position"
            }
        ));
        jScrollPane2.setViewportView(tblUsers);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 376, 510));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblReg.setForeground(new java.awt.Color(156, 43, 43));
        lblReg.setText("Registration");
        registration.add(lblReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        left.setForeground(new java.awt.Color(156, 43, 43));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers.setText("Users");
        left.add(lblUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 27, -1, -1));

        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Username : ");
        left.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 73, -1, -1));

        txtUser.setBackground(new java.awt.Color(25, 25, 25));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        left.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 200, -1));

        lblUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblUser1.setText("Password :");
        left.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 103, -1, -1));

        txtPsw.setBackground(new java.awt.Color(25, 25, 25));
        txtPsw.setForeground(new java.awt.Color(255, 255, 255));
        txtPsw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPsw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPswMouseClicked(evt);
            }
        });
        txtPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPswKeyReleased(evt);
            }
        });
        left.add(txtPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 100, 200, -1));

        lblUser2.setForeground(new java.awt.Color(255, 255, 255));
        lblUser2.setText("Re-Type :");
        left.add(lblUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 143, -1, -1));

        cmbPosition.setBackground(new java.awt.Color(25, 25, 25));
        cmbPosition.setForeground(new java.awt.Color(255, 255, 255));
        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cashier", "Manager", "Admin" }));
        cmbPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cmbPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPositionItemStateChanged(evt);
            }
        });
        left.add(cmbPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 186, -1, -1));

        txtAdminUser.setBackground(new java.awt.Color(25, 25, 25));
        txtAdminUser.setForeground(new java.awt.Color(255, 255, 255));
        txtAdminUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAdminUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminUserKeyReleased(evt);
            }
        });
        left.add(txtAdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 237, 197, -1));

        txtAdminPsw.setBackground(new java.awt.Color(25, 25, 25));
        txtAdminPsw.setForeground(new java.awt.Color(255, 255, 255));
        txtAdminPsw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAdminPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminPswKeyReleased(evt);
            }
        });
        left.add(txtAdminPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 287, 197, -1));

        btnAddUser.setBackground(new java.awt.Color(102, 102, 102));
        btnAddUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(204, 204, 204));
        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnAddUser.setText("Add User");
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });
        left.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        btnUpdateUser.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateUserMouseClicked(evt);
            }
        });
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });
        left.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 130, -1));

        txtRetype.setBackground(new java.awt.Color(25, 25, 25));
        txtRetype.setForeground(new java.awt.Color(255, 255, 255));
        txtRetype.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtRetype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRetypeMouseClicked(evt);
            }
        });
        txtRetype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRetypeKeyReleased(evt);
            }
        });
        left.add(txtRetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 201, -1));

        lblPswMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblPswMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 127, 268, 7));

        lblRtpMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblRtpMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 168, 230, 12));

        lblAdminUserMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblAdminUserMessege.setText(" ");
        left.add(lblAdminUserMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 264, 184, -1));

        lblAdminPswMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblAdminPswMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 315, 218, -1));

        lblUserMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblUserMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 98, 208, -1));

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(204, 204, 204));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invo.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        left.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 30));

        lblAdminUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminUser1.setText("<html>\n<body>\nAdmin <br/> Username :\n</body>\n</html>");
        left.add(lblAdminUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 214, -1, 45));

        lblAdminPsw1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminPsw1.setText("<html>\n<body>\nAdmin<br/> Password : \n</body>\n</html>");
        left.add(lblAdminPsw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 277, -1, -1));

        lblPosition1.setForeground(new java.awt.Color(255, 255, 255));
        lblPosition1.setText("Position :");
        left.add(lblPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 189, -1, -1));

        registration.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 370, 390));

        right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsers1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsers1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers1.setText("Delete User");
        right.add(lblUsers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblUser_PswRst.setForeground(new java.awt.Color(255, 255, 255));
        lblUser_PswRst.setText("Username :");
        right.add(lblUser_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtUser_PswRst.setBackground(new java.awt.Color(25, 25, 25));
        txtUser_PswRst.setForeground(new java.awt.Color(255, 255, 255));
        txtUser_PswRst.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right.add(txtUser_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 148, -1));

        txtPsw_PswRst.setBackground(new java.awt.Color(25, 25, 25));
        txtPsw_PswRst.setForeground(new java.awt.Color(255, 255, 255));
        txtPsw_PswRst.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right.add(txtPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 148, -1));

        txtNewPsw_PswRst.setBackground(new java.awt.Color(25, 25, 25));
        txtNewPsw_PswRst.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPsw_PswRst.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right.add(txtNewPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 148, -1));

        txtRtpPsw_PswRst.setBackground(new java.awt.Color(25, 25, 25));
        txtRtpPsw_PswRst.setForeground(new java.awt.Color(255, 255, 255));
        txtRtpPsw_PswRst.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right.add(txtRtpPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 148, -1));

        btnClearRecords.setBackground(new java.awt.Color(102, 102, 102));
        btnClearRecords.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearRecords.setForeground(new java.awt.Color(204, 204, 204));
        btnClearRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invo.png"))); // NOI18N
        btnClearRecords.setText("Clear Records");
        btnClearRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRecordsActionPerformed(evt);
            }
        });
        right.add(btnClearRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 40));

        lblAdminUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminUser.setText("<html> <body> Admin <br/> Username : </body> </html>");
        right.add(lblAdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 45));

        lblAdminPsw.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminPsw.setText("<html>\n<body>\nAdmin<br/> Password : \n</body>\n</html>");
        right.add(lblAdminPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblPosition.setForeground(new java.awt.Color(255, 255, 255));
        lblPosition.setText("Position :");
        right.add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(204, 204, 204));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        btnDelete.setText("Delete User");
        right.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 130, -1));

        registration.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 440, 210));

        right1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        right1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsers2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsers2.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers2.setText("Password Reset");
        right1.add(lblUsers2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblUser_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        lblUser_PswRst1.setText("Username :");
        right1.add(lblUser_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        txtUser_PswRst1.setBackground(new java.awt.Color(25, 25, 25));
        txtUser_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        txtUser_PswRst1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right1.add(txtUser_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 148, -1));

        lblPsw_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        lblPsw_PswRst1.setText("Password :");
        right1.add(lblPsw_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtPsw_PswRst1.setBackground(new java.awt.Color(25, 25, 25));
        txtPsw_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        txtPsw_PswRst1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right1.add(txtPsw_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 148, -1));

        lblNewPsw_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        lblNewPsw_PswRst1.setText("New Password :");
        right1.add(lblNewPsw_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtNewPsw_PswRst1.setBackground(new java.awt.Color(25, 25, 25));
        txtNewPsw_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPsw_PswRst1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right1.add(txtNewPsw_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 148, -1));

        lblRtpPsw_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        lblRtpPsw_PswRst1.setText("Re-Type :");
        right1.add(lblRtpPsw_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtRtpPsw_PswRst1.setBackground(new java.awt.Color(25, 25, 25));
        txtRtpPsw_PswRst1.setForeground(new java.awt.Color(255, 255, 255));
        txtRtpPsw_PswRst1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        right1.add(txtRtpPsw_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 148, -1));

        btnClearRecords1.setBackground(new java.awt.Color(102, 102, 102));
        btnClearRecords1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearRecords1.setForeground(new java.awt.Color(204, 204, 204));
        btnClearRecords1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invo.png"))); // NOI18N
        btnClearRecords1.setText("Clear Records");
        btnClearRecords1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRecords1ActionPerformed(evt);
            }
        });
        right1.add(btnClearRecords1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, 30));

        btnUpdatePsw1.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdatePsw1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdatePsw1.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdatePsw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnUpdatePsw1.setText("Update Password");
        btnUpdatePsw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePsw1ActionPerformed(evt);
            }
        });
        right1.add(btnUpdatePsw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        registration.add(right1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 440, 200));

        getContentPane().add(registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 850, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ijijokt (3).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnUpdatePsw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePsw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePsw1ActionPerformed

    private void btnClearRecords1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRecords1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearRecords1ActionPerformed

    private void btnClearRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRecordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearRecordsActionPerformed

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        resetForm();
    }//GEN-LAST:event_btnClearMouseClicked

    private void txtRetypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetypeKeyReleased
        // lblRtpMessege.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtRetypeKeyReleased

    private void txtRetypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRetypeMouseClicked
        //   lblRtpMessege.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtRetypeMouseClicked

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateUserActionPerformed

        ///Update the user's 
    private void btnUpdateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateUserMouseClicked

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        validateAddUser();
    }//GEN-LAST:event_btnAddUserMouseClicked

    private void txtAdminPswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminPswKeyReleased
        //  lblAdminPswMessege.setText(aacm.passwordAvailability(txtAdminUser.getText(),txtAdminPsw.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtAdminPswKeyReleased

    private void txtAdminUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminUserKeyReleased
        //  lblAdminUserMessege.setText(aacm.usernameAvailability(txtAdminUser.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtAdminUserKeyReleased

    private void cmbPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPositionItemStateChanged
        //  lblPosMessege.setText(pos.positionStatus(cmbPosition.getSelectedItem().toString()));
        //lblRecordStatus.setText("");
    }//GEN-LAST:event_cmbPositionItemStateChanged

    private void txtPswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPswKeyReleased
        //  lblPswMessege.setText(test.PswValCheck(txtPsw.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtPswKeyReleased

    private void txtPswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPswMouseClicked
        //   lblPswMessege.setText(test.PswValCheck(txtPsw.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtPswMouseClicked

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        //  lblUserMessege.setText(umsg.validateUsername(txtUser.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUserMouseClicked
    
        //This method can show the users table
    private void showUsers(){

        try{
            Connect_DB cdb = new Connect_DB();
            Connection conn = cdb.getConnection();
            String sql = "SELECT username, status FROM users";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
                // Create a new TableModel with the data from the ResultSet
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            
            int rowNumber = 1;
            
            while (result.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i-1] = result.getObject(i);
                    if(i%2 == 0){
                        UserTypeChanger utp = new UserTypeChanger();
                        utp.setType(rowData[i-1].toString());
                        rowData[i-1] = utp.getType();
                    }
                }
                model.addRow(rowData);
                
                // Set the new model on the tblUsers
                tblUsers.setModel(model);
                rowNumber++;
              
            }                      
        }catch (SQLException ex) {
            System.out.println(ex.toString());           
        }
    
    }
    
        //This method can insert a new user to the database
    private void insertUsers(){
        try{
                // Open a connection
            Connect_DB cdb = new Connect_DB();
            Connection conn = cdb.getConnection();
            
                // Open an encrypter
            Encrypter enc = new Encrypter();
                
                //  Open an UserTypeChanger
            UserTypeChanger utp = new UserTypeChanger();
            
                // Prepare the SQL statement
            String sql = "INSERT INTO users (username, password, status) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
                //  Change user type
            utp.setDBType(cmbPosition.getSelectedItem().toString());
            
                // Set the values for the prepared statement
            ps.setString(1, txtUser.getText());
            ps.setString(2, enc.secure(txtPsw.getText()));
            ps.setString(3, utp.getDBType());
            
                // Execute the SQL statement
            ps.executeUpdate();
            //System.out.println("Data inserted successfully!");
            lblRecordStatus.setText("New User Added");
            showUsers();
            resetForm();
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        //This method validate the user adding process
    private void validateAddUser(){
    
    if(umsg.validateUsername(txtUser.getText()).equals("Username Available")){
        
            if(test.PswValCheck(txtPsw.getText()).equals("Strong Password")){
                    
                if(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()).equals("Re-type matches with the password")){
                
                    if(pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Cashier") || pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Manager") || pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Admin")){                    
                    
                        if(aacm.usernameAvailability(txtAdminUser.getText()).equals("User is available")){
                                     
                            if(aacm.passwordAvailability(txtAdminUser.getText(),txtAdminPsw.getText()).equals("")){                                
                                insertUsers(); 
                            }else{
                                lblRecordStatus.setText(aacm.passwordAvailability(txtAdminUser.getText(),txtAdminPsw.getText()));
                            }   
                        }else{
                            lblRecordStatus.setText(aacm.usernameAvailability(txtAdminUser.getText()));
                        }                  
                    }else{
                        lblRecordStatus.setText(pos.positionStatus(cmbPosition.getSelectedItem().toString()));
                    }
                }else{
                    lblRecordStatus.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
                }
            }else{
                lblRecordStatus.setText(test.PswValCheck(txtPsw.getText()));
            }
        }else{
            lblRecordStatus.setText(umsg.validateUsername(txtUser.getText()));
        }  
    }
    
    private void resetForm(){
        txtUser.setText("");
        txtPsw.setText("");
        txtRetype.setText("");
        cmbPosition.setSelectedItem("Select");
        txtAdminUser.setText("");
        txtAdminPsw.setText("");
        
        lblAdminPswMessege.setText("");
        lblAdminUserMessege.setText("");
      //  lblPosMessege.setText("");
        lblPswMessege.setText("");
        lblRtpMessege.setText("");
        lblUserMessege.setText("");
        
    }
        
    
    // Implement the other WindowListener methods as needed...
    
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearRecords;
    private javax.swing.JButton btnClearRecords1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnTables;
    private javax.swing.JButton btnUpdatePsw1;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JPanel buttons;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAdminPsw;
    private javax.swing.JLabel lblAdminPsw1;
    private javax.swing.JLabel lblAdminPswMessege;
    private javax.swing.JLabel lblAdminUser;
    private javax.swing.JLabel lblAdminUser1;
    private javax.swing.JLabel lblAdminUserMessege;
    private javax.swing.JLabel lblNewPsw_PswRst1;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPosition1;
    private javax.swing.JLabel lblPswMessege;
    private javax.swing.JLabel lblPsw_PswRst1;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblRtpMessege;
    private javax.swing.JLabel lblRtpPsw_PswRst1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUserMessege;
    private javax.swing.JLabel lblUser_PswRst;
    private javax.swing.JLabel lblUser_PswRst1;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblUsers1;
    private javax.swing.JLabel lblUsers2;
    private javax.swing.JPanel left;
    private javax.swing.JPanel registration;
    private javax.swing.JPanel right;
    private javax.swing.JPanel right1;
    private javax.swing.JTable tblUsers;
    private javax.swing.JPasswordField txtAdminPsw;
    private javax.swing.JTextField txtAdminUser;
    private javax.swing.JTextField txtNewPsw_PswRst;
    private javax.swing.JTextField txtNewPsw_PswRst1;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JPasswordField txtPsw_PswRst;
    private javax.swing.JPasswordField txtPsw_PswRst1;
    private javax.swing.JPasswordField txtRetype;
    private javax.swing.JPasswordField txtRtpPsw_PswRst;
    private javax.swing.JPasswordField txtRtpPsw_PswRst1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser_PswRst;
    private javax.swing.JTextField txtUser_PswRst1;
    // End of variables declaration//GEN-END:variables
}
