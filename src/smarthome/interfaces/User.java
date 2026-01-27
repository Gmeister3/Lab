package smarthome.interfaces;

/**
 * User interface
 * Purple Circle with I inside - Interface name in italic text
 */
public interface User {
    // Attributes represented as getter methods
    String getUserId();
    String getUsername();
    String getEmail();
    String getPhoneNumber();
    String getRole();
    
    // Methods
    boolean authenticate();
    void changePassword();
    java.util.List<String> getPermissions();
}
