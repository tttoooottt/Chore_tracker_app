import java.util.ArrayList;
import java.util.List;

public class Household {
    private String name;
    private List<User> members;
    private List<Task> tasks;

    public Household(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task newTask) {
        this.tasks.add(newTask);
    }

    public List<Task> getTasks() {
        return this.tasks;
    }
}