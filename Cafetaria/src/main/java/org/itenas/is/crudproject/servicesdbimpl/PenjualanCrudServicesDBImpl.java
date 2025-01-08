package org.itenas.is.crudproject.servicesdbimpl;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.itenas.is.crudproject.dbconfig.ConnectionManager;
import org.itenas.is.crudproject.model.Penjualan;
import org.itenas.is.crudproject.services.CrudService;

public class PenjualanCrudServicesDBImpl implements CrudService<Penjualan> {
    private final ConnectionManager connMan;

    // Constructor to initialize DatabaseConnection
    public PenjualanCrudServicesDBImpl(ConnectionManager connMan) {
        this.connMan = connMan;
    }

    @Override
    public void create(Penjualan penjualan) {
        String query = "INSERT INTO penjualan (no_faktur, tanggal, item, qty, harga, jumlah) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = connMan.connectDb()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, penjualan.getNoFaktur());
            statement.setString(2, penjualan.getTanggal());
            statement.setString(3, penjualan.getItem());
            statement.setString(4, penjualan.getQty());
            statement.setString(5, penjualan.getHarga());
            statement.setString(6, penjualan.getJumlah());
            statement.executeUpdate();
            System.out.println("Data penjualan berhasil ditambahkan.");
        } catch (SQLException e) {
            System.err.println("Error saat menambahkan data penjualan: " + e.getMessage());
        }
    }
    
    public String generateNoFaktur() {
        String noFaktur = "INV00001"; // Default faktur jika tidak ada data
        String sql = "SELECT MAX(no_faktur) FROM penjualan";
        try (Connection connection = connMan.connectDb();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next() && rs.getString(1) != null) {
                long invAngka = Long.parseLong(rs.getString(1).substring(3));
                invAngka++;
                noFaktur = "INV" + String.format("%05d", invAngka);
            }
        } catch (SQLException e) {
            System.err.println("Error saat menghasilkan nomor faktur: " + e.getMessage());
        }
        return noFaktur;
    }

    @Override
    public Penjualan findOne(String namaMenu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Penjualan> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int idMenu, Penjualan object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idMenu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Penjualan> findByNameContaining(String namaMenu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    
}