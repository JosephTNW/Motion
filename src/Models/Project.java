/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;

/**
 *
 * @author josep
 */
public class Project {

    protected int project_id;
    protected int owner_id;
    protected String proj_title;
    protected String status;
    protected String projType;
    protected int priority;
    protected LocalDateTime deadline;
    protected LocalDateTime madeOn;
    
    
    public void setProjId(int id) {
        this.project_id = id;
    }

    public void setProjectTitle(String title) {
        this.proj_title = title;
    }

    public void setOwnerId(int id) {
        this.owner_id = id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
    
    public void setMadeOn(LocalDateTime madeOn) {
        this.madeOn = madeOn;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setType(String projType){
        this.projType = projType;
    }
    
    public int getId(){
        return this.project_id;
    }
    
    public String getTitle(){
        return this.proj_title;
    }
    
    public int getOwnerId(){
        return this.owner_id;
    }
    
    public int getPriority(){
        return this.priority;
    }
    
    public LocalDateTime getDeadline(){
        return this.deadline;
    }
    
    public LocalDateTime getMadeOn(){
        return this.madeOn;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public String getType() {
        return this.projType;
    }
    
}
