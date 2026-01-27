package smarthome.interfaces;

import java.util.Date;

/**
 * Schedule interface (Purple Circle with I inside)
 * Interface name in italic text
 */
public interface Schedule {
    // Attributes represented as getter/setter methods
    String getScheduleId();
    Date getStartTime();
    void setStartTime(Date startTime);
    Date getEndTime();
    void setEndTime(Date endTime);
    String getRecurrence();
    void setRecurrence(String recurrence);
    
    // Methods
    boolean isTimeToExecute();
    void activate();
    void deactivate();
}
