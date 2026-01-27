package smarthome.interfaces;

import java.util.Date;

/**
 * Schedule class (Green Circle with C inside)
 * Regular text for class name
 */
public class Schedule {
    // Attributes
    private String scheduleId;
    private Date startTime;
    private Date endTime;
    private String recurrence;
    
    // Getters
    public String getScheduleId() { return scheduleId; }
    public Date getStartTime() { return startTime; }
    public Date getEndTime() { return endTime; }
    public String getRecurrence() { return recurrence; }
    
    // Setters
    public void setScheduleId(String scheduleId) { this.scheduleId = scheduleId; }
    public void setStartTime(Date startTime) { this.startTime = startTime; }
    public void setEndTime(Date endTime) { this.endTime = endTime; }
    public void setRecurrence(String recurrence) { this.recurrence = recurrence; }
    
    // Methods
    public boolean isTimeToExecute() { return false; }
    public void activate() {}
    public void deactivate() {}
}
