package smarthome.factories;

import smarthome.devices.SmartDevice;

/**
 * DeviceFactory interface (Purple Circle with I inside)
 * Interface name in italic text
 */
public interface DeviceFactory {
    SmartDevice createDevice(String type);
    void registerDevice(SmartDevice device);
}
