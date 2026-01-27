package smarthome.sensors;

/**
 * DoorSensor class (Green Circle with C inside)
 * Regular text for class name
 */
public class DoorSensor extends Sensor {
    // Attributes
    private boolean isOpen;
    private String openedTime;
    
    // Methods
    public float readValue() { return 0.0f; }
    public boolean isOpen() { return false; }
    
    // Override abstract methods from Sensor
    public void calibrate() {}
}
