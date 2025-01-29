package CircularLinkedList.TaskSchedular;

public class TaskSchedular {
    private Task head;
    private Task currentTask = null;

    public void addTaskAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if(head == null) {
            head = newTask;
            head.next = head;
            return;
        }
        Task current = head;
        while(current.next != head) {
            current = current.next;
        }
        current.next = newTask;
        newTask.next = head;
        head = newTask;
    }

    public void addTaskAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if(head == null) {
            head = newTask;
            head.next = head;
            return;
        }
        Task current = head;
        while(current.next != head) {
            current = current.next;
        }
        current.next = newTask;
        newTask.next = head;

    }

    public void addTaskAtPosition(int position, int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if(position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if(position == 1 || head == null) {
            addTaskAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task temp = head;
        int count = 1;
        while(temp.next != head && count < position-1) {
            temp = temp.next;
            count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    public void removeTaskById(int id) {
        if(head == null) {
            System.out.println("No Tasks available");
            return;
        }

        Task temp = head;
        Task prev = null;
        do {
            if(temp.id == id) {
                if(prev == null) {
                    Task last = head;
                    while(last.next != head) {
                        last = last.next;
                    }
                    if(head == head.next) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                    return;
                }
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        } while(temp != head);
    }

    public void viewCurrentTask() {
        if(currentTask == null) {
            currentTask = head;
            System.out.println("Tasks: " + currentTask.id + ", " + currentTask.name + ", " + currentTask.priority + ", " + currentTask.dueDate);
            return;
        }
    }

    public void moveToNewTask() {
        if(currentTask != null) {
            currentTask = currentTask.next;
        }
    }

    public void displayAllTask() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        Task current = head;

        do{
            System.out.println("Tasks: " + current.id + ", " + current.name + ", " + current.priority + ", " + current.dueDate);
            current = current.next;
        } while(current != head);
    }

    public void searchTaskByPriority(int priority) {
        if(head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task current = head;
        boolean found = false;
        do{
            if(current.priority == priority) {
                System.out.println("Task by priority is : " + current.id + ", " + current.name + ", " + current.priority + ", " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while(current != head);

        if(!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}
