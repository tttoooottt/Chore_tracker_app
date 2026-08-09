public class Main {
    public static void main(String[] args) {
        // Create a household
        Household mainHousehold = new Household("Main House");

        // Create a task
        Task dishwashing = new Task("Do the dishes", "Put the tablet in and run Eco mode", false);

        // Add the task to the household list
        mainHousehold.addTask(dishwashing);

        // Complete the task
        dishwashing.completeTask();

        // Print to terminal
        System.out.println("Task: " + dishwashing.getTitle());
        System.out.println("Is completed? " + dishwashing.isCompleted());
    }
}