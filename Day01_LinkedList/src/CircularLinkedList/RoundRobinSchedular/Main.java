package CircularLinkedList.RoundRobinSchedular;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 3);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 2);

        System.out.println("Initial Processes:");
        scheduler.displayProcesses();

        System.out.println("\nSimulating Round Robin Scheduling with Time Quantum = 4:");
        scheduler.simulateRoundRobin(4);
    }
}
