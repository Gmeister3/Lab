package smarthome.devices;

import smarthome.interfaces.IDeployable;

/**
 * SmartThermostat class (Green Circle with C inside)
 * Regular text for class name
 */
public class SmartThermostat extends SmartDevice implements IDeployable {
    // Attributes
    private float currentTemp;
    private float targetTemp;
    private String schedule;
    
    // Methods
    public void setTemperature(float temp) {}
    public void changeMode(String mode) {}
    public void operate() {}
    
    // From IDeployable
    public void setSchedule(smarthome.interfaces.Schedule schedule) {}
    public void executeSchedule() {}
}
