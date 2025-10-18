package three;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showAll() {
        for(Task t: tasks) {
            System.out.println(t.getSummary());
        }
    }
    public int countCompleted() {
        return (int)tasks.stream().filter((t -> t.isCompleted())).count();
    }
}
