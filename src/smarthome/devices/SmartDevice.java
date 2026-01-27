package smarthome.devices;

import smarthome.interfaces.*;

/**
 * SmartDevice abstract class (Blue Circle with A inside)
 * Class name in italic text
 */
public abstract class SmartDevice implements INetworkEnabled, IControllable {
    // Attributes
    protected String deviceId;
    protected String name;
    protected String manufacturer;
    protected String powerConsumption;
    protected boolean isOnline;
    
    // Methods
    public abstract void operate();
    public void updateFirmware() {}
    public void reset() {}
    
    // From INetworkEnabled
    public boolean connect() { return false; }
    public void disconnect() {}
    public String getIPAddress() { return null; }
    
    // From IControllable
    public void turnOn() {}
    public void turnOff() {}
    public String getStatus() { return null; }
}
