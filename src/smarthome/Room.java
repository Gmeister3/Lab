package smarthome;

import smarthome.devices.SmartDevice;
import java.util.List;

/**
 * Room class (Green Circle with C inside)
 * Regular text for class name
 */
public class Room {
    // Attributes
    private String roomId;
    private String name;
    private String trigger;
    private List<String> conditions;
    
    // Methods
    public void addDevice(SmartDevice device) {}
    public void removeDevice(SmartDevice device) {}
    public List<SmartDevice> getDevices() { return null; }
    public boolean isEnabled() { return false; }
    public void execute() {}
    public boolean evaluate() { return false; }
    public void enable() {}
    public void disable() {}
}
