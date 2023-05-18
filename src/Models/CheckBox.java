/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.HashMap;

/**
 *
 * @author josep
 */
public class CheckBox {
    protected HashMap<String, Boolean> checkBoxMap = new HashMap();
    protected int projId; 
    
    public void setCheckBoxMap(HashMap<String, Boolean> checkBoxMap){
        this.checkBoxMap = checkBoxMap;
    }
    
    public HashMap<String, Boolean> getCheckBoxMap(){
        return this.checkBoxMap;
    }
    
    public void addCheckBox(String name, boolean status) {
        this.checkBoxMap.put(name, status);
    }
    
    public void setProjectId(int projectId){
        this.projId = projectId;
    }
    
    public int getProjectId(){
        return this.projId;
    }
}
