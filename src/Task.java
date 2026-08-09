import java.time.LocalDateTime;

public class Task {
    // Attributes
    private String title;
    private String description;
    private boolean isCompleted;
    private boolean isTimed;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long durationHours;

    // Constructor
    public Task(String title, String description, boolean isTimed, long durationHours) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
        this.isTimed = isTimed;
        this.durationHours = durationHours;
    }

    // Starts a timed task by recording the current timestamp
    public void startTask(long durationHours) {
        if (this.isTimed) {
            this.startTime = LocalDateTime.now();
            this.endTime = startTime.plusHours(durationHours);
        } else {
            this.isCompleted = true;
        }
    }

    // Getters and Methods
    public String getTitle() {
        return this.title;
    }
    
    public boolean isCompleted() {
    return this.isCompleted;
    }

    public void completeTask() {
        this.isCompleted = true;
    }
}