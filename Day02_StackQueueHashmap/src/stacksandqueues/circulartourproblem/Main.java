package stacksandqueues.circulartourproblem;

public class Main {

    public static void main(String[] args) {
        // Petrol available at each pump
        int[] petrol = {4, 6, 7, 4};

        // Distance to the next pump from each pump
        int[] distance = {6, 5, 3, 5};

        // Get the starting point for the circular tour
        int start = CircularTour.getStartPoint(petrol, distance);

        if (start == -1) {
            System.out.println("A circular tour is not possible.");
        } else {
            System.out.println("The starting point for the circular tour is pump: " + start);
        }
    }
}


