package org.itenas.is.crudproject.viewdbswing;

import javax.swing.JOptionPane;
import org.itenas.is.crudproject.model.User;

public class FormKasir extends javax.swing.JFrame {

    private final User user;


    public FormKasir(User user) {
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        menuUser.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("ini kasir");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel6)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel6)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        menuItemLogout.setText("Logout");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        menuUser.add(menuItemLogout);

        jMenuBar1.add(menuUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        int confirm = JOptionPane.showConfirmDialog(FormKasir.this, 
            "Are you sure you want to logout?", "Logout Confirmation",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            user.setRole(null); // Clear user role
            user.setUsername(null); // Clear username
            JOptionPane.showMessageDialog(FormKasir.this, "You have been logged out.");
            dispose(); // Close AdminDashboard
            new FormLogin().setVisible(true); // Open Login Form
        }
    }//GEN-LAST:event_menuItemLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}