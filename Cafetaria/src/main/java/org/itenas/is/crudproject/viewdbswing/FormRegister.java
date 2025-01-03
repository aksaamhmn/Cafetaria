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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_logo.setBackground(new java.awt.Color(178, 2, 56));
        panel_logo.setForeground(new java.awt.Color(178, 2, 56));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label_title_from_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_title_from_login.setText("REGISTER");

        label_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_username.setText("Username");

        text_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });

        label_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_password.setText("Password");

        button_login.setBackground(new java.awt.Color(178, 5, 26));
        button_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("REGISTER");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        text_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        label_username1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_username1.setText("Role");

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

        label_username2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label_username1)
                                .addGap(25, 25, 25)
                                .addComponent(label_title_from_login))
                            .addComponent(label_username)
                            .addComponent(combo_role, 0, 188, Short.MAX_VALUE)
                            .addComponent(label_password)
                            .addComponent(text_password)
                            .addComponent(text_username)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(button_login))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label_username2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_title_from_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(label_username1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_username2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoLayout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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