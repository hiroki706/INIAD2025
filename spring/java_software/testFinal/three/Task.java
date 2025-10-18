package three;

public class Task {
    protected final String title;
    protected final String note;

    public Task(String title, String note) {
        this.title = title;
        this.note = note;
    }
    public String getSummary() {
        return String.format("%s - %s", title, note);
    }
    public boolean isCompleted() {
        return false;
    }
}
