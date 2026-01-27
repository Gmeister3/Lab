package smarthome.interfaces;

import java.util.Date;

/**
 * Schedule interface (Purple Circle with I inside)
 * Interface name in italic text
 */
public interface Schedule {
    // Attributes (as interface, these would typically be constants or handled via methods)
    // -scheduleId: String
    // -startTime: DateTime
    // -endTime: DateTime
    // -recurrence: Recurrence
    
    // Methods
    boolean isTimeToExecute();
    void activate();
    void deactivate();
}
