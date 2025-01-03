package org.itenas.is.crudproject.viewdbswing;

import javax.swing.JOptionPane;
import org.itenas.is.crudproject.model.User;

public class AdminDashboard extends javax.swing.JFrame {

    private final User user;
    
    public AdminDashboard(User user) {
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        menu_user.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_user = new javax.swing.JMenu();
        menu_item_logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ini admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        menu_item_logout.setText("Logout");
        menu_item_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_logoutActionPerformed(evt);
            }
        });
        menu_user.add(menu_item_logout);

        jMenuBar1.add(menu_user);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_logoutActionPerformed
    int confirm = JOptionPane.showConfirmDialog(AdminDashboard.this, 
            "Are you sure you want to logout?", "Logout Confirmation",
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        user.setRole(null); // Clear user role
        user.setUsername(null); // Clear username
        JOptionPane.showMessageDialog(AdminDashboard.this, "You have been logged out.");
        dispose(); // Close AdminDashboard
        new FormLogin().setVisible(true); // Open Login Form
    }

    }//GEN-LAST:event_menu_item_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_item_logout;
    private javax.swing.JMenu menu_user;
    // End of variables declaration//GEN-END:variables
}