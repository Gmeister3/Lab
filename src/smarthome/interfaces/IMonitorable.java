package smarthome.interfaces;

/**
 * IMonitorable interface
 * Purple Circle with I inside - Interface name in italic text
 */
public interface IMonitorable {
    String getSensorData();
    java.util.Date getLastUpdateTime();
}
