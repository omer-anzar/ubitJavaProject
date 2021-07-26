/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem;
import java.awt.*;
import serviceprovidingsystem.Database.DatabaseConnection;
import java.util.*;
import serviceprovidingsystem.Accounts.User;
/**
 *
 * @author omer
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    DatabaseConnection database;
    boolean passwordAlreadyEmpty; //for password field password
    boolean passwordConfirmAlreadyEmpty; //for password field confirm
    
    public SignUp(){
        initComponents();
    }
    public SignUp(DatabaseConnection database) {
        initComponents();
        this.database = database;
        passwordAlreadyEmpty = false;
        passwordConfirmAlreadyEmpty = false;
        this.setBackground(new Color(0, 0, 0, 0));//and tick off from opaque in Kgradient Panel
        this.setOpacity(0f);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btnSignUp = new com.k33ptoo.components.KButton();
        jLabel14 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mobileNumberField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        closeWindow = new javax.swing.JLabel();
        backToSignInBtn = new javax.swing.JLabel();
        errorRegister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkBorderRadius(60);
        kGradientPanel1.setkEndColor(new java.awt.Color(60, 156, 220));
        kGradientPanel1.setkGradientFocus(400);
        kGradientPanel1.setkStartColor(new java.awt.Color(180, 225, 255));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(926, 503));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(60);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkGradientFocus(400);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(360, 503));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Confirm Password");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/RegisterIcon_50x.png"))); // NOI18N
        jLabel9.setText("jLabel3");
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, 60));

        passwordField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("jPasswor");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        passwordField.setEchoChar('\u25cf');
        passwordField.setOpaque(false);
        passwordField.setPreferredSize(new java.awt.Dimension(71, 17));
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        kGradientPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 230, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/mobileNumber_40px.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 50));
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 40));

        btnSignUp.setText("Register");
        btnSignUp.setBorderPainted(false);
        btnSignUp.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSignUp.setkBorderRadius(20);
        btnSignUp.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSignUp.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignUp.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnSignUp.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSignUp.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        btnSignUp.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 280, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Register");
        kGradientPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 43));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        usernameField.setOpaque(false);
        kGradientPanel2.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, -1));

        confirmPasswordField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(102, 102, 102));
        confirmPasswordField.setText("dField1j");
        confirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        confirmPasswordField.setEchoChar('\u25cf');
        confirmPasswordField.setOpaque(false);
        confirmPasswordField.setPreferredSize(new java.awt.Dimension(71, 17));
        confirmPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPasswordFieldMouseClicked(evt);
            }
        });
        kGradientPanel2.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 230, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Username");
        kGradientPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password");
        kGradientPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 20));

        mobileNumberField.setBackground(new java.awt.Color(255, 255, 255));
        mobileNumberField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        mobileNumberField.setForeground(new java.awt.Color(102, 102, 102));
        mobileNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        mobileNumberField.setOpaque(false);
        kGradientPanel2.add(mobileNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 230, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Mobile Number");
        kGradientPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/SignUp_Customer_40px.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 50));
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 40, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/password_40px.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 50));
        kGradientPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 40, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/password_40px.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 50));
        kGradientPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 40, 50));

        closeWindow.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        closeWindow.setForeground(new java.awt.Color(204, 204, 204));
        closeWindow.setText("X");
        closeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });
        kGradientPanel2.add(closeWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 20, -1));

        backToSignInBtn.setBackground(new java.awt.Color(0, 102, 255));
        backToSignInBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/backToSignIn_32px.png"))); // NOI18N
        backToSignInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToSignInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToSignInBtnMouseClicked(evt);
            }
        });
        kGradientPanel2.add(backToSignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        errorRegister.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        errorRegister.setForeground(new java.awt.Color(193, 56, 56));
        errorRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel2.add(errorRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 250, 20));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 460, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/SignInWindow/SignWindowpic1.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        // TODO add your handling code here:
        if (passwordAlreadyEmpty) { //if password is not empty then run else code
            ;//after getting true it wont remove text in password field
        }else {
            passwordField.setText(null);
            passwordAlreadyEmpty = true;
        }
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (usernameField.getText().isEmpty()){
            
            errorRegister.setText("User name is empty !");
            return;
        }else if (passwordField.getText().isEmpty()){
        
            errorRegister.setText("Password is empty !");
            return;
        }else if (!confirmPasswordField.getText().equals(passwordField.getText())){
        
             errorRegister.setText("Password Mismatch");
            return;
            
        }else if (mobileNumberField.getText().isEmpty() || mobileNumberField.getText().length() < 11 || mobileNumberField.getText().length() > 11){
        
            errorRegister.setText("Incorrect Contact Format !");
            return;
        }
            
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void confirmPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordFieldMouseClicked
        // TODO add your handling code here:
        if (passwordConfirmAlreadyEmpty) { //if password is not empty then run else code
            ;//after getting true it wont remove text in password field
        }else {
            confirmPasswordField.setText(null);
            passwordConfirmAlreadyEmpty = true;
        }
        
    }//GEN-LAST:event_confirmPasswordFieldMouseClicked

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindowMouseClicked
        // TODO add your handling code here:
        Animations.windowCloseAnimation(this, 1f);
    }//GEN-LAST:event_closeWindowMouseClicked

    private void backToSignInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToSignInBtnMouseClicked
        // TODO add your handling code here:
        Animations.windowCloseAnimation(this, 1f);
        new SignInWindow(database).setVisible(true);
    }//GEN-LAST:event_backToSignInBtnMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Animations.windowAppearAnimation(this, 1f);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backToSignInBtn;
    private com.k33ptoo.components.KButton btnSignUp;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel errorRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
