package smarthome;

/**
 * AutomationRule class (Green Circle with C inside)
 * Regular text for class name
 */
public class AutomationRule {
    // Attributes
    private String ruleId;
    private String name;
    private String trigger;
    private java.util.List<String> conditions;
    
    // Methods
    public boolean isEnabled() { return false; }
    public void execute() {}
    public boolean evaluate() { return false; }
    public void enable() {}
    public void disable() {}
}
