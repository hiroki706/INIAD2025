package three;

public class DeadlineTask extends Task {
    private final String deadline;
    private boolean completed;
    DeadlineTask(String title, String note, String deadline) {
        super(title, note);
        this.deadline = deadline;
        this.completed = false;
    }

    public void markComplete() {
        this.completed = true;
    }

    @Override
    public String getSummary() {
        if (completed) {
            return String.format("[Completed] %s (by %s): %s", title, deadline, note);
        } else {
            return String.format("%s (by %s): %s", title, deadline, note);
        }
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }
}
