package CircularLinkedList.RoundRobinSchedular;

public class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void removeProcess(int processId) {
        if (head == null) return;

        Process temp = head;
        Process prev = null;

        do {
            if (temp.processId == processId) {
                if (prev == null) { // Removing the head
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        tail.next = head.next;
                        head = head.next;
                    }
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalProcesses = 0;
        int totalTime = 0;
        Process temp = head;
        do {
            totalProcesses++;
            totalTime += temp.burstTime;
            temp = temp.next;
        } while (temp != head);

        int currentTime = 0;
        while (totalTime > 0) {
            temp = head;
            do {
                if (temp.burstTime > 0) {
                    int executedTime = Math.min(timeQuantum, temp.burstTime);
                    temp.burstTime -= executedTime;
                    currentTime += executedTime;
                    temp.turnAroundTime = currentTime;
                    temp.waitingTime = temp.turnAroundTime - (temp.burstTime + executedTime);

                    totalTime -= executedTime;

                    System.out.println("Executed Process: " + temp.processId + ", Remaining Burst Time: " + temp.burstTime);
                }
                temp = temp.next;
            } while (temp != head);

            System.out.println("Processes after this round:");
            displayProcesses();
        }

        calculateAndDisplayAverageTimes(totalProcesses);
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        do {
            System.out.println(temp);
            temp = temp.next;
        } while (temp != head);
    }

    private void calculateAndDisplayAverageTimes(int totalProcesses) {
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        Process temp = head;
        do {
            totalWaitingTime += temp.waitingTime;
            totalTurnAroundTime += temp.turnAroundTime;
            temp = temp.next;
        } while (temp != head);

        double avgWaitingTime = (double) totalWaitingTime / totalProcesses;
        double avgTurnAroundTime = (double) totalTurnAroundTime / totalProcesses;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }
}
