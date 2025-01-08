package org.itenas.is.crudproject.servicesdbimpl;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.itenas.is.crudproject.dbconfig.ConnectionManager;
import org.itenas.is.crudproject.model.Menu;
import org.itenas.is.crudproject.services.CrudService;

public class MenuCrudServicesDBImpl implements CrudService<Menu> {
    private final ConnectionManager connMan;

    // Constructor to initialize DatabaseConnection
    public MenuCrudServicesDBImpl(ConnectionManager connMan) {
        this.connMan = connMan;
    }

    @Override
    public void create(Menu menu) {
        String query = "INSERT INTO menu (nama_menu, harga_menu) VALUES (?, ?)";
        try (Connection connection = connMan.connectDb()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, menu.getNamaMenu());
            statement.setInt(2, menu.getHargaMenu());
            statement.executeUpdate();
            System.out.println("Data menu berhasil ditambahkan.");
        } catch (SQLException e) {
            System.err.println("Error saat menambahkan data menu: " + e.getMessage());
        }
    }

    @Override
    public Menu findOne(String namaMenu) {
        Menu menu = null;
        String query = "SELECT * FROM menu WHERE INSTR(nama_menu, ?) > 0";
        try (Connection connection = connMan.connectDb();
             PreparedStatement statement = connection.prepareStatement(query)) {
            // Masukkan namaMenu sebagai parameter
            statement.setString(1, namaMenu);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    menu = new Menu(
                        resultSet.getInt("id_menu"),       // ID Menu
                        resultSet.getString("nama_menu"), // Nama Menu
                        resultSet.getInt("harga_menu"),    // Harga Menu
                        resultSet.getString("gambar_menu")    // Gambar Menu
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saat mencari data menu: " + e.getMessage());
        }
        return menu;
    }

    @Override
    public List<Menu> findByNameContaining(String namaMenu) {
        List<Menu> menus = new ArrayList<>();
        String query = "SELECT * FROM menu WHERE LOWER(nama_menu) LIKE LOWER(?)";

        try (Connection connection = connMan.connectDb();
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Masukkan namaMenu sebagai parameter dengan wildcard untuk pencarian
            statement.setString(1, "%" + namaMenu + "%");

            try (ResultSet resultSet = statement.executeQuery()) {
                // Loop melalui hasil dan tambahkan ke daftar menu
                while (resultSet.next()) {
                    Menu menu = new Menu(
                        resultSet.getInt("id_menu"),       // ID Menu
                        resultSet.getString("nama_menu"), // Nama Menu
                        resultSet.getInt("harga_menu"),   // Harga Menu
                        resultSet.getString("gambar_menu") // Gambar Menu
                    );
                    menus.add(menu);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saat mencari data menu: " + e.getMessage());
        }
        return menus;
    }
    
    

    @Override
    public List<Menu> findAll() {
        String query = "SELECT * FROM menu";
        List<Menu> menuList = new ArrayList<>();
        try (Connection connection = connMan.connectDb();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Menu menu = new Menu(
                    resultSet.getInt("id_menu"),
                    resultSet.getString("nama_menu"),
                    resultSet.getInt("harga_menu"),
                    resultSet.getString("gambar_menu")
                );
                menuList.add(menu);
            }
        } catch (SQLException e) {
            System.err.println("Error saat mengambil data menu: " + e.getMessage());
        }
        return menuList;
    }

    @Override
    public void update(int idMenu, Menu menu) {
        String query = "UPDATE menu SET nama_menu = ?, harga_menu = ? WHERE id_menu = ?";
        try (Connection connection = connMan.connectDb()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, menu.getNamaMenu());
            statement.setInt(2, menu.getHargaMenu());
            statement.setInt(3, idMenu);
            statement.executeUpdate();
            System.out.println("Data menu berhasil diperbarui.");
        } catch (SQLException e) {
            System.err.println("Error saat memperbarui data menu: " + e.getMessage());
        }
    }

    @Override
    public boolean delete(int idMenu) {
        String query = "DELETE FROM menu WHERE id_menu = ?";
        try (Connection connection = connMan.connectDb();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idMenu);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error saat menghapus data menu: " + e.getMessage());
            return false;
        }
    }
}