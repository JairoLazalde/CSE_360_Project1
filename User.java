package application;

import java.util.ArrayList;


/**
 * The User class represents a user entity in the system.
 * It contains the user's details such as userName, password, and role.
 */
public class User {
    private String userName;
    private String password;
    private String mainRole;
    private ArrayList<String> role;

    // Constructor to initialize a new User object with userName, password, and role.
    public User( String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.mainRole = role;
        this.role = new ArrayList<>();
        this.role.add(role);
    }
    
    // Sets the role of the user.
    public void setRole(String role) {
    	mainRole = role;
    	this.role.add(role);
    }
   
    public String getUserName() { return userName; }
    public String getPassword() { return password; }
    public ArrayList<String> getRoleList() { return role; }
    public String getRole() {return mainRole;}
}
