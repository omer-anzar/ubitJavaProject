/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem;
import serviceprovidingsystem.MapAndAnimation.Animations;
import java.awt.*;
import serviceprovidingsystem.Database.DatabaseConnection;
import java.util.*;
import javax.swing.ImageIcon;
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
    // Original Location
        int movablePanelX;
        int movablePanelY;
        
    public SignUp(){
        initComponents();
    }
    public SignUp(DatabaseConnection database) {
        initComponents();
        this.database = database;
        passwordAlreadyEmpty = false;
        passwordConfirmAlreadyEmpty = false;
        this.movablePanelX = movingRegisterPanel.getX();
        this.movablePanelY = movingRegisterPanel.getY();
        this.setBackground(new Color(0, 0, 0, 0));//and tick off from opaque in Kgradient Panel
        this.setOpacity(0f);
        this.setIconImage(new ImageIcon("src\\serviceprovidingsystem\\images\\short\\taskbarIcon.png").getImage());
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        movingRegisterPanel = new com.k33ptoo.components.KGradientPanel();
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
        backgroundPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movingRegisterPanel.setkBorderRadius(60);
        movingRegisterPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        movingRegisterPanel.setkGradientFocus(400);
        movingRegisterPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        movingRegisterPanel.setOpaque(false);
        movingRegisterPanel.setPreferredSize(new java.awt.Dimension(360, 503));
        movingRegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Confirm Password");
        movingRegisterPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/RegisterIcon_50x.png"))); // NOI18N
        jLabel9.setText("jLabel3");
        movingRegisterPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, 60));

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
        movingRegisterPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 230, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/mobileNumber_40px.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 50));
        movingRegisterPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 40));

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
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        movingRegisterPanel.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 280, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Register");
        movingRegisterPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 43));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        usernameField.setOpaque(false);
        movingRegisterPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, -1));

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
        movingRegisterPanel.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 230, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Username");
        movingRegisterPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password");
        movingRegisterPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 20));

        mobileNumberField.setBackground(new java.awt.Color(255, 255, 255));
        mobileNumberField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        mobileNumberField.setForeground(new java.awt.Color(102, 102, 102));
        mobileNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        mobileNumberField.setOpaque(false);
        movingRegisterPanel.add(mobileNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 230, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Mobile Number");
        movingRegisterPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/SignUp_Customer_40px.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 50));
        movingRegisterPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 40, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/password_40px.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 50));
        movingRegisterPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 40, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/password_40px.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 50));
        movingRegisterPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 40, 50));

        closeWindow.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        closeWindow.setForeground(new java.awt.Color(204, 204, 204));
        closeWindow.setText("X");
        closeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });
        movingRegisterPanel.add(closeWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 20, -1));

        backToSignInBtn.setBackground(new java.awt.Color(0, 102, 255));
        backToSignInBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/backToSignIn_32px.png"))); // NOI18N
        backToSignInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToSignInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToSignInBtnMouseClicked(evt);
            }
        });
        movingRegisterPanel.add(backToSignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        errorRegister.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        errorRegister.setForeground(new java.awt.Color(193, 56, 56));
        errorRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movingRegisterPanel.add(errorRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 250, 20));

        jLayeredPane1.add(movingRegisterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 460, -1));

        backgroundPanel.setkBorderRadius(60);
        backgroundPanel.setkEndColor(new java.awt.Color(60, 156, 220));
        backgroundPanel.setkGradientFocus(400);
        backgroundPanel.setkStartColor(new java.awt.Color(180, 225, 255));
        backgroundPanel.setOpaque(false);
        backgroundPanel.setPreferredSize(new java.awt.Dimension(926, 503));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/SignInWindow/SignWindowpic1.png"))); // NOI18N
        backgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Haazir");
        backgroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, -1));

        logoLabel.setForeground(new java.awt.Color(0, 0, 0));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/SignInWindow/SignInLogo.png"))); // NOI18N
        backgroundPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLayeredPane1.add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 930, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        }else if (passwordField.getText().isEmpty()){
        
            errorRegister.setText("Password is empty !");
            movingRegisterPanel.setLocation(backgroundPanel.getX(), 0);

        }else if (!confirmPasswordField.getText().equals(passwordField.getText())){
        
             errorRegister.setText("Password Mismatch");
             movingRegisterPanel.setLocation(backgroundPanel.getX(), 0);

            
        }else if (mobileNumberField.getText().isEmpty() || mobileNumberField.getText().length() < 11 || mobileNumberField.getText().length() > 11){
        
            errorRegister.setText("Incorrect Contact Format !");
            movingRegisterPanel.setLocation(backgroundPanel.getX(), 0);

        } else if (database.EXIST(usernameField.getText())){
            errorRegister.setText("Username Already exists!");
            
        } else {

            System.out.println("not exist");
            database.currentUser = new User(usernameField.getText(),passwordField.getText(),mobileNumberField.getText(),new Date());
            database.INSERT_USER();
            database.currentUser = null;
            //Animations.windowCloseAnimation(this, 1f);
            this.dispose();
            new SignInWindow(database).setVisible(true);

        }
        
        //ERROR FREE STILL ANIMATION
        SignUp window = this;
        Thread th = new Thread(){
            @Override
            public void run(){
                
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                movingRegisterPanel.setLocation(backgroundPanel.getX(), 0);
            }
        };th.start();
            
        
      
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
        Animations.windowExitAnimation(this, 1f);
    }//GEN-LAST:event_closeWindowMouseClicked

    private void backToSignInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToSignInBtnMouseClicked
        // TODO add your handling code here:
        //Animations.windowCloseAnimation(this, 1f);
        new SignInWindow(database).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToSignInBtnMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Animations.windowAppearAnimation(this, 1f);
        SignUp window = this;
        Thread th = new Thread(){
            @Override
            public void run(){
                try {
                    int X = movingRegisterPanel.getX();
                    for (int i = 0; i < 156; i++) {
                        if (i < 11){window.setOpacity(i/10);}
                        movingRegisterPanel.setLocation(X, 0);
                        X -= 3;                 
                        Thread.sleep(1);
                    } 
                } catch (Exception e) {
                }
                movingRegisterPanel.setLocation(backgroundPanel.getX(), 0);//REMEMBER
            }
        };th.start();
    }//GEN-LAST:event_formWindowOpened

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnSignUp.setCursor(cursor);
    }//GEN-LAST:event_btnSignUpMouseEntered

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
                new SignUp(new DatabaseConnection()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backToSignInBtn;
    private com.k33ptoo.components.KGradientPanel backgroundPanel;
    private com.k33ptoo.components.KButton btnSignUp;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel errorRegister;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JTextField mobileNumberField;
    private com.k33ptoo.components.KGradientPanel movingRegisterPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
