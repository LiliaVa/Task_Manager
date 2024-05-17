import java.util.*;
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                task.setCompleted(true);
                System.out.println("\u001B[36m" + "Task " + taskId + ": marked as completed!");
            }
        }
    }

    public void deleteTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskId() == taskId) {
                tasks.remove(i);
                System.out.println("\u001B[36m" + "Task " + taskId + ": deleted successfully!");
            }
        }
    }

    public void reportTasksDueToday(String currentDate) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getDueDate().equals(currentDate)) {
                System.out.println("ID: " + task.getTaskId());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Due: " + task.getDueDate());
                System.out.println("Completed: " + task.isCompleted());
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("\u001B[36m" + "No tasks due today! :D");
        }
    }

    public void showAllTasks() {
        for (Task task : tasks) {
            System.out.println("ID: " + task.getTaskId());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Due: " + task.getDueDate());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println();
        }
    }

}
