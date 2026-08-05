import java.time.LocalDateTime;

public class Task {
    // Attributes
    private String title;
    private String description;
    private boolean isCompleted;
    private boolean isTimed;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false; // Default value when a task is created
    }

    public Task(String title, String description, LocalDateTime startTime, LocalDateTime endTime) {
        this.title = title;
        this.description = description;
        this.isCompleted = false; // Default value when a task is created
        this.startTime = startTime;
        this.endTime = endTime;
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