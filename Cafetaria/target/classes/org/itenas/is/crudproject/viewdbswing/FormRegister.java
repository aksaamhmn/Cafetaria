package org.itenas.is.crudproject.viewdbswing;

import javax.swing.JOptionPane;
import org.itenas.is.crudproject.model.User;
import org.itenas.is.crudproject.services.UserAuthService;
import org.itenas.is.crudproject.servicesdbimpl.UserAuthServiceDBImpl;

public class FormRegister extends javax.swing.JFrame {
    private UserAuthService userAuthService;

    public FormRegister() {
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
        label_username1 = new javax.swing.JLabel();
        combo_role = new javax.swing.JComboBox<>();
        label_username2 = new javax.swing.JLabel();
        label_image_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_logo.setBackground(new java.awt.Color(197, 112, 93));
        panel_logo.setForeground(new java.awt.Color(178, 2, 56));

        jPanel2.setBackground(new java.awt.Color(197, 112, 93));

        label_title_from_login.setBackground(new java.awt.Color(245, 245, 245));
        label_title_from_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_title_from_login.setForeground(new java.awt.Color(245, 245, 245));
        label_title_from_login.setText("REGISTER");

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
        button_login.setText("REGISTER");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        text_password.setBackground(new java.awt.Color(197, 112, 93));
        text_password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        text_password.setForeground(new java.awt.Color(242, 242, 242));
        text_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(242, 242, 242)));

        label_username1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_username1.setForeground(new java.awt.Color(245, 245, 245));
        label_username1.setText("Role");

        combo_role.setBackground(new java.awt.Color(197, 112, 93));
        combo_role.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_role.setForeground(new java.awt.Color(242, 242, 242));
        combo_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir", "Owner" }));
        combo_role.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_roleItemStateChanged(evt);
            }
        });
        combo_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_roleActionPerformed(evt);
            }
        });

        label_username2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_username2.setForeground(new java.awt.Color(245, 245, 245));
        label_username2.setText("have any account? Login");
        label_username2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_username2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label_username2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_username1)
                            .addComponent(label_username)
                            .addComponent(label_password)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(combo_role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                .addComponent(text_password, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(button_login)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label_title_from_login)
                        .addGap(160, 160, 160))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_title_from_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(label_username1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(label_username)
                .addGap(18, 18, 18)
                .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_password)
                .addGap(18, 18, 18)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(button_login)
                .addGap(18, 18, 18)
                .addComponent(label_username2)
                .addGap(23, 23, 23))
        );

        label_image_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itenas/is/crudproject/images/RegisLogin.png"))); // NOI18N

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoLayout.createSequentialGroup()
                .addComponent(label_image_background)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_logoLayout.createSequentialGroup()
                .addComponent(label_image_background, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        handleRegister();
    }//GEN-LAST:event_button_loginActionPerformed

    private void combo_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_roleActionPerformed

    private void combo_roleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_roleItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_roleItemStateChanged

    private void label_username2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_username2MouseClicked
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_label_username2MouseClicked

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JComboBox<String> combo_role;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_image_background;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_title_from_login;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel label_username1;
    private javax.swing.JLabel label_username2;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
    private void handleRegister() {
        try {
        // Ambil nilai dari input user
        String username = text_username.getText().trim();
        String password = new String(text_password.getPassword());
        String role = (String) combo_role.getSelectedItem(); 

        // Validasi input
        if (username.isEmpty() || password.isEmpty() || role == null) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validasi panjang password (opsional)
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buat objek User
        User newUser = new User(username, password, role);

        // Panggil metode registerUser untuk menyimpan ke database
        User registeredUser = userAuthService.registerUser(newUser);

        // Cek hasil pendaftaran
        if (registeredUser != null) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            new FormLogin().setVisible(true); // Navigasi ke halaman login
            dispose(); // Tutup form registrasi
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}