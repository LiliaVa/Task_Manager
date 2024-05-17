public class Task {
    private int taskId;
    private String taskDescription;
    private String taskDueDate;
    private boolean taskCompleted;

    public Task(int taskId, String description, String dueDate) {
        this.taskId = taskId;
        this.taskDescription = description;
        this.taskDueDate = dueDate;
        this.taskCompleted = false;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return taskDescription;
    }

    public String getDueDate() {
        return taskDueDate;
    }

    public boolean isCompleted() {
        return taskCompleted;
    }

    public void setCompleted(boolean completed) {
        this.taskCompleted = completed;
    }
}

