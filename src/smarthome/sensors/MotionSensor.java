package smarthome.sensors;

/**
 * MotionSensor class (Green Circle with C inside)
 * Regular text for class name
 */
public class MotionSensor extends Sensor {
    // Attributes
    private int sensitivity;
    private float detectionRange;
    private boolean motionDetected;
    
    // Methods
    public float readValue() { return 0.0f; }
    public boolean isMotionDetected() { return false; }
    public void setSensitivity(int level) {}
    
    // Override abstract methods from Sensor
    public void calibrate() {}
}
