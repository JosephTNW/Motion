/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author josep
 */
public class User {
    
    protected int user_id = 0;
    protected String username;
    protected String email;
    protected String password;
    
    public User() {
        this(0, "", "", "");
    }
    
    public User(int user_id, String username, String email, String password) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    protected void setId(int user_id) {
        this.user_id = user_id;
    }
    
    protected void setUsername(String username){
        this.username = username;
    }
    
    protected void setEmail(String email) {
        this.email = email;
    }
    
    protected void setPassword(String password) {
        this.password = password;
    }
    
    protected int getId() {
        return this.user_id;
    }
    
    protected String getUsername() {
        return this.username;
    }
    
    protected String getEmail() {
        return this.email;
    }
    
    protected String getPassword() {
        return this.password;
    }
}
