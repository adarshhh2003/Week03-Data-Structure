package CircularLinkedList.TaskSchedular;

public class Main {
    public static void main(String[] args) {
        TaskSchedular task = new TaskSchedular();

        task.addTaskAtBeginning(1, "Uday", 4, "10/02/2025");
        task.addTaskAtBeginning(2, "Sanjay", 3, "15/02/2025");
        task.addTaskAtBeginning(3, "Mousam", 2, "19/02/2025");
        task.addTaskAtEnd(4, "ritik", 7, "15/02/2025");
        task.addTaskAtPosition(5, 5, "Aryan", 9, "19/02/2025");
        task.removeTaskById(3);
        task.searchTaskByPriority(7);

        task.displayAllTask();
    }
}
