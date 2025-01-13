package org.itenas.is.crudproject.viewdbswing;

import net.coobird.thumbnailator.Thumbnails;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.itenas.is.crudproject.dbconfig.ConnectionManager;
import org.itenas.is.crudproject.model.User;
import org.itenas.is.crudproject.model.Menu;
import org.itenas.is.crudproject.services.CrudService;
import org.itenas.is.crudproject.servicesdbimpl.MenuCrudServicesDBImpl;

public class AdminDashboard extends javax.swing.JFrame {

    private DefaultTableModel model;
    private CrudService<Menu> menuCrudService;
    private Menu menu;
    private final User user;
    
    public AdminDashboard(User user) {
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
        menu_user.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMenu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_menu = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtJudul = new javax.swing.JLabel();
        txtGarisJudul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtImagePath = new javax.swing.JTextField();
        btnUploadImage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_user = new javax.swing.JMenu();
        menu_item_logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 112, 93));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nama Menu");

        txtMenu.setBackground(new java.awt.Color(197, 112, 93));
        txtMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMenu.setForeground(new java.awt.Color(245, 245, 245));
        txtMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Harga Menu");

        txtHarga.setBackground(new java.awt.Color(197, 112, 93));
        txtHarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(245, 245, 245));
        txtHarga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(248, 237, 227));

        tabel_menu.setBackground(new java.awt.Color(248, 237, 227));
        tabel_menu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabel_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Menu", "Nama Menu", "Harga Menu"
            }
        ));
        tabel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_menu);

        btnClear.setBackground(new java.awt.Color(208, 184, 168));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 153, 153));
        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(208, 184, 168));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(153, 153, 153));
        btnSubmit.setText("submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(208, 184, 168));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(153, 153, 153));
        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(208, 184, 168));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtJudul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtJudul.setForeground(new java.awt.Color(245, 245, 245));
        txtJudul.setText("HALAMAN MENU");

        txtGarisJudul.setBackground(new java.awt.Color(197, 112, 93));
        txtGarisJudul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtGarisJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarisJudulActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("image path");

        txtImagePath.setEditable(false);
        txtImagePath.setBackground(new java.awt.Color(248, 237, 227));
        txtImagePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagePathActionPerformed(evt);
            }
        });

        btnUploadImage.setBackground(new java.awt.Color(208, 184, 168));
        btnUploadImage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUploadImage.setForeground(new java.awt.Color(153, 153, 153));
        btnUploadImage.setText("add image");
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 237, 227));

        lblImage.setBackground(new java.awt.Color(153, 153, 153));
        lblImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGarisJudul)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtJudul)
                .addGap(288, 288, 288))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addComponent(btnClear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUploadImage)
                            .addComponent(jLabel4)
                            .addComponent(txtImagePath)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGarisJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMenu)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear)
                        .addGap(20, 20, 20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnUploadImage))
                .addGap(45, 45, 45))
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

    private void txtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            if (txtMenu.getText().trim().isEmpty()
                    || txtHarga.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String targetDirPath = "src/main/java/org/itenas/is/crudproject/images";
            File targetDir = new File(targetDirPath);
            if (!targetDir.exists()) {
                targetDir.mkdirs(); // Membuat direktori jika belum ada
            }

            // Nama file gambar
            String fileName = txtMenu.getText().replaceAll("\\s+", "_") + ".jpeg";
            File targetFile = new File(targetDir, fileName);

            try (OutputStream os = new FileOutputStream(targetFile)) {
                os.write(menuImage);
                JOptionPane.showMessageDialog(null, "Gambar disimpan di: " + targetFile.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error saat menyimpan gambar: " + ex.getMessage());
            }

           String namaMenu = txtMenu.getText().trim();
           int hargaMenu = Integer.parseInt(txtHarga.getText().trim());

           menu = new Menu();
           menu.setNamaMenu(namaMenu);
           menu.setHargaMenu((int) hargaMenu);

           menuCrudService.create(menu);
           JOptionPane.showMessageDialog(this, "Data menu berhasil dibuat!", "Success", JOptionPane.INFORMATION_MESSAGE);

           loadData();
           emptyField();
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Format angka tidak valid! Periksa input Harga Menu.", "Error", JOptionPane.ERROR_MESSAGE);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        menuCrudService = new MenuCrudServicesDBImpl(new ConnectionManager());
        try {
            // Ambil baris yang dipilih dari tabel
            int selectedRow = tabel_menu.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Ambil ID dari kolom pertama tabel
            int menuId = Integer.parseInt(tabel_menu.getValueAt(selectedRow, 0).toString());

            // Konfirmasi penghapusan data
            int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Hapus data melalui service
                boolean isDeleted = menuCrudService.delete(menuId);
                if (isDeleted) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadData(); // Refresh tabel
                    emptyField(); // Kosongkan input field
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus data. Periksa kembali ID Menu!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_menuMouseClicked
        int i = tabel_menu.getSelectedRow();
        if (i >= 0) {
            TableModel model = tabel_menu.getModel();
            txtMenu.setText(model.getValueAt(i, 1).toString());
            txtHarga.setText(model.getValueAt(i, 2).toString());

            // Definisikan namaMenu
            String namaMenu = model.getValueAt(i, 1).toString();

            try {
                // imageFile = new File("src/main/java/org/itenas/is/crudproject/images/" + namaMenu + ".jpeg");
                File imageFile = new File("src/main/java/org/itenas/is/crudproject/images/" 
    + namaMenu.replace(" ", "_") + ".jpeg");

                // Periksa apakah file benar-benar ada
                if (imageFile.exists()) {
                    BufferedImage originalImage = ImageIO.read(imageFile);
                    if (originalImage == null) {
                        lblImage.setIcon(null);
                        JOptionPane.showMessageDialog(null, "Gambar tidak dapat dimuat.");
                        return;
                    }

                    BufferedImage resizedImage = Thumbnails.of(originalImage)
                        .size(150, 110)
                        .asBufferedImage();

                    ImageIcon icon = new ImageIcon(resizedImage);
                    lblImage.setIcon(icon);

                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(resizedImage, "jpeg", baos);
                    byte[] imageData = baos.toByteArray();
                } else {
                    lblImage.setIcon(null);
                    JOptionPane.showMessageDialog(null, "Gambar tidak ditemukan untuk menu: " + namaMenu);
                }
            } catch (IOException e) {
                lblImage.setIcon(null);
                JOptionPane.showMessageDialog(null, "Error saat memuat gambar: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_tabel_menuMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        emptyField();
        loadData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        menuCrudService = new MenuCrudServicesDBImpl(new ConnectionManager());
        try {
            // Validasi input data
            if (txtMenu.getText().trim().isEmpty()
                    || txtHarga.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Ambil data dari input
            String namaMenu = txtMenu.getText().trim();
            int hargaMenu = Integer.parseInt(txtHarga.getText().trim());

            // Ambil ID dari tabel (atau sumber lain)
            int selectedRow = tabel_menu.getSelectedRow(); // Ambil baris yang dipilih
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin diperbarui!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int menuId = (int) tabel_menu.getValueAt(selectedRow, 0); // Ambil ID dari kolom pertama

            // Inisialisasi objek Menu
            Menu menu = new Menu();
            menu.setNamaMenu(namaMenu);
            menu.setHargaMenu((int) hargaMenu);

            // Simpan data melalui service
            menuCrudService.update(menuId, menu);
            JOptionPane.showMessageDialog(this, "Data menu berhasil diperbarui!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Reset tampilan
            loadData();
            emptyField();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format angka tidak valid! Periksa input Harga Menu.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtGarisJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarisJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarisJudulActionPerformed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        String namaFileMenu = null;
        ImageIcon menuIcon = null;

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            namaFileMenu = file.getAbsolutePath();
            txtImagePath.setText(namaFileMenu);

            try {
                File image = new File(namaFileMenu);
                BufferedImage thumbnail = Thumbnails.of(image).size(180, 220).asBufferedImage();

                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(thumbnail, "jpeg", os);
                InputStream is = new ByteArrayInputStream(os.toByteArray());
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];

                for (int readNum; (readNum = is.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }

                menuIcon = new ImageIcon(thumbnail);
                lblImage.setIcon(menuIcon);

                menuImage = bos.toByteArray();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error processing image: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file selected.");
        }
    }//GEN-LAST:event_btnUploadImageActionPerformed

    private void txtImagePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagePathActionPerformed

    }//GEN-LAST:event_txtImagePathActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JMenuItem menu_item_logout;
    private javax.swing.JMenu menu_user;
    private javax.swing.JTable tabel_menu;
    private javax.swing.JTextField txtGarisJudul;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JTextField txtMenu;
    // End of variables declaration//GEN-END:variables
    byte[] menuImage = null;
    private void loadData() {
        // Inisialisasi CRUD Service untuk Menu
        menuCrudService = new MenuCrudServicesDBImpl(new ConnectionManager());
        List<Menu> listMenu = new ArrayList<>();
        listMenu = menuCrudService.findAll();
        Object[][] objectMenu = new Object[listMenu.size()][3];

        int counter = 0;

        // Iterasi data menu dan masukkan ke dalam array
        for (Menu menu : listMenu) {
            objectMenu[counter][0] = menu.getIdMenu();   // ID Menu
            objectMenu[counter][1] = menu.getNamaMenu(); // Nama Menu
            objectMenu[counter][2] = menu.getHargaMenu(); // Harga Menu
            counter++;
        }

        // Atur data ke dalam tabel
        tabel_menu.setModel(new javax.swing.table.DefaultTableModel(
                objectMenu,
                new String[]{
                    "ID Menu", "Nama Menu", "Harga Menu"
                }
        ));
    }

    private void emptyField() {
        txtMenu.setText("");
        txtHarga.setText("");
        txtImagePath.setText("");
        txtMenu.setEditable(true);
        txtHarga.setEditable(true);
        txtImagePath.setEditable(true);
        lblImage.setIcon(null);
    }
}