package CircularLinkedList.RoundRobinSchedular;

public class Process {
    int processId;
    int burstTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }

    @Override
    public String toString() {
        return "ProcessID: " + processId + ", BurstTime: " + burstTime + ", Priority: " + priority;
    }
}
