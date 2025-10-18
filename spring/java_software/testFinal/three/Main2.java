package three;

public class Main2 {
    public static void main(String[] args) {
        DeadlineTask dtask = new DeadlineTask("Assignment", "Submit the assignment", "2025-08-10");
        System.out.println(dtask.getSummary());
        System.out.println("Completed: " + dtask.isCompleted());

        dtask.markComplete();

        System.out.println(dtask.getSummary());
        System.out.println("Completed: " + dtask.isCompleted());
    }
}
