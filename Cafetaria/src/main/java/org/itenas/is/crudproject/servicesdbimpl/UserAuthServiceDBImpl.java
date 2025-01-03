package org.itenas.is.crudproject.servicesdbimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.itenas.is.crudproject.dbconfig.ConnectionManager;
import org.itenas.is.crudproject.model.User;
import org.itenas.is.crudproject.services.UserAuthService;

public class UserAuthServiceDBImpl implements UserAuthService {
    private ConnectionManager connMan;

    public UserAuthServiceDBImpl() {
        this.connMan = new ConnectionManager();
    }

    @Override
    public User authenticateUser(User user) {
        User loginUser = null;
        String query = "SELECT username, role FROM users WHERE username = ? AND password = ?";

        try (Connection connection = connMan.connectDb();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String dbUsername = resultSet.getString("username");
                    String role = resultSet.getString("role");
                    loginUser = new User(dbUsername, null, role); 
                }
            }
        } catch (SQLException ex) {
            if (ex.getMessage().toLowerCase().contains("communications link failure")) {
                JOptionPane.showMessageDialog(null, 
                    "Database server is not running! Please start the database server and try again.", 
                    "Database Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.err.println("Database error: " + ex.getMessage());
            }
        }
        return loginUser;
    }

    @Override
    public User registerUser(User user) {
        try {
            if (isUsernameExist(user.getUsername())) {
                JOptionPane.showMessageDialog(null, 
                    "Username already exists! Please choose a different username.", 
                    "Registration Error", JOptionPane.WARNING_MESSAGE);
                return null; 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Database error: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
            return null; 
        }
        
        String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
        User registeredUser = null;

        try (Connection connection = connMan.connectDb();
             PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            // Set parameter values
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getRole());

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                // Retrieve the generated key (if needed)
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int userId = generatedKeys.getInt(1); 
                        JOptionPane.showMessageDialog(null,"User registered successfully!",
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                // Return the registered User object
                registeredUser = new User(user.getUsername(), null, user.getRole());
                JOptionPane.showMessageDialog(null, 
                    "User registered successfully!", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            if (ex.getMessage().toLowerCase().contains("duplicate entry")) {
                JOptionPane.showMessageDialog(null, 
                    "Username already exists! Please choose a different username.", 
                    "Registration Error", JOptionPane.WARNING_MESSAGE);
            } else if (ex.getMessage().toLowerCase().contains("communications link failure")) {
                JOptionPane.showMessageDialog(null, 
                    "Database server is not running! Please start the database server and try again.", 
                    "Database Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.err.println("Database error: " + ex.getMessage());
            }
        }
        return registeredUser;
    }    
    
    private boolean isUsernameExist(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM users WHERE username = ?";
        try (Connection connection = connMan.connectDb();
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, username);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
                }
            }
        }
        return false;
    }
}