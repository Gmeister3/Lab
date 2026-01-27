package smarthome.interfaces;

/**
 * INetworkEnabled interface
 * Purple Circle with I inside - Interface name in italic text
 */
public interface INetworkEnabled {
    boolean connect();
    void disconnect();
    String getIPAddress();
}
