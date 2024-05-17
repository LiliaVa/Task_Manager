import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\u001B[33m" + "Welcome!! What would you like to do today?");
            System.out.println("\u001B[0m" + "1. Add New Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Delete Task");
            System.out.println("4. View All Tasks");
            System.out.println("5. Generate a Report of Tasks That are Due Today");
            System.out.println("6. Exit");
            System.out.print("\u001B[32m" + "Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("\u001B[0m" + "Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Due Date (YYYY-MM-DD): ");
                    String dueDate = scanner.nextLine();
                    taskManager.addTask(new Task(taskId, description, dueDate));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("\u001B[0m" + "Enter ID of Completed Task: ");
                    int completedTaskId = scanner.nextInt();
                    taskManager.markTaskAsCompleted(completedTaskId);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("\u001B[0m" + "Enter ID of Task you Wish to Delete: ");
                    int deleteTaskId = scanner.nextInt();
                    taskManager.deleteTask(deleteTaskId);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("\u001B[0m");
                    taskManager.showAllTasks();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("\u001B[0m" + "Enter current date (YYYY-MM-DD): ");
                    String currentDate = scanner.nextLine();
                    taskManager.reportTasksDueToday(currentDate);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("\u001B[36m" + "Exiting...");
                    break;
                default:
                    System.out.println("\u001B[36m" + "Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
