package three;

public class Main1 {
    public static void main(String[] args) {
        Task task = new Task("Report", "Finish the quarterly report");
        System.out.println(task.getSummary());
        System.out.println("Completed: " + task.isCompleted());
    }
}
