/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motion;

import Models.CheckBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import static motion.CurrUser.conn;

/**
 *
 * @author josep
 */
public class CheckBoxAction extends CheckBox {

    private static ResultSet rs = null;
    private static Statement stmt = null;
    private int doneCount = 0;
    private int allCount = 0;

    public static void createCheckBox(int projectId, HashMap<String, Boolean> checkBoxMap) {
        try {
            stmt = conn.createStatement();
            int rowsInserted = 0;
            for (Map.Entry<String, Boolean> entry : checkBoxMap.entrySet()) {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                String query = "INSERT INTO checkBox (proj_id, name, status) "
                        + "values ('" + projectId + "', '" + key + "', " + value + ");";
                rowsInserted += stmt.executeUpdate(query);

            }
            System.out.println(rowsInserted + " checkboxes inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createCheckBox() {
        try {
            stmt = conn.createStatement();
            int rowsInserted = 0;
            for (Map.Entry<String, Boolean> entry : this.checkBoxMap.entrySet()) {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                String query = "INSERT INTO checkBox (proj_id, name, status) "
                        + "values ('" + this.projId + "', '" + key + "', " + value + ");";
                rowsInserted += stmt.executeUpdate(query);

            }
            System.out.println(rowsInserted + " checkboxes inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void createCheckBox(int projectId, String name, boolean status) {
        try {
            stmt = conn.createStatement();
            String query = "INSERT INTO checkBox (proj_id, name, status) "
                    + "values ('" + projectId + "', '" + name + "', " + status + ");";
            int rowsInserted = stmt.executeUpdate(query);

            System.out.println(rowsInserted + " checkboxes inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createCheckBox(String name, boolean status) {
        try {
            stmt = conn.createStatement();
            String query = "INSERT INTO checkBox (proj_id, name, status) "
                    + "values ('" + this.projId + "', '" + name + "', " + status + ");";
            int rowsInserted = stmt.executeUpdate(query);

            System.out.println(rowsInserted + " checkboxes inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void updateCheckBox(int projectId, HashMap<String, Boolean> checkBoxMap) {
        try {
            stmt = conn.createStatement();
            int rowsInserted = 0;
            for (Map.Entry<String, Boolean> entry : checkBoxMap.entrySet()) {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                String query = "UPDATE checkBox SET status = " + value + " WHERE proj_id = " + projectId + " AND name = '" + key + "';";
                rowsInserted += stmt.executeUpdate(query);
            }
            System.out.println(rowsInserted + " checkboxes updated.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateCheckBox() {
        try {
            stmt = conn.createStatement();
            int rowsInserted = 0;
            for (Map.Entry<String, Boolean> entry : this.checkBoxMap.entrySet()) {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                String query = "UPDATE checkBox SET status = " + value + " WHERE proj_id = " + this.projId + " AND name = '" + key + "';";
                rowsInserted += stmt.executeUpdate(query);
            }
            System.out.println(rowsInserted + " checkboxes updated.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateCheckBox(String name, boolean status) {
        try {
            stmt = conn.createStatement();
            String query = "UPDATE checkBox SET status = " + status + " WHERE proj_id = " + this.projId + " AND name = '" + name + "';";
            int rowsInserted = stmt.executeUpdate(query);

            System.out.println(rowsInserted + " checkboxes inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static HashMap<String, Boolean> getCheckBoxes(int projectId) {
        HashMap<String, Boolean> checkBoxes = new HashMap();
        try {
            stmt = conn.createStatement();
            String query = "SELECT * FROM checkbox WHERE proj_id = "
                    + projectId + ";";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                checkBoxes.put(rs.getString("name"), rs.getBoolean("status"));
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return checkBoxes;
    }

    public void getCheckBoxes() {
        HashMap<String, Boolean> checkBoxes = new HashMap();
        try {
            stmt = conn.createStatement();
            String query = "SELECT * FROM checkbox WHERE proj_id = "
                    + this.projId + ";";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                checkBoxes.put(rs.getString("name"), rs.getBoolean("status"));
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.checkBoxMap = checkBoxes;
    }
    
    public void deleteCheckBox(String name){
        try {
            stmt = conn.createStatement();
            String query = "DELETE FROM checkBox WHERE proj_id = " + this.projId + " AND name = '" + name + "';";
            int rowsInserted = stmt.executeUpdate(query);

            System.out.println(rowsInserted + " checkboxes deleted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int countDoneCheckBoxes(){
        try {
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM checkbox WHERE proj_id = "
                    + this.projId + " AND status = " + true + ";";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                doneCount = rs.getInt(1);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return doneCount;
    }
    
    public int countAllCheckBoxes(){
        try {
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM checkbox WHERE proj_id = "
                    + this.projId + ";";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                allCount = rs.getInt(1);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return allCount;
    }

    public void compareCheckBoxes(HashMap<String, Boolean> checkBoxMap) {
        for (String key : checkBoxMap.keySet()) {
            if (!this.checkBoxMap.containsKey(key)) {
                createCheckBox(key, checkBoxMap.get(key));
            } else if (!checkBoxMap.get(key).equals(this.checkBoxMap.get(key))) {
                updateCheckBox(key, checkBoxMap.get(key));
            }
        }
        
        for (String key : this.checkBoxMap.keySet()) {
            if (!checkBoxMap.containsKey(key)) {
                deleteCheckBox(key);
            } 
        }
    }
}
