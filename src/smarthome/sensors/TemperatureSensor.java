package smarthome.sensors;

/**
 * TemperatureSensor class (Green Circle with C inside)
 * Regular text for class name
 */
public class TemperatureSensor extends Sensor {
    // Attributes
    private String unit;
    private float minTemp;
    private float maxTemp;
    
    // Methods
    public float readValue() { return 0.0f; }
    public float convertUnit(String unit) { return 0.0f; }
    
    // Override abstract methods from Sensor
    public void calibrate() {}
}
