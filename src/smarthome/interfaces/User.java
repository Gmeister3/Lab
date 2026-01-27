package smarthome.interfaces;

/**
 * User interface
 * Purple Circle with I inside - Interface name in italic text
 */
public interface User {
    // Attributes
    // -userId: String
    // -username: String
    // -email: String
    // -phoneNumber: String
    // -role: UserRole
    
    // Methods
    boolean authenticate();
    void changePassword();
    java.util.List<String> getPermissions();
}
