package smarthome.sensors;

import smarthome.interfaces.IMonitorable;

/**
 * Sensor abstract class (Blue Circle with A inside)
 * Class name in italic text
 */
public abstract class Sensor implements IMonitorable {
    // Attributes
    protected String sensorId;
    protected String sensorType;
    protected float accuracy;
    
    // Methods
    public abstract float readValue();
    public abstract void calibrate();
    
    // From IMonitorable
    public String getSensorData() { return null; }
    public java.util.Date getLastUpdateTime() { return null; }
}
