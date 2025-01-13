package org.itenas.is.crudproject.viewdbswing;

import javax.swing.JOptionPane;
import org.itenas.is.crudproject.model.User;
import org.itenas.is.crudproject.services.UserAuthService;
import org.itenas.is.crudproject.servicesdbimpl.UserAuthServiceDBImpl;

public class FormLogin extends javax.swing.JFrame {

    private UserAuthService userAuthService;
    
    public FormLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        userAuthService = new UserAuthServiceDBImpl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_logo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_title_from_login = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        button_login = new javax.swing.JButton();
        text_password = new javax.swing.JPasswordField();
        label_password1 = new javax.swing.JLabel();
        label_image_backrgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_logo.setBackground(new java.awt.Color(197, 112, 93));
        panel_logo.setForeground(new java.awt.Color(197, 112, 93));

        jPanel2.setBackground(new java.awt.Color(197, 112, 93));

        label_title_from_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_title_from_login.setForeground(new java.awt.Color(245, 245, 245));
        label_title_from_login.setText("LOGIN");

        label_username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_username.setForeground(new java.awt.Color(245, 245, 245));
        label_username.setText("Username");

        text_username.setBackground(new java.awt.Color(197, 112, 93));
        text_username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        text_username.setForeground(new java.awt.Color(242, 242, 242));
        text_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(242, 242, 242)));
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });

        label_password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_password.setForeground(new java.awt.Color(245, 245, 245));
        label_password.setText("Password");

        button_login.setBackground(new java.awt.Color(208, 184, 168));
        button_login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        button_login.setForeground(new java.awt.Color(153, 153, 153));
        button_login.setText("LOGIN");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        text_password.setBackground(new java.awt.Color(197, 112, 93));
        text_password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        text_password.setForeground(new java.awt.Color(242, 242, 242));
        text_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(242, 242, 242)));

        label_password1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_password1.setForeground(new java.awt.Color(245, 245, 245));
        label_password1.setText("Don't have any account? Sign Up");
        label_password1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_password1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_username)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_password, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_password)
                                .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_password1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(label_title_from_login)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(label_title_from_login)
                .addGap(46, 46, 46)
                .addComponent(label_username)
                .addGap(18, 18, 18)
                .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(label_password)
                .addGap(18, 18, 18)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(button_login)
                .addGap(18, 18, 18)
                .addComponent(label_password1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_image_backrgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itenas/is/crudproject/images/RegisLogin.png"))); // NOI18N

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoLayout.createSequentialGroup()
                .addComponent(label_image_backrgound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_image_backrgound, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed

    }//GEN-LAST:event_text_usernameActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
      handleLogin();
    }//GEN-LAST:event_button_loginActionPerformed

    private void label_password1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_password1MouseClicked
        new FormRegister().setVisible(true);
        dispose();
    }//GEN-LAST:event_label_password1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_image_backrgound;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_password1;
    private javax.swing.JLabel label_title_from_login;
    private javax.swing.JLabel label_username;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables

    private void handleLogin() {
        try {
            String username = text_username.getText();
            String password = new String(text_password.getPassword());
            User user = new User(username, password, null); // Password diisi, role tidak diketahui saat ini

            User authenticatedUser = userAuthService.authenticateUser(user);

            if (authenticatedUser != null) {
                navigateToRoleBasedPage(authenticatedUser);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Server dalam keadaan tidak menyala atau down!");
        }
    }

    private void navigateToRoleBasedPage(User user) {
        switch (user.getRole()) {
            case "Admin":
                JOptionPane.showMessageDialog(this, "Welcome, Admin!");
                // Open Admin Dashboard
                new AdminDashboard(user).setVisible(true);
                break;
            case "Kasir":
                JOptionPane.showMessageDialog(this, "Welcome, Kasir!");
                // Open Kasir Mmenu
                new FormKasir(user).setVisible(true);
                break;
            case "Owner":
                JOptionPane.showMessageDialog(this, "Welcome, Owner!");
                // Open Owner Menu
                new FormOwner(user).setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Role not recognized!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        dispose(); // Close the current window
    }
}