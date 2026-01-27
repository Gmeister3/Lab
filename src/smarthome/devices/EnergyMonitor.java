package smarthome.devices;

/**
 * EnergyMonitor class (Green Circle with C inside)
 * Regular text for class name
 */
public class EnergyMonitor extends SmartDevice {
    // Attributes
    private float totalConsumption;
    private float currentUsage;
    private String period;
    
    // Methods
    public float calculateCost() { return 0.0f; }
    public float getUsageReport() { return 0.0f; }
    public void operate() {}
}
