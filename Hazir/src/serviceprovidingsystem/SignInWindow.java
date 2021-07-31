/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem;
import serviceprovidingsystem.MapAndAnimation.Animations;
import java.awt.*;
import java.util.Date;
import serviceprovidingsystem.Accounts.User;
import serviceprovidingsystem.UserWindows.AddressWindow;
import serviceprovidingsystem.Database.DatabaseConnection;
import serviceprovidingsystem.UserWindows.HomeWindow;
import serviceprovidingsystem.UserWindows.StatusAndFee;

/**
 *
 * @author omer
 */
public class SignInWindow extends javax.swing.JFrame {

    /**
     * Creates new form SignInWindow
     */
    //attributes
    DatabaseConnection database;
    boolean passwordAlreadyEmpty; //for password field
    
    // Original Location
        int movablePanelX;
        int movablePanelY;
    
    public SignInWindow() {
        initComponents();
    }
    
    public SignInWindow(DatabaseConnection database) {
        initComponents();
        this.database = database;
        this.database.currentUser=null;
        this.movablePanelX = signInMovablePanel.getX();
        this.movablePanelY = signInMovablePanel.getY();
        passwordAlreadyEmpty = false;
        this.setBackground(new Color(0, 0, 0, 0));//and tick off from opaque in Kgradient Panel
        this.setOpacity(0f);//set opacity transparency
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
        signInMovablePanel = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        closeWindow = new javax.swing.JLabel();
        btnSignIn1 = new com.k33ptoo.components.KButton();
        btnGotoRegister = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorRegister = new javax.swing.JLabel();
        backGroundPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signInMovablePanel.setkBorderRadius(60);
        signInMovablePanel.setkEndColor(new java.awt.Color(255, 255, 255));
        signInMovablePanel.setkGradientFocus(400);
        signInMovablePanel.setkStartColor(new java.awt.Color(255, 255, 255));
        signInMovablePanel.setOpaque(false);
        signInMovablePanel.setPreferredSize(new java.awt.Dimension(360, 503));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/SignInWindow/SignInIcon_50x.png"))); // NOI18N
        jLabel9.setText("jLabel3");

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

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Sign In");

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));
        usernameField.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Username");

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/SignUp_Customer_40px.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/RegisterWindow/password_40px.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 50));

        closeWindow.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        closeWindow.setForeground(new java.awt.Color(204, 204, 204));
        closeWindow.setText("X");
        closeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });

        btnSignIn1.setText("Sign In");
        btnSignIn1.setBorderPainted(false);
        btnSignIn1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSignIn1.setkBorderRadius(20);
        btnSignIn1.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSignIn1.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignIn1.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnSignIn1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSignIn1.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        btnSignIn1.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignIn1ActionPerformed(evt);
            }
        });

        btnGotoRegister.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btnGotoRegister.setForeground(new java.awt.Color(0, 102, 204));
        btnGotoRegister.setText("Register Now");
        btnGotoRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGotoRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGotoRegisterMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Don't have an account?");

        errorRegister.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        errorRegister.setForeground(new java.awt.Color(193, 56, 56));
        errorRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout signInMovablePanelLayout = new javax.swing.GroupLayout(signInMovablePanel);
        signInMovablePanel.setLayout(signInMovablePanelLayout);
        signInMovablePanelLayout.setHorizontalGroup(
            signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(closeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel15))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel16))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnSignIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(btnGotoRegister))
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(errorRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        signInMovablePanelLayout.setVerticalGroup(
            signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInMovablePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closeWindow)
                .addGap(1, 1, 1)
                .addGroup(signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInMovablePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signInMovablePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signInMovablePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnSignIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(signInMovablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnGotoRegister))
                .addGap(13, 13, 13)
                .addComponent(errorRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(signInMovablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        backGroundPanel.setkBorderRadius(60);
        backGroundPanel.setkEndColor(new java.awt.Color(60, 156, 220));
        backGroundPanel.setkGradientFocus(400);
        backGroundPanel.setkStartColor(new java.awt.Color(180, 225, 255));
        backGroundPanel.setOpaque(false);
        backGroundPanel.setPreferredSize(new java.awt.Dimension(926, 503));
        backGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/SignInWindow/SignWindowpic1.png"))); // NOI18N
        backGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        logoLabel.setForeground(new java.awt.Color(0, 0, 0));
        logoLabel.setText("LOGO");
        backGroundPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLayeredPane1.add(backGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 930, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindowMouseClicked
        // TODO add your handling code here:
        Animations.windowExitAnimation(this, 1f);
    }//GEN-LAST:event_closeWindowMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        // TODO add your handling code here:
        if (passwordAlreadyEmpty) { //if password is not empty then run else code
            ;
        }else {
            passwordField.setText(null);
            passwordAlreadyEmpty = true;
        }
        
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void btnSignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignIn1ActionPerformed
        // TODO add your handling code here:
        if (usernameField.getText().isEmpty()){
            
            errorRegister.setText("User name is empty !");
        }else if (passwordField.getText().isEmpty()){
        
            errorRegister.setText("Password is empty !");
        }  else if (database.Login(usernameField.getText(), passwordField.getText())){         

            //Animations.windowCloseAnimation(this, 1f);
            
            //IF ORDER STATUS IS TRUE THEN JUMP TO STATUS FEE WINDOW ELSE HOME WINDOW
            if(database.currentUser.isOrderStatus()) {
                this.dispose();         //if true then open slip window
                new StatusAndFee(database).setVisible(true);
            } else { 
                this.dispose();         //if false then open home window
                new AddressWindow(database).setVisible(true);
            }
            

        } else {
            errorRegister.setText("Username or password is incorrect!");
        }
        
        //ERROR FREE STILL ANIMATION
        SignInWindow window = this;
        Thread th = new Thread(){
            @Override
            public void run(){
                
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                signInMovablePanel.setLocation(470, 0);
            }
        };th.start();

    }//GEN-LAST:event_btnSignIn1ActionPerformed

    private void btnGotoRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGotoRegisterMouseClicked
        // TODO add your handling code here:
        //Animations.windowCloseAnimation(this,1f);
        
        new SignUp(database).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGotoRegisterMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Animations.windowAppearAnimation(this, 1f);
        SignInWindow window = this;
        Thread th = new Thread(){
            @Override
            public void run(){
                try {
                    int X = backGroundPanel.getX();
                    for (int i = 0; i < 156; i++) {
                        if (i < 11){window.setOpacity(i/10);}//might delete
                        signInMovablePanel.setLocation(X, 0);
                        X += 3;                 
                        Thread.sleep(1);
                    } 
                } catch (Exception e) {
                }
                signInMovablePanel.setLocation(470, 0);//REMEMBER
            }
        };th.start();
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
            java.util.logging.Logger.getLogger(SignInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInWindow(new DatabaseConnection()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel backGroundPanel;
    private javax.swing.JLabel btnGotoRegister;
    private com.k33ptoo.components.KButton btnSignIn1;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JLabel errorRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordField;
    private com.k33ptoo.components.KGradientPanel signInMovablePanel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
