package three;

public class Main3 {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Task task = new Task("Report", "Finish the quarterly report");
        DeadlineTask dtask = new DeadlineTask("Assignment", "Submit the assignment", "2025-08-10");

        manager.addTask(task);
        manager.addTask(dtask);

        dtask.markComplete();

        manager.showAll();
        System.out.println("Completed tasks: " + manager.countCompleted());
    }
}
