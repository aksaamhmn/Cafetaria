package org.itenas.is.crudproject.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    // Inisialisasi nilai atribut database
    private final String url = "jdbc:mysql://localhost:3306/cafetaria?useSSL=false";
    private final String username = "root";
    private final String password = "Basdat2024";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    // Constructor untuk memuat driver JDBC
    public ConnectionManager() {
        try {
            Class.forName(driver);
            System.out.println("Driver berhasil dimuat.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error saat memuat driver: " + e.getMessage());
        }
    }
    
    // Metode untuk membuka koneksi ke database
    public Connection connectDb() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.err.println("Error saat membuka koneksi: " + e.getMessage());
            return null;
        }
    }

    // Metode untuk menutup koneksi ke database
    public void disconnectDb(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi berhasil ditutup.");
            } catch (SQLException e) {
                System.err.println("Error saat menutup koneksi: " + e.getMessage());
            }
        }
    }
}