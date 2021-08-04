/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.UserWindows;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import serviceprovidingsystem.MapAndAnimation.Animations;
import serviceprovidingsystem.Database.DatabaseConnection;
import serviceprovidingsystem.SignInWindow;

/**
 *
 * @author omer
 */
public class StatusAndFee extends javax.swing.JFrame {

    /**
     * Creates new form AddressWindow
     */
    //attribute
    DatabaseConnection database;
    //setting panel
        private boolean isSandwhichSettingPanelOpen = false;
        private int widthOfSettingPanel;
        private int heightOfSettingPanel;
        
    //Movable HomeBarPanel
        int XMouse;
        int YMouse;
        
        
    public StatusAndFee(){
        initComponents();
    }
        
    public StatusAndFee(DatabaseConnection database) {
        initComponents();
        this.database = database;
        this.setBackground(new Color(0,0,0,0));
        this.setOpacity(0f);
        this.setLocationRelativeTo(null);
        this.receiptBackground.setVisible(false);
        this.sandwichSettingPanel.setVisible(false);
        widthOfSettingPanel =  this.sandwichSettingPanel.getWidth();
        heightOfSettingPanel = this.sandwichSettingPanel.getHeight();
        receiptTextArea.setText("Your Details\n\n" +
"Username\t\t"+"name"+"\n" +
"Mobile Number\t"+"customerNumber"+"\n" +
"Address\t\t"+"address"+"\n\n" +
"_________________________________________________________\n\n" +
"Your Worker's Details\n\n" +
"Name\t\t"+"name"+"\n" +
"Cnic no.\t\t"+"cnic"+"\n" +
"profession\t\t"+"jobType"+"\n" +
"Fee\t\tcost\n" +
"Experience\t\t"+"experience"+"\n" +
"Rating\t\t"+"rating");
        
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
        logoBar = new com.k33ptoo.components.KGradientPanel();
        closeBar = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        tItleBar = new com.k33ptoo.components.KGradientPanel();
        homeBar = new javax.swing.JLabel();
        sandwichSettingPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSettingPassword = new com.k33ptoo.components.KButton();
        btnSettingNumber = new com.k33ptoo.components.KButton();
        signOutBtn1 = new com.k33ptoo.components.KButton();
        PendingBackground = new com.k33ptoo.components.KGradientPanel();
        pendingLoading = new javax.swing.JLabel();
        PendingLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        homeBackgroundPanel = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        receiptBackground = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1066, 600));

        logoBar.setkEndColor(new java.awt.Color(24, 25, 25));
        logoBar.setkGradientFocus(50);
        logoBar.setkStartColor(new java.awt.Color(28, 40, 51));
        logoBar.setOpaque(false);

        javax.swing.GroupLayout logoBarLayout = new javax.swing.GroupLayout(logoBar);
        logoBar.setLayout(logoBarLayout);
        logoBarLayout.setHorizontalGroup(
            logoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        logoBarLayout.setVerticalGroup(
            logoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLayeredPane1.add(logoBar);
        logoBar.setBounds(10, 0, 50, 40);

        closeBar.setkEndColor(new java.awt.Color(24, 25, 25));
        closeBar.setkGradientFocus(50);
        closeBar.setkStartColor(new java.awt.Color(28, 40, 51));
        closeBar.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/close_window_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(21, 19));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout closeBarLayout = new javax.swing.GroupLayout(closeBar);
        closeBar.setLayout(closeBarLayout);
        closeBarLayout.setHorizontalGroup(
            closeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        closeBarLayout.setVerticalGroup(
            closeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLayeredPane1.add(closeBar);
        closeBar.setBounds(1010, 0, 40, 40);

        tItleBar.setkEndColor(new java.awt.Color(24, 25, 25));
        tItleBar.setkGradientFocus(1000);
        tItleBar.setkStartColor(new java.awt.Color(28, 40, 51));
        tItleBar.setOpaque(false);

        homeBar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        homeBar.setForeground(new java.awt.Color(255, 255, 255));
        homeBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBar.setText("Status And Fee");
        homeBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                homeBarMouseDragged(evt);
            }
        });
        homeBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout tItleBarLayout = new javax.swing.GroupLayout(tItleBar);
        tItleBar.setLayout(tItleBarLayout);
        tItleBarLayout.setHorizontalGroup(
            tItleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tItleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBar, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        tItleBarLayout.setVerticalGroup(
            tItleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tItleBarLayout.createSequentialGroup()
                .addComponent(homeBar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.add(tItleBar);
        tItleBar.setBounds(250, 0, 561, 70);

        sandwichSettingPanel.setkBorderRadius(15);
        sandwichSettingPanel.setkEndColor(new java.awt.Color(60, 156, 220));
        sandwichSettingPanel.setkStartColor(new java.awt.Color(180, 225, 255));
        sandwichSettingPanel.setOpaque(false);
        sandwichSettingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/settings_32px.png"))); // NOI18N
        jLabel1.setText("Settings");
        sandwichSettingPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, -1));

        btnSettingPassword.setText("Password");
        btnSettingPassword.setBorderPainted(false);
        btnSettingPassword.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSettingPassword.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSettingPassword.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSettingPassword.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnSettingPassword.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSettingPassword.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        btnSettingPassword.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSettingPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingPasswordMouseEntered(evt);
            }
        });
        btnSettingPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingPasswordActionPerformed(evt);
            }
        });
        sandwichSettingPanel.add(btnSettingPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 280, 30));

        btnSettingNumber.setText("Mobile number");
        btnSettingNumber.setBorderPainted(false);
        btnSettingNumber.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSettingNumber.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSettingNumber.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSettingNumber.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnSettingNumber.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSettingNumber.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        btnSettingNumber.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSettingNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingNumberMouseEntered(evt);
            }
        });
        btnSettingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingNumberActionPerformed(evt);
            }
        });
        sandwichSettingPanel.add(btnSettingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));

        signOutBtn1.setText("Sign Out");
        signOutBtn1.setBorderPainted(false);
        signOutBtn1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        signOutBtn1.setkEndColor(new java.awt.Color(255, 255, 255));
        signOutBtn1.setkForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn1.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        signOutBtn1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn1.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        signOutBtn1.setkStartColor(new java.awt.Color(255, 255, 255));
        signOutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOutBtn1MouseEntered(evt);
            }
        });
        signOutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtn1ActionPerformed(evt);
            }
        });
        sandwichSettingPanel.add(signOutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 398, 280, 30));

        jLayeredPane1.add(sandwichSettingPanel);
        sandwichSettingPanel.setBounds(62, 80, 410, 480);

        PendingBackground.setkBorderRadius(20);
        PendingBackground.setkEndColor(new java.awt.Color(231, 231, 231));
        PendingBackground.setkGradientFocus(100);
        PendingBackground.setkStartColor(new java.awt.Color(231, 231, 231));
        PendingBackground.setOpaque(false);

        pendingLoading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/short/loading.gif"))); // NOI18N
        pendingLoading.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        PendingLabel.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        PendingLabel.setForeground(new java.awt.Color(93, 173, 226));
        PendingLabel.setText("Pending");
        PendingLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/SlipWindow/reloadWindowIcon_32px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("a");

        javax.swing.GroupLayout PendingBackgroundLayout = new javax.swing.GroupLayout(PendingBackground);
        PendingBackground.setLayout(PendingBackgroundLayout);
        PendingBackgroundLayout.setHorizontalGroup(
            PendingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PendingBackgroundLayout.createSequentialGroup()
                .addGroup(PendingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendingBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(PendingBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PendingBackgroundLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addGroup(PendingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PendingLabel)
                    .addGroup(PendingBackgroundLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pendingLoading)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        PendingBackgroundLayout.setVerticalGroup(
            PendingBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendingBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(PendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendingLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(messageLabel)
                .addGap(39, 39, 39))
        );

        jLayeredPane1.add(PendingBackground);
        PendingBackground.setBounds(140, 100, 800, 440);

        homeBackgroundPanel.setkBorderRadius(60);
        homeBackgroundPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        homeBackgroundPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        homeBackgroundPanel.setOpaque(false);
        homeBackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel5.setkBorderRadius(50);
        kGradientPanel5.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel5.setkStartColor(new java.awt.Color(28, 40, 51));
        kGradientPanel5.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/sandwichMenu_32x.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/contactUs_32x.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(25, 25, 25))
        );

        homeBackgroundPanel.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        receiptBackground.setkBorderRadius(20);
        receiptBackground.setkEndColor(new java.awt.Color(231, 231, 231));
        receiptBackground.setkGradientFocus(100);
        receiptBackground.setkStartColor(new java.awt.Color(231, 231, 231));
        receiptBackground.setOpaque(false);
        receiptBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiptTextArea.setEditable(false);
        receiptTextArea.setBackground(new java.awt.Color(231, 231, 231));
        receiptTextArea.setColumns(20);
        receiptTextArea.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        receiptTextArea.setForeground(new java.awt.Color(0, 0, 0));
        receiptTextArea.setRows(5);
        receiptTextArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(231, 231, 231)));
        receiptTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(receiptTextArea);

        receiptBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 41, 340, 355));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        receiptBackground.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        receiptBackground.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        homeBackgroundPanel.add(receiptBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 52, 800, 440));

        jLayeredPane1.add(homeBackgroundPanel);
        homeBackgroundPanel.setBounds(0, 50, 1070, 552);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Animations.windowExitAnimation(this, 1f);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void homeBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_homeBarMouseDragged

    private void homeBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarMousePressed
        // TODO add your handling code here:
        XMouse = evt.getX() + (int) homeBackgroundPanel.getX()+ 255;
        YMouse = evt.getY() + (int) homeBackgroundPanel.getY() - 50;
    }//GEN-LAST:event_homeBarMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if(isSandwhichSettingPanelOpen){
            Animations.panelCloseAnimation(this.sandwichSettingPanel,widthOfSettingPanel,heightOfSettingPanel);
            isSandwhichSettingPanelOpen = false;
            jButton2.setVisible(true);
            jButton1.setVisible(true);
        } else{
            Animations.panelAppearAnimation(this.sandwichSettingPanel,widthOfSettingPanel,heightOfSettingPanel);
            isSandwhichSettingPanelOpen = true;
            jButton2.setVisible(false);
            jButton1.setVisible(false);
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Animations.windowAppearAnimation(this, 1f);
        //GET WORKER WHICH IS AVAILABLE AND TYPE OF WORKER BOOLEAN PASS
        if (database.GET_SINGLE_WORKER_BY_PROFESSION()) {
            
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void signOutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtn1ActionPerformed
        // TODO add your handling code here:

        Animations.windowCloseAnimation(this, 1f);
        new SignInWindow(database).setVisible(true);
    }//GEN-LAST:event_signOutBtn1ActionPerformed

    private void btnSettingPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingPasswordActionPerformed
        // TODO add your handling code here:
        new SettingPanel(database).setVisible(true);//open setting panel
    }//GEN-LAST:event_btnSettingPasswordActionPerformed

    private void btnSettingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingNumberActionPerformed
        // TODO add your handling code here:
        btnSettingPasswordActionPerformed(evt);//open same setting panel
    }//GEN-LAST:event_btnSettingNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            PrintWriter writer1 = new PrintWriter(new File("testout.txt"));
            writer1.write("Your Details\n" +
                "\n" +
                "Username        name\n" +
                "Mobile Number   customerNumber\n" +
                "Address         address\n" +
                "_________________________________________________________\n" +
                "\n" +
                "Your Worker's Details\n" +
                "\n" +
                "Name            name\n" +
                "Cnic no.        cnic\n" +
                "profession      jobType\n" +
                "Fee             cost\n" +
                "Experience      experience\n" +
                "Rating          rating");
            writer1.flush();
            writer1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StatusAndFee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        File file = new File("testout.txt");
        try {
            if(file.exists()){
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            } else {
                throw new NullPointerException("file not exist");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSettingPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingPasswordMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnSettingPassword.setCursor(cursor);
    }//GEN-LAST:event_btnSettingPasswordMouseEntered

    private void btnSettingNumberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingNumberMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnSettingNumber.setCursor(cursor);
    }//GEN-LAST:event_btnSettingNumberMouseEntered

    private void signOutBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutBtn1MouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        signOutBtn1.setCursor(cursor);
    }//GEN-LAST:event_signOutBtn1MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StatusAndFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusAndFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusAndFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusAndFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusAndFee(new DatabaseConnection()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel PendingBackground;
    private javax.swing.JLabel PendingLabel;
    private com.k33ptoo.components.KButton btnSettingNumber;
    private com.k33ptoo.components.KButton btnSettingPassword;
    private com.k33ptoo.components.KGradientPanel closeBar;
    private com.k33ptoo.components.KGradientPanel homeBackgroundPanel;
    private javax.swing.JLabel homeBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel logoBar;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel pendingLoading;
    private com.k33ptoo.components.KGradientPanel receiptBackground;
    private javax.swing.JTextArea receiptTextArea;
    private com.k33ptoo.components.KGradientPanel sandwichSettingPanel;
    private com.k33ptoo.components.KButton signOutBtn1;
    private com.k33ptoo.components.KGradientPanel tItleBar;
    // End of variables declaration//GEN-END:variables
}
