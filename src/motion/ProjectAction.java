/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motion;

import Models.Project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static motion.CurrUser.conn;

/**
 *
 * @author josep
 */
public class ProjectAction extends Project {

    private static ResultSet rs = null;
    private static Statement stmt = null;
    private static int countProject = 0;
    
    @Override
    public void setProjId(int id) {
        this.project_id = id;
    }

    public static void createProject(int owner_id, String title, String type, int priority, String deadline, String status) {
        try {
            stmt = conn.createStatement();
            LocalDate currentDate = LocalDate.now();

            // format the date to the desired format
            DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String made_on = currentDate.format(date_formatter);

            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter time_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            made_on = made_on.concat(" " + currentTime.format(time_formatter));

            String query = "INSERT INTO project (owner_id, proj_title, proj_type, priority, deadline, made_on, status) "
                    + "values ('" + owner_id + "', '" + title + "', '" + type + "', '" + priority + "', '" + deadline + "', '" + made_on + "', '" + status + "');";

            int rowsInserted = stmt.executeUpdate(query);
            System.out.println(rowsInserted + " rows inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static int checkDuplicateProject(int owner_id, String title) {
        try {
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM project WHERE owner_id ="
                    + owner_id + " AND proj_title = '" + title + "';";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                countProject = rs.getInt(1);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return countProject;
    }
    
    public static void updateProject(int proj_id, String title, String type, int priority, String deadline, String status) {
        try {
            stmt = conn.createStatement();

            String query = "UPDATE project SET proj_title='" + title + 
                    "', proj_type = '" + type + "', priority= '" + priority + 
                    "', deadline = '" + deadline + "', status = '" + status + "' WHERE proj_id =" + proj_id + ";";

            int rowsInserted = stmt.executeUpdate(query);
            System.out.println(rowsInserted + " rows inserted.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
   
    
    public static ArrayList<Project> getUserProject(int owner_id){
        ArrayList<Project> projects = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            String query = "SELECT * FROM project WHERE owner_id = "
                    + owner_id + ";";
            rs = stmt.executeQuery(query);            
            
            while (rs.next()) {
                Project project = new Project();
                project.setProjId(rs.getInt("proj_id"));
                project.setProjectTitle(rs.getString("proj_title"));
                project.setOwnerId(rs.getInt("owner_id"));
                project.setPriority(rs.getInt("priority"));
                project.setDeadline(rs.getTimestamp("deadline").toLocalDateTime());
                project.setMadeOn(rs.getTimestamp("made_on").toLocalDateTime());
                project.setType(rs.getString("proj_type"));
                project.setStatus(rs.getString("status"));
                projects.add(project);
            }   
            
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return projects;
    }
    
    public static ArrayList<Project> getFilteredProject(int owner_id, String status){
        ArrayList<Project> projects = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            String query = "SELECT * FROM project WHERE owner_id = "
                    + owner_id + " AND status = '" + status + "';";
            rs = stmt.executeQuery(query);            
            
            while (rs.next()) {
                Project project = new Project();
                project.setProjId(rs.getInt("proj_id"));
                project.setProjectTitle(rs.getString("proj_title"));
                project.setOwnerId(rs.getInt("owner_id"));
                project.setPriority(rs.getInt("priority"));
                project.setDeadline(rs.getTimestamp("deadline").toLocalDateTime());
                project.setMadeOn(rs.getTimestamp("made_on").toLocalDateTime());
                project.setType(rs.getString("proj_type"));
                project.setStatus(rs.getString("status"));
                projects.add(project);
            }   
            
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return projects;
    }
    
    public static ArrayList<Project> getFilteredProject(int owner_id, String status1, String status2){
        ArrayList<Project> projects = new ArrayList<>();
        try {
            //Initiate connection
            stmt = conn.createStatement();
            
            /*SELECT query*/
            String query = "SELECT * FROM project WHERE owner_id = "
                    + owner_id + " AND status IN ('" + status1 + "', '" + status2 + "');";
            
            //Execute query
            rs = stmt.executeQuery(query);            
            
            //Iterate through query results
            while (rs.next()) {
                //Create and input all data to the instance of Project
                Project project = new Project();
                project.setProjId(rs.getInt("proj_id"));
                project.setProjectTitle(rs.getString("proj_title"));
                project.setOwnerId(rs.getInt("owner_id"));
                project.setPriority(rs.getInt("priority"));
                project.setDeadline(rs.getTimestamp("deadline").toLocalDateTime());
                project.setMadeOn(rs.getTimestamp("made_on").toLocalDateTime());
                project.setType(rs.getString("proj_type"));
                project.setStatus(rs.getString("status"));
                //Add the modified project instance to the initiated array of Project
                projects.add(project);
            }   
            
            //Close connection
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return projects;
    }
    
    public static void deleteProj(int proj_id){
        try {
            stmt = conn.createStatement();
            String query = "DELETE FROM project WHERE proj_id = " + proj_id + ";";
            stmt.executeUpdate(query);
            System.out.println("Project " + proj_id + " deleted successfully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteProj(){
        try {
            stmt = conn.createStatement();
            String query = "DELETE FROM project WHERE proj_id = " + this.project_id + ";";
            stmt.executeUpdate(query);
            System.out.println("Project " + this.project_id + " deleted successfully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updateStatus(int projId, String status) {
        try{
            stmt = conn.createStatement();
            String query = "UPDATE project SET status= '" + status + "' WHERE proj_id =" + projId + ";";

            int rowsInserted = stmt.executeUpdate(query);
            System.out.println(rowsInserted + " rows updated.");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static int getIdFromDb(String proj_title, int owner_id){
        int projId = 0;
        try {
            stmt = conn.createStatement();
            String query = "SELECT proj_id FROM project WHERE proj_title= '"
                    + proj_title + "' AND owner_id = " + owner_id + ";";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                projId = rs.getInt(1); 
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return projId;
    }
}
