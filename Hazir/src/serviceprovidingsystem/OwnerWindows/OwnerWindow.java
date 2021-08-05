/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.OwnerWindows;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import serviceprovidingsystem.Accounts.User;
import serviceprovidingsystem.Database.DatabaseConnection;
import serviceprovidingsystem.ParentElements.Worker;
import serviceprovidingsystem.Workers.Electrician;
import serviceprovidingsystem.Workers.EventManager;
import serviceprovidingsystem.Workers.Labour;
import serviceprovidingsystem.Workers.Mechanic;
import serviceprovidingsystem.Workers.Plumber;

/**
 *
 * @author Black Beard
 */


public class OwnerWindow extends javax.swing.JFrame {
      public Connection connection = null;
    public ResultSet FinalDb =null;
    public PreparedStatement pst = null;
    public Statement st = null;
    
 
   
    DatabaseConnection database;

    /**
     * Creates new form OwnerWindow
     */
    
    public OwnerWindow(DatabaseConnection database) {
        initComponents();
        this.database = database;
        this.setIconImage(new ImageIcon("src\\serviceprovidingsystem\\images\\short\\taskbarIcon.png").getImage());
        this.setLocationRelativeTo(null);
        database.UpdateWorkerTable(WorkerTable);
        if(database.owner != null) {
            database.refreshingOwnerTotalLabel(ownerTotalTextField);
        }
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkerTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Name_Text = new javax.swing.JTextField();
        Cnic_Text = new javax.swing.JTextField();
        Contact_Text = new javax.swing.JTextField();
        Experience_Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Delete_ID_Text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnUpdateHireStatus = new javax.swing.JButton();
        payWorker = new javax.swing.JButton();
        ownerTotalTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnrefreshTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Haazir-Owner");

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        WorkerTable.setBackground(new java.awt.Color(229, 229, 229));
        WorkerTable.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        WorkerTable.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        WorkerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WorkerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WorkerTable.setFillsViewportHeight(true);
        WorkerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(WorkerTable);

        jButton1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jButton1.setText("Add New Worker");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrician", "Plumber", "Mechanic", "EventManager", "Labour" }));

        Name_Text.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N

        Cnic_Text.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        Cnic_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cnic_TextKeyTyped(evt);
            }
        });

        Contact_Text.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        Contact_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Contact_TextKeyTyped(evt);
            }
        });

        Experience_Text.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        Experience_Text.setPreferredSize(new Dimension(15, 24));
        Experience_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Experience_TextKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel2.setText("Cnic");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel3.setText("Contact ");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel4.setText("Experience");

        Delete_ID_Text.setEditable(false);
        Delete_ID_Text.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        Delete_ID_Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Delete_ID_Text.setOpaque(false);

        jButton2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnUpdateHireStatus.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnUpdateHireStatus.setText("Update Hire Status");
        btnUpdateHireStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHireStatusActionPerformed(evt);
            }
        });

        payWorker.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        payWorker.setText("Pay Worker");
        payWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payWorkerActionPerformed(evt);
            }
        });

        ownerTotalTextField.setEditable(false);
        ownerTotalTextField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ownerTotalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ownerTotalTextField.setOpaque(false);

        jButton3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setOpaque(false);

        btnrefreshTable.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnrefreshTable.setText("Refresh Database");
        btnrefreshTable.setOpaque(false);
        btnrefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name_Text)
                            .addComponent(Cnic_Text)
                            .addComponent(Contact_Text)
                            .addComponent(Experience_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateHireStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Delete_ID_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(payWorker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ownerTotalTextField)
                            .addComponent(btnrefreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnic_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Experience_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_ID_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(btnUpdateHireStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ownerTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrefreshTable)
                .addGap(16, 16, 16))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
      
        if ((String)jComboBox1.getSelectedItem() == "Electrician"){
        
            database.worker = new Electrician (Name_Text.getText(),Cnic_Text.getText(),Contact_Text.getText(), Integer.parseInt(Experience_Text.getText()) ,new Date());
            
        }
        
        
        if ((String)jComboBox1.getSelectedItem() == "Plumber"){
        
           database.worker = new Plumber (Name_Text.getText(),Cnic_Text.getText(),Contact_Text.getText(), Integer.parseInt(Experience_Text.getText()) ,new Date());
           
        }
        if ((String)jComboBox1.getSelectedItem() == "Mechanic"){
        
           database.worker = new Mechanic (Name_Text.getText(),Cnic_Text.getText(),Contact_Text.getText(), Integer.parseInt(Experience_Text.getText()) ,new Date());
           
        }
        if ((String)jComboBox1.getSelectedItem() == "EventManager"){
        
           database.worker = new EventManager (Name_Text.getText(),Cnic_Text.getText(),Contact_Text.getText(), Integer.parseInt(Experience_Text.getText()) ,new Date());

        }
        if ((String)jComboBox1.getSelectedItem() == "Labour"){
        
            database.worker = new Labour (Name_Text.getText(),Cnic_Text.getText(),Contact_Text.getText(), Integer.parseInt(Experience_Text.getText()) ,new Date());
            
        }
        database.INSERT_WORKER(WorkerTable);
        database.worker = null;
               
        
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Experience_TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Experience_TextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)     )){
            evt.consume();
        }
                    
    }//GEN-LAST:event_Experience_TextKeyTyped

    private void Cnic_TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cnic_TextKeyTyped
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)     )){
            evt.consume();
    }//GEN-LAST:event_Cnic_TextKeyTyped
    }
    
    private void Contact_TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contact_TextKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)     )){
            evt.consume();}
    }//GEN-LAST:event_Contact_TextKeyTyped

    private void WorkerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkerTableMouseClicked
                         
            try {
                
                Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:database\\databaseFile.db");
                
                int row_of_table = WorkerTable.getSelectedRow();
                // Selecting row by clicking on table
                
                String Row_click = (WorkerTable.getModel().getValueAt(row_of_table, 0).toString());
                String sql = "select * from Workers where id = '" + Row_click + "' ";
                
                pst = connection.prepareStatement(sql);
                FinalDb = pst.executeQuery();
                
                if (FinalDb.next()){
                    int Column_id = FinalDb.getInt("id");
                    Delete_ID_Text.setText("Delete ID No  : " + Column_id  );

                }

            }
         
        catch(Exception ex){
            System.out.println(ex);
        } try {
            connection.close();
          } catch (SQLException ex) {
              Logger.getLogger(OwnerWindow.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }//GEN-LAST:event_WorkerTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            database.DELETE_USER(WorkerTable);
            Delete_ID_Text.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUpdateHireStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHireStatusActionPerformed
        // TODO add your handling code here:
        database.UPDATE_HIRE_STATUS(WorkerTable);
        
    }//GEN-LAST:event_btnUpdateHireStatusActionPerformed

    private void payWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payWorkerActionPerformed
        // TODO add your handling code here:
        database.PAY_WORKER(WorkerTable, ownerTotalTextField);
    }//GEN-LAST:event_payWorkerActionPerformed

    private void btnrefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshTableActionPerformed
        // TODO add your handling code here:
        database.UpdateWorkerTable(WorkerTable);
    }//GEN-LAST:event_btnrefreshTableActionPerformed
    
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
            java.util.logging.Logger.getLogger(OwnerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OwnerWindow(new DatabaseConnection()).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(OwnerWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cnic_Text;
    private javax.swing.JTextField Contact_Text;
    private javax.swing.JTextField Delete_ID_Text;
    private javax.swing.JTextField Experience_Text;
    private javax.swing.JTextField Name_Text;
    private javax.swing.JTable WorkerTable;
    private javax.swing.JButton btnUpdateHireStatus;
    private javax.swing.JButton btnrefreshTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ownerTotalTextField;
    private javax.swing.JButton payWorker;
    // End of variables declaration//GEN-END:variables
}
