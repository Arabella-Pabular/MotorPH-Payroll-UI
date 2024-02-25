/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FinanceUI;

/**
 *
 * @author Default
 */
public class FinanceStaffHome extends javax.swing.JFrame {

    /**
     * Creates new form FinanceStaffHome
     */
    public FinanceStaffHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFinanceStaffHome = new javax.swing.JPanel();
        FinanceMenu = new javax.swing.JPanel();
        jlabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelDashboard = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        PanelProfile = new javax.swing.JPanel();
        lblProfile = new javax.swing.JLabel();
        PanelPayroll = new javax.swing.JPanel();
        lblPayroll = new javax.swing.JLabel();
        PanelTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        PanelRequest = new javax.swing.JPanel();
        lblRequest = new javax.swing.JLabel();
        PanelDocuments = new javax.swing.JPanel();
        lblRequest1 = new javax.swing.JLabel();
        PanelSettings = new javax.swing.JPanel();
        lblSettings = new javax.swing.JLabel();
        PanelHelp = new javax.swing.JPanel();
        lblHelp = new javax.swing.JLabel();
        PanelLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        headPanelFn = new javax.swing.JPanel();
        lblNotificationsFn = new javax.swing.JLabel();
        lblProfileiconFn = new javax.swing.JLabel();
        HomeNameFn = new javax.swing.JLabel();
        HomePositionFn = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1240, 700));

        pnlFinanceStaffHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FinanceMenu.setBackground(new java.awt.Color(204, 204, 204));

        jlabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MPHLogo2.png"))); // NOI18N
        jlabelLogo.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MotorPH");

        PanelDashboard.setBackground(new java.awt.Color(204, 204, 204));
        PanelDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDashboardMouseClicked(evt);
            }
        });
        PanelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboard.setText("Dashboard");
        PanelDashboard.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelProfile.setBackground(new java.awt.Color(204, 204, 204));
        PanelProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelProfileMouseClicked(evt);
            }
        });
        PanelProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProfile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfile.setText("My Profile");
        PanelProfile.add(lblProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelPayroll.setBackground(new java.awt.Color(204, 204, 204));
        PanelPayroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelPayroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPayrollMouseClicked(evt);
            }
        });
        PanelPayroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPayroll.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblPayroll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPayroll.setText("My Pay");
        PanelPayroll.add(lblPayroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelTime.setBackground(new java.awt.Color(204, 204, 204));
        PanelTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTimeMouseClicked(evt);
            }
        });
        PanelTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Daily Time Record");
        PanelTime.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelRequest.setBackground(new java.awt.Color(204, 204, 204));
        PanelRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelRequestMouseClicked(evt);
            }
        });
        PanelRequest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRequest.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRequest.setText("Request");
        PanelRequest.add(lblRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelDocuments.setBackground(new java.awt.Color(204, 204, 204));
        PanelDocuments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelDocuments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDocumentsMouseClicked(evt);
            }
        });
        PanelDocuments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRequest1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblRequest1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRequest1.setText("Documents");
        PanelDocuments.add(lblRequest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelSettings.setBackground(new java.awt.Color(204, 204, 204));
        PanelSettings.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        PanelSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSettingsMouseClicked(evt);
            }
        });
        PanelSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSettings.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSettings.setText("Settings");
        PanelSettings.add(lblSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelHelp.setBackground(new java.awt.Color(204, 204, 204));
        PanelHelp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        PanelHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelHelpMouseClicked(evt);
            }
        });
        PanelHelp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHelp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHelp.setText("Help/Support");
        PanelHelp.add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        PanelLogout.setBackground(new java.awt.Color(204, 204, 204));
        PanelLogout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        PanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelLogoutMouseClicked(evt);
            }
        });
        PanelLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Log Out");
        PanelLogout.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, -1, 20));

        javax.swing.GroupLayout FinanceMenuLayout = new javax.swing.GroupLayout(FinanceMenu);
        FinanceMenu.setLayout(FinanceMenuLayout);
        FinanceMenuLayout.setHorizontalGroup(
            FinanceMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinanceMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FinanceMenuLayout.createSequentialGroup()
                .addGroup(FinanceMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FinanceMenuLayout.setVerticalGroup(
            FinanceMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinanceMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(PanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280)
                .addComponent(PanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlFinanceStaffHome.add(FinanceMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 700));

        headPanelFn.setBackground(new java.awt.Color(255, 255, 255));

        lblNotificationsFn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notifications.jpg"))); // NOI18N

        lblProfileiconFn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile2.png"))); // NOI18N

        HomeNameFn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeNameFn.setText("Finance Staff Name");

        HomePositionFn.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        HomePositionFn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomePositionFn.setText("Position");

        javax.swing.GroupLayout headPanelFnLayout = new javax.swing.GroupLayout(headPanelFn);
        headPanelFn.setLayout(headPanelFnLayout);
        headPanelFnLayout.setHorizontalGroup(
            headPanelFnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelFnLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblProfileiconFn)
                .addGap(10, 10, 10)
                .addGroup(headPanelFnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomePositionFn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeNameFn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                .addComponent(lblNotificationsFn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        headPanelFnLayout.setVerticalGroup(
            headPanelFnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelFnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headPanelFnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfileiconFn)
                    .addGroup(headPanelFnLayout.createSequentialGroup()
                        .addComponent(HomeNameFn)
                        .addGap(4, 4, 4)
                        .addComponent(HomePositionFn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(headPanelFnLayout.createSequentialGroup()
                .addComponent(lblNotificationsFn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlFinanceStaffHome.add(headPanelFn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 1090, 60));

        CenterPanel.setLayout(new java.awt.CardLayout());
        pnlFinanceStaffHome.add(CenterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 1090, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFinanceStaffHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFinanceStaffHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseClicked
        // TODO add your handling code here:

        onClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onLeaveClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(true);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (false);
        p4Time.setVisible (false);
        p5Request.setVisible (false);
        p6Documents.setVisible (false);
        p7Settings.setVisible (false);
        p8Help.setVisible (false);

    }//GEN-LAST:event_PanelDashboardMouseClicked

    private void PanelProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelProfileMouseClicked
        // TODO add your handling code here:

        onLeaveClick(PanelDashboard);
        onClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onLeaveClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (true);
        p3Payroll.setVisible (false);
        p4Time.setVisible (false);
        p5Request.setVisible (false);
        p6Documents.setVisible (false);
        p7Settings.setVisible (false);
        p8Help.setVisible (false);
    }//GEN-LAST:event_PanelProfileMouseClicked

    private void PanelPayrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPayrollMouseClicked
        // TODO add your handling code here:

        onLeaveClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onLeaveClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (true);
        p4Time.setVisible (false);
        p5Request.setVisible (false);
        p6Documents.setVisible (false);
        p7Settings.setVisible (false);
        p8Help.setVisible (false);
    }//GEN-LAST:event_PanelPayrollMouseClicked

    private void PanelTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTimeMouseClicked
        // TODO add your handling code here:

        onLeaveClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onClick(PanelTime);
        onLeaveClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (false);
        p4Time.setVisible (true);
        p5Request.setVisible (false);
        p6Documents.setVisible (false);
        p7Settings.setVisible (false);
        p8Help.setVisible (false);

    }//GEN-LAST:event_PanelTimeMouseClicked

    private void PanelRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRequestMouseClicked
        // TODO add your handling code here:

        onLeaveClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (false);
        p4Time.setVisible (false);
        p5Request.setVisible (true);
        p6Documents.setVisible (false);
        p7Settings.setVisible (false);
        p8Help.setVisible (false);
    }//GEN-LAST:event_PanelRequestMouseClicked

    private void PanelDocumentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDocumentsMouseClicked
        // TODO add your handling code here:
        onLeaveClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onLeaveClick(PanelRequest);
        onClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (false);
        p4Time.setVisible (false);
        p5Request.setVisible (false);
        p6Documents.setVisible (true);
        p7Settings.setVisible (false);
        p8Help.setVisible (false);

    }//GEN-LAST:event_PanelDocumentsMouseClicked

    private void PanelSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSettingsMouseClicked
        // TODO add your handling code here:
        onLeaveClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onLeaveClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onClick(PanelSettings);
        onLeaveClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (false);
        p4Time.setVisible (false);
        p5Request.setVisible (false);
        p6Documents.setVisible (false);
        p7Settings.setVisible (true);
        p8Help.setVisible (false);
    }//GEN-LAST:event_PanelSettingsMouseClicked

    private void PanelHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHelpMouseClicked
        // TODO add your handling code here:

        onLeaveClick(PanelDashboard);
        onLeaveClick(PanelProfile);
        onLeaveClick(PanelPayroll);
        onLeaveClick(PanelTime);
        onLeaveClick(PanelRequest);
        onLeaveClick(PanelDocuments);
        onLeaveClick(PanelSettings);
        onClick(PanelHelp);

        p1Dashboard.setVisible(false);
        p2Profile.setVisible (false);
        p3Payroll.setVisible (false);
        p4Time.setVisible (false);
        p5Request.setVisible (false);
        p6Documents.setVisible (false);
        p7Settings.setVisible (false);
        p8Help.setVisible (true);

    }//GEN-LAST:event_PanelHelpMouseClicked

    private void PanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMouseClicked

        this.dispose();

    }//GEN-LAST:event_PanelLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(FinanceStaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinanceStaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinanceStaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinanceStaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinanceStaffHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel FinanceMenu;
    private javax.swing.JLabel HomeNameFn;
    private javax.swing.JLabel HomePositionFn;
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelDocuments;
    private javax.swing.JPanel PanelHelp;
    private javax.swing.JPanel PanelLogout;
    private javax.swing.JPanel PanelPayroll;
    private javax.swing.JPanel PanelProfile;
    private javax.swing.JPanel PanelRequest;
    private javax.swing.JPanel PanelSettings;
    private javax.swing.JPanel PanelTime;
    private javax.swing.JPanel headPanelFn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelLogo;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNotificationsFn;
    private javax.swing.JLabel lblPayroll;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblProfileiconFn;
    private javax.swing.JLabel lblRequest;
    private javax.swing.JLabel lblRequest1;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlFinanceStaffHome;
    // End of variables declaration//GEN-END:variables
}
