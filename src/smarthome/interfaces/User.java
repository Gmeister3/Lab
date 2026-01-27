package smarthome.interfaces;

/**
 * User class
 * Green Circle with C inside - Regular text for class name
 */
public class User {
    // Attributes
    private String userId;
    private String username;
    private String email;
    private String phoneNumber;
    private String role;
    
    // Getters
    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getRole() { return role; }
    
    // Setters
    public void setUserId(String userId) { this.userId = userId; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setRole(String role) { this.role = role; }
    
    // Methods
    public boolean authenticate() { return false; }
    public void changePassword() {}
    public java.util.List<String> getPermissions() { return null; }
}
