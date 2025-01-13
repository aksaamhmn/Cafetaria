package org.itenas.is.crudproject.viewdbswing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.coobird.thumbnailator.Thumbnails;
import org.itenas.is.crudproject.dbconfig.ConnectionManager;
import org.itenas.is.crudproject.model.User;
import org.itenas.is.crudproject.model.Menu;
import org.itenas.is.crudproject.model.Penjualan;
import org.itenas.is.crudproject.services.CrudService;
import org.itenas.is.crudproject.servicesdbimpl.MenuCrudServicesDBImpl;
import org.itenas.is.crudproject.servicesdbimpl.PenjualanCrudServicesDBImpl;

/**
 *
 * @author userr
 */
public class FormKasir extends javax.swing.JFrame {
    private final User user;
    private CrudService<Menu> menuCrudService;


    public FormKasir(User user) {
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        showdataitem();
        noFaktur();
        tampilTanggal();
        menuUser.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        item = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        tbl_menu = new javax.swing.JScrollPane();
        menu_user = new javax.swing.JTable();
        transaksi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtMenu = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCash = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblFaktur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(197, 112, 93));

        item.setBackground(new java.awt.Color(197, 112, 93));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Cari Menu");

        txtCari.setBackground(new java.awt.Color(197, 112, 93));
        txtCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCari.setForeground(new java.awt.Color(245, 245, 245));
        txtCari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        tbl_menu.setBackground(new java.awt.Color(248, 237, 227));
        tbl_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu_user.setBackground(new java.awt.Color(248, 237, 227));
        menu_user.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menu_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Menu", "Nama Menu", "Harga Menu", "Gambar Menu"
            }
        ));
        menu_user.setGridColor(new java.awt.Color(153, 153, 153));
        menu_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_userMouseClicked(evt);
            }
        });
        tbl_menu.setViewportView(menu_user);

        javax.swing.GroupLayout itemLayout = new javax.swing.GroupLayout(item);
        item.setLayout(itemLayout);
        itemLayout.setHorizontalGroup(
            itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addGroup(itemLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari)))
                .addContainerGap())
        );
        itemLayout.setVerticalGroup(
            itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbl_menu)
                .addContainerGap())
        );

        transaksi.setBackground(new java.awt.Color(197, 112, 93));

        jPanel1.setBackground(new java.awt.Color(197, 112, 93));

        txtMenu.setEditable(false);
        txtMenu.setBackground(new java.awt.Color(197, 112, 93));
        txtMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMenu.setForeground(new java.awt.Color(245, 245, 245));
        txtMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuActionPerformed(evt);
            }
        });
        txtMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMenuKeyReleased(evt);
            }
        });

        txtHarga.setEditable(false);
        txtHarga.setBackground(new java.awt.Color(197, 112, 93));
        txtHarga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(245, 245, 245));
        txtHarga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        btnAdd.setBackground(new java.awt.Color(208, 184, 168));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(153, 153, 153));
        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(208, 184, 168));
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(153, 153, 153));
        btnReset.setText("clear");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtQty.setBackground(new java.awt.Color(197, 112, 93));
        txtQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQty.setForeground(new java.awt.Color(245, 245, 245));
        txtQty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Nama Menu");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("Harga Menu");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 245, 245));
        jLabel9.setText("Satuan");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 245, 245));
        jLabel10.setText("KASIR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnReset)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBackground(new java.awt.Color(248, 237, 227));
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tabelTransaksi.setBackground(new java.awt.Color(248, 237, 227));
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Faktur", "Tanggal", "Menu", "Quantity", "Harga", "Jumlah"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelTransaksi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(197, 112, 93));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Total Bayar");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(197, 112, 93));
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(245, 245, 245));
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtCash.setBackground(new java.awt.Color(197, 112, 93));
        txtCash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCash.setForeground(new java.awt.Color(245, 245, 245));
        txtCash.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCashKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Cash");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Kembali");

        txtKembali.setEditable(false);
        txtKembali.setBackground(new java.awt.Color(197, 112, 93));
        txtKembali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtKembali.setForeground(new java.awt.Color(245, 245, 245));
        txtKembali.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembaliActionPerformed(evt);
            }
        });

        btnBayar.setBackground(new java.awt.Color(208, 184, 168));
        btnBayar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(153, 153, 153));
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(txtCash)
                .addComponent(txtTotal)
                .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(197, 112, 93));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("No Faktur");

        lblFaktur.setBackground(new java.awt.Color(255, 255, 255));
        lblFaktur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFaktur.setForeground(new java.awt.Color(245, 245, 245));
        lblFaktur.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("Tanggal");

        lblTanggal.setBackground(new java.awt.Color(255, 255, 255));
        lblTanggal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTanggal.setForeground(new java.awt.Color(245, 245, 245));
        lblTanggal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFaktur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFaktur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout transaksiLayout = new javax.swing.GroupLayout(transaksi);
        transaksi.setLayout(transaksiLayout);
        transaksiLayout.setHorizontalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(transaksiLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(transaksiLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        transaksiLayout.setVerticalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
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
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        String namaMenu = txtCari.getText().trim();
        DefaultTableModel model = (DefaultTableModel) menu_user.getModel();

        // Reset tabel
        model.setRowCount(0);

        if (namaMenu.isEmpty()) {
                // Jika kotak pencarian kosong, tampilkan semua menu
                List<Menu> listMenu = menuCrudService.findAll();
                for (Menu menu : listMenu) {
                    Object[] rowData = getMenuRowData(menu);
                    model.addRow(rowData);
                }
            } else {
                // Jika ada input pencarian, cari menu yang mengandung teks pencarian
                List<Menu> matchedMenus = menuCrudService.findByNameContaining(namaMenu);

                if (!matchedMenus.isEmpty()) {
                    for (Menu menu : matchedMenus) {
                        Object[] rowData = getMenuRowData(menu);
                        model.addRow(rowData);
                    }
                } else {
                    System.out.println("Tidak ada menu yang cocok dengan pencarian: " + namaMenu);
                }
            }

        // Refresh tabel
        menu_user.revalidate();
        menu_user.repaint();
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void menu_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_userMouseClicked
        DefaultTableModel model = (DefaultTableModel)menu_user.getModel();
        int SelectedRow = menu_user.getSelectedRow();
        String menu = model.getValueAt(SelectedRow, 1).toString();
        String harga = model.getValueAt(SelectedRow, 2).toString();
        int qty = 1;
        
        int confirmDialog = JOptionPane.showConfirmDialog(null, String.valueOf(menu),"Pilih Menu", JOptionPane.YES_NO_OPTION);
        if(confirmDialog == 0){
            txtMenu.setText(menu);
            txtHarga.setText(String.valueOf(harga));
            txtQty.setText(String.valueOf(qty));
            txtQty.requestFocus();
            txtCari.setText("");
            showdataitem();
        }else{
            txtCari.setText("");
            showdataitem();
        }
    }//GEN-LAST:event_menu_userMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelTransaksi.getModel();

        if (txtMenu.getText().trim().isEmpty() || txtHarga.getText().trim().isEmpty() || txtQty.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan menu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String noFaktur = lblFaktur.getText();
                String tanggal = lblTanggal.getText();
                String menu = txtMenu.getText();
                int qty = Integer.parseInt(txtQty.getText().trim());
                int harga= Integer.parseInt(txtHarga.getText().trim());
                int jumlah = (int) (qty * harga);

                Object[] RowData = {noFaktur, tanggal, menu, qty, String.valueOf(harga), String.valueOf(jumlah)};
                model.addRow(RowData);
                HitungTotal();
                txtMenu.setText("");
                txtHarga.setText("");
                txtQty.setText("");
                txtCari.setText("");
                txtCari.requestFocus();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Input jumlah atau harga tidak valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        HitungTotal();
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuActionPerformed

    private void txtMenuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenuKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuKeyReleased

    private void txtCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyTyped
        char validasiAngka = evt.getKeyChar();
        if(!Character.isDigit(validasiAngka)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCashKeyTyped

    private void txtCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyReleased
        try {
            // Validasi input
            if (txtCash.getText().trim().isEmpty() || txtTotal.getText().trim().isEmpty()) {
                txtKembali.setText("");
                return;
            }

            // Hilangkan format angka sebelum parsing
            String cashText = txtCash.getText().trim().replaceAll(",", "");
            String totalText = txtTotal.getText().trim().replaceAll(",", "");

            // Parsing angka
            int cash = Integer.parseInt(cashText);
            int totalBayar = Integer.parseInt(totalText);

            // Hitung kembalian
            int hasil = cash - totalBayar;
            txtKembali.setText(cash >= totalBayar ? String.valueOf(hasil) : "");
        } catch (NumberFormatException e) {
            txtKembali.setText(""); // Reset jika input tidak valid
        }
    }//GEN-LAST:event_txtCashKeyReleased

    private void txtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        if (txtKembali.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, transaksi belum valid!", "Validasi", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DefaultTableModel model = (DefaultTableModel) tabelTransaksi.getModel();
                PenjualanCrudServicesDBImpl penjualanService = new PenjualanCrudServicesDBImpl(new ConnectionManager());

                for (int i = 0; i < tabelTransaksi.getRowCount(); i++) {
                    // Ambil data dari tabel
                    String noFaktur = model.getValueAt(i, 0).toString();
                    String tanggal = model.getValueAt(i, 1).toString();
                    String item = model.getValueAt(i, 2).toString();
                    String qty = model.getValueAt(i, 3).toString();
                    String harga = model.getValueAt(i, 4).toString();
                    String jumlah = model.getValueAt(i, 5).toString();

                    // Buat objek Penjualan dan simpan melalui layanan
                    Penjualan penjualan = new Penjualan(noFaktur, tanggal, item, qty, harga, jumlah);
                    penjualanService.create(penjualan);
                }

                JOptionPane.showMessageDialog(this, "Transaksi berhasil", "Penjualan", JOptionPane.INFORMATION_MESSAGE);
                reset();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
            }

            noFaktur();
        }

    }//GEN-LAST:event_btnBayarActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
       DefaultTableModel model = (DefaultTableModel)tabelTransaksi.getModel();
       int selectedRow = tabelTransaksi.getSelectedRow();
       if(selectedRow != -1){
           int rowIndexModel = tabelTransaksi.convertRowIndexToModel(selectedRow);
           model.removeRow(rowIndexModel);
       }
       HitungTotal();
    }//GEN-LAST:event_tabelTransaksiMouseClicked

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

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnReset;
    private javax.swing.JPanel item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFaktur;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenu menuUser;
    private javax.swing.JTable menu_user;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JScrollPane tbl_menu;
    private javax.swing.JPanel transaksi;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtMenu;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void showdataitem() {
        DefaultTableModel model = (DefaultTableModel) menu_user.getModel();
        model.setRowCount(0);
        String cariMenu = txtCari.getText();

        // Inisialisasi CRUD Service untuk Menu
        menuCrudService = new MenuCrudServicesDBImpl(new ConnectionManager());
        List<Menu> listMenu = new ArrayList<>();
        listMenu = menuCrudService.findAll();
        Object[][] objectMenu = new Object[listMenu.size()][4]; // Tambahkan kolom ke-4 untuk gambar

        int counter = 0;

        // Iterasi data menu dan masukkan ke dalam array
        for (Menu menu : listMenu) {
            objectMenu[counter][0] = menu.getIdMenu();    // ID Menu
            objectMenu[counter][1] = menu.getNamaMenu();  // Nama Menu
            objectMenu[counter][2] = menu.getHargaMenu(); // Harga Menu
            objectMenu[counter][3] = menu.getGambarMenu(); // Harga Menu
            

            // Menambahkan gambar dengan ukuran lebih besar
            try {
                String formattedNamaMenu = menu.getNamaMenu().replace(" ", "_");
                File imageFile = new File("src/main/java/org/itenas/is/crudproject/images/" + formattedNamaMenu + ".jpeg");

                if (imageFile.exists()) {
                    // Ukuran gambar diperbesar
                    ImageIcon icon = new ImageIcon(new ImageIcon(imageFile.getPath()).getImage()
                            .getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)); 
                    objectMenu[counter][3] = icon;
                } else {
                    objectMenu[counter][3] = "Tidak Ada Gambar";
                }
            } catch (Exception e) {
                e.printStackTrace();
                objectMenu[counter][3] = "Error";
            }

            counter++;
        }

        // Mengatur data pada tabel dan menambahkan kolom gambar
        menu_user.setModel(new javax.swing.table.DefaultTableModel(
                objectMenu,
                new String[]{
                    "ID Menu", "Nama Menu", "Harga Menu", "Gambar Menu"
                }
        ));

        // Mengatur ukuran kolom agar menyesuaikan dengan gambar
        menu_user.setRowHeight(150); // Menyesuaikan tinggi baris dengan ukuran gambar
        menu_user.getColumnModel().getColumn(0).setPreferredWidth(70);
        menu_user.getColumnModel().getColumn(1).setPreferredWidth(110);
        menu_user.getColumnModel().getColumn(2).setPreferredWidth(105);
        menu_user.getColumnModel().getColumn(3).setPreferredWidth(200); // Menyesuaikan lebar kolom gambar

        // Renderer untuk menampilkan gambar dengan proporsional di dalam tabel
        menu_user.getColumnModel().getColumn(3).setCellRenderer(new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                if (value instanceof ImageIcon) {
                    setIcon((ImageIcon) value);
                    setText(""); // Menghapus teks jika ada gambar
                } else {
                    setIcon(null);
                    setText(value.toString()); // Tampilkan teks jika gambar tidak ditemukan
                }
            }
        });
    }
    
    private void HitungTotal(){
        int total = 0;
        for(int i=0; i<tabelTransaksi.getRowCount(); i++){
            total += Integer.parseInt(tabelTransaksi.getValueAt(i, 5).toString());
        }
        txtTotal.setText(String.valueOf(total));
    }
    
    private void noFaktur(){
        PenjualanCrudServicesDBImpl penjualanServices = new PenjualanCrudServicesDBImpl(new ConnectionManager());
        String noFaktur = penjualanServices.generateNoFaktur();
        lblFaktur.setText(noFaktur);
    }
    
    private void tampilTanggal(){
        java.util.Date tgl = new java.util.Date();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        
        String tanggalSekarang = formatTanggal.format(tgl);
        lblTanggal.setText(tanggalSekarang);
    }
    
    private void reset(){
        DefaultTableModel model = (DefaultTableModel)tabelTransaksi.getModel();
        model.setRowCount(0);
        txtMenu.setText("");
        txtHarga.setText("");
        txtQty.setText("");
        txtTotal.setText("");
        txtCash.setText("");
        txtKembali.setText("");
    }
    
    private Object[] getMenuRowData(Menu menu) {
        String gambarMenuPath = "/org/itenas/is/crudproject/images/" 
            + menu.getNamaMenu().replace(" ", "_") + ".jpeg";

        ImageIcon gambarIcon = null;

        try {
            // Load gambar dari resource di dalam package
            InputStream is = getClass().getResourceAsStream(gambarMenuPath);
            if (is != null) {
                BufferedImage image = ImageIO.read(is);
                if (image != null) {
                    // Resize image jika diperlukan
                    BufferedImage resizedImage = Thumbnails.of(image)
                        .size(150, 110)
                        .asBufferedImage();
                    gambarIcon = new ImageIcon(resizedImage);
                }
            } else {
                System.out.println("Gambar tidak ditemukan: " + gambarMenuPath);
            }
        } catch (IOException ex) {
            System.out.println("Gagal memuat gambar: " + ex.getMessage());
        }

        // Kembalikan data baris untuk ditambahkan ke tabel
        return new Object[]{
            menu.getIdMenu(), 
            menu.getNamaMenu(), 
            menu.getHargaMenu(), 
            gambarIcon != null ? gambarIcon : "Gambar Tidak Ada" // Jika gambar gagal dimuat
        };
    }
}