package smarthome.factories;

import smarthome.devices.SmartDevice;
import java.util.HashMap;
import java.util.Map;

/**
 * DeviceFactory static class (Green Circle with C inside)
 * <<static>> precedes the class name in regular text
 */
public class DeviceFactory {
    // Registry to store created devices
    private static final Map<String, SmartDevice> deviceRegistry = new HashMap<>();
    
    // Private constructor to prevent instantiation
    private DeviceFactory() {
        throw new AssertionError("DeviceFactory is a static class and cannot be instantiated");
    }
    
    /**
     * Creates a device of the specified type
     * @param type The type of device to create
     * @return The created SmartDevice instance, or null if type is unknown
     */
    public static SmartDevice createDevice(String type) {
        return null; // Stub implementation as per lab requirements
    }
    
    /**
     * Registers a device in the factory's registry
     * @param device The SmartDevice to register
     */
    public static void registerDevice(SmartDevice device) {
        // Stub implementation as per lab requirements
    }
}
