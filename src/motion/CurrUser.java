/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motion;

import Models.User;
import java.sql.*;
import java.util.prefs.Preferences;

/**
 *
 * @author josep
 */
public class CurrUser extends User {

    static Connection conn = JConnection.connectionDB();
    private static final Preferences prefs = Preferences.userNodeForPackage(CurrUser.class);
    private static int countUsername = 0;
    private static int countEmail = 0;
    private static ResultSet rs = null;
    private static Statement stmt = null;

    @Override
    protected void setId(int user_id) {
        prefs.putInt("user_id", user_id);
        this.user_id = user_id;
    }

    @Override
    protected void setUsername(String username) {
        this.username = username;
    }

    @Override
    protected void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected int getId() {
        return this.user_id;
    }

    @Override
    protected String getUsername() {
        return this.username;
    }

    @Override
    protected String getEmail() {
        return this.email;
    }

    @Override
    protected String getPassword() {
        return this.password;
    }

    public void createUser(String username, String email, String password) {
        try {
            stmt = conn.createStatement();
            String query = "INSERT INTO mgtuser (username, email, password)"
                    + "values ('" + username + "', '" + email + "', '" + password + "')";
            int rowsInserted = stmt.executeUpdate(query);
            this.username = username;
            this.email = email;
            System.out.println(rowsInserted + " rows inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createUser() {
        try {
            stmt = conn.createStatement();
            String query = "INSERT INTO mgtuser (username, email, password)"
                    + "values ('" + this.username + "', '" + this.email + "', '" + this.password + "')";
            int rowsInserted = stmt.executeUpdate(query);
            System.out.println(rowsInserted + " rows inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void login(String username, String password) {
        try {
            stmt = conn.createStatement();
            String query = "SELECT user_id FROM mgtuser WHERE username = '"
                    + username + "' AND password = '" + password + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                this.user_id = rs.getInt(1);
                System.out.println("Logged in userId: " + this.user_id);
            }
            this.username = username;
            saveEmail(password);
            prefs.putInt("user_id", this.user_id);
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void login() {
        try {
            stmt = conn.createStatement();
            String query = "SELECT user_id FROM mgtuser WHERE username = '"
                    + this.username + "' AND password = '" + this.password + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                setId(rs.getInt(1));
                System.out.println("Logged in userId: " + this.user_id);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void saveEmail(String password) {
        try {
            stmt = conn.createStatement();
            String query = "SELECT email FROM mgtuser WHERE username = '"
                    + this.username + "' AND password = '" + password + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                this.email = rs.getString(1);
                System.out.println("Saved email");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveUserInfo(String username, String email) {
        try {
            stmt = conn.createStatement();
            String query = "SELECT user_id FROM mgtuser WHERE username = '"
                    + username + "' AND email = '" + email + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                setId(rs.getInt(1));
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveUserInfo() {
        try {
            stmt = conn.createStatement();
            String query = "SELECT user_id FROM mgtuser WHERE username = '"
                    + this.username + "' AND email = '" + this.email + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                setId(rs.getInt(1));

            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static int checkUserAvail(String username) {
        try {
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM mgtuser WHERE username = '"
                    + username + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                countUsername = rs.getInt(1);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return countUsername;
    }

    public static int checkEmailAvail(String email) {
        try {
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM mgtuser WHERE email = '"
                    + email + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                countEmail = rs.getInt(1);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return countEmail;
    }

    public static int loadUserInfo() {
        return prefs.getInt("user_id", 0);
    }

    public static void deleteCurrUser() {
        prefs.putInt("user_id", 0);
    }
}
