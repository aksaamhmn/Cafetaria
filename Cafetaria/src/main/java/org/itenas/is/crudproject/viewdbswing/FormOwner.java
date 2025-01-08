package org.itenas.is.crudproject.viewdbswing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.itenas.is.crudproject.dbconfig.ConnectionManager;
import org.itenas.is.crudproject.model.User;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import java.io.File;
import javax.swing.JFileChooser;

public class FormOwner extends javax.swing.JFrame {
    public PreparedStatement ps;
    public ResultSet rs;
    Connection conn = new ConnectionManager().connectDb();
    private final User user;
    
    public FormOwner(User user) {
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
        txtJumlahTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPendapatan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        txtJudul = new javax.swing.JLabel();
        txtGarisJudul = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_user = new javax.swing.JMenu();
        menu_item_logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 112, 93));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Jumlah Transaksi");

        txtJumlahTransaksi.setEditable(false);
        txtJumlahTransaksi.setBackground(new java.awt.Color(197, 112, 93));
        txtJumlahTransaksi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtJumlahTransaksi.setForeground(new java.awt.Color(245, 245, 245));
        txtJumlahTransaksi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtJumlahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahTransaksiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Total Pendapatan");

        txtTotalPendapatan.setEditable(false);
        txtTotalPendapatan.setBackground(new java.awt.Color(197, 112, 93));
        txtTotalPendapatan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTotalPendapatan.setForeground(new java.awt.Color(245, 245, 245));
        txtTotalPendapatan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTotalPendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPendapatanActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(248, 237, 227));

        tabelTransaksi.setBackground(new java.awt.Color(248, 237, 227));
        tabelTransaksi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No Faktur", "Tanggal", "Item", "Qty", "Harga", "Jumlah"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        btnClear.setBackground(new java.awt.Color(208, 184, 168));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 153, 153));
        btnClear.setText("cetak laporan");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtJudul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtJudul.setForeground(new java.awt.Color(245, 245, 245));
        txtJudul.setText("HALAMAN OWNER");

        txtGarisJudul.setBackground(new java.awt.Color(197, 112, 93));
        txtGarisJudul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtGarisJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarisJudulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtJudul)
                .addGap(265, 265, 265))
            .addComponent(txtGarisJudul)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJumlahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGarisJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
    int confirm = JOptionPane.showConfirmDialog(FormOwner.this, 
            "Are you sure you want to logout?", "Logout Confirmation",
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        user.setRole(null); // Clear user role
        user.setUsername(null); // Clear username
        JOptionPane.showMessageDialog(FormOwner.this, "You have been logged out.");
        dispose(); // Close AdminDashboard
        new FormLogin().setVisible(true); // Open Login Form
    }

    }//GEN-LAST:event_menu_item_logoutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        downloadPDF();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        int i = tabelTransaksi.getSelectedRow();
        if (i >= 0) {
            TableModel model = tabelTransaksi.getModel();
            txtJumlahTransaksi.setText(model.getValueAt(i, 1).toString());
            txtTotalPendapatan.setText(model.getValueAt(i, 2).toString());
        }
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void txtTotalPendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPendapatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPendapatanActionPerformed

    private void txtJumlahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahTransaksiActionPerformed

    private void txtGarisJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarisJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarisJudulActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_item_logout;
    private javax.swing.JMenu menu_user;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField txtGarisJudul;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JTextField txtJumlahTransaksi;
    private javax.swing.JTextField txtTotalPendapatan;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        DefaultTableModel model = (DefaultTableModel)tabelTransaksi.getModel();
        model.setRowCount(0);
        try {
            String sql = "SELECT * FROM penjualan";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()){
                String noFaktur = rs.getString("no_faktur");
                String tanggal = rs.getString("tanggal");
                String item = rs.getString("item");
                String qty = rs.getString("qty");
                String harga = rs.getString("harga");
                String jumlah = rs.getString("jumlah");
                
                
                Object[] RowData ={noFaktur, tanggal, item, qty, harga, jumlah};
                model.addRow(RowData);
            }
            HitungTotal();
            HitungJumlahTransaksi();
        } catch (Exception e) {
        }
    }
    
    private void HitungTotal(){
        int total = 0;
        for(int i=0; i<tabelTransaksi.getRowCount(); i++){
            total += Integer.parseInt(tabelTransaksi.getValueAt(i, 5).toString());
        }
        txtTotalPendapatan.setText(String.valueOf(total));
    }
    private void HitungJumlahTransaksi() {
        int jumlahTransaksi = tabelTransaksi.getRowCount();
        txtJumlahTransaksi.setText(String.valueOf(jumlahTransaksi));
    }

    private void downloadPDF() {
       // Gunakan JFileChooser untuk memilih lokasi penyimpanan
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.setDialogTitle("Simpan Laporan PDF");
       int userSelection = fileChooser.showSaveDialog(null); // Gunakan `null` untuk default parent

       if (userSelection == JFileChooser.APPROVE_OPTION) {
           String pdfPath = fileChooser.getSelectedFile().getAbsolutePath();
           try {
               // Buat writer dan dokumen PDF
               PdfWriter writer = new PdfWriter(pdfPath);
               PdfDocument pdfDoc = new PdfDocument(writer);
               Document document = new Document(pdfDoc);

               // Tambahkan judul
               document.add(new Paragraph("Laporan Penjualan").setBold().setFontSize(16));
               document.add(new Paragraph(" ")); // Tambahkan spasi

               // Buat tabel PDF
               float[] columnWidths = {100f, 100f, 100f, 50f, 100f, 100f};
               Table table = new Table(columnWidths);

               // Menambahkan header tabel
               table.addCell(new Cell().add(new Paragraph("No Faktur").setBold()));
               table.addCell(new Cell().add(new Paragraph("Tanggal").setBold()));
               table.addCell(new Cell().add(new Paragraph("Item").setBold()));
               table.addCell(new Cell().add(new Paragraph("Qty").setBold()));
               table.addCell(new Cell().add(new Paragraph("Harga").setBold()));
               table.addCell(new Cell().add(new Paragraph("Jumlah").setBold()));

               // Data tabel
               DefaultTableModel model = (DefaultTableModel) tabelTransaksi.getModel();
               int totalPendapatan = 0; // Total pendapatan (Jumlah)
               int totalPembelian = 0; // Total pembelian (Qty * Harga)

               for (int i = 0; i < model.getRowCount(); i++) {
                   int qty = Integer.parseInt(model.getValueAt(i, 3).toString());
                   int harga = Integer.parseInt(model.getValueAt(i, 4).toString());
                   int jumlah = Integer.parseInt(model.getValueAt(i, 5).toString());

                   // Tambahkan data baris ke tabel
                   table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 0).toString()))); // No Faktur
                   table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 1).toString()))); // Tanggal
                   table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 2).toString()))); // Item
                   table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 3).toString()))); // Qty
                   table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 4).toString()))); // Harga
                   table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 5).toString()))); // Jumlah

                   // Tambahkan ke total
                   totalPendapatan += jumlah;
                   totalPembelian ++;
               }

               // Tambahkan tabel ke dokumen
               document.add(table);

               // Tambahkan Total Pendapatan dan Total Pembelian ke bawah tabel
               document.add(new Paragraph("Total Pendapatan: Rp." + totalPendapatan));
               document.add(new Paragraph("Total Pembelian: " + totalPembelian + " Item"));

               // Tutup dokumen
               document.close();

               // Tampilkan pesan sukses
               System.out.println("PDF berhasil dibuat di: " + pdfPath);
           } catch (Exception e) {
               e.printStackTrace();
           }
       } else {
           System.out.println("Proses penyimpanan dibatalkan.");
       }
   }
   

    
    
}