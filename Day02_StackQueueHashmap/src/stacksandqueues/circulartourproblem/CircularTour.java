package stacksandqueues.circulartourproblem;

public class CircularTour {

    // Function to find the starting point for the circular tour
    public static int getStartPoint(int[] petrol, int[] distance) {
        int totalPetrol = 0, currentPetrol = 0;
        int startPoint = 0;

        // Loop through each petrol pump
        for (int i = 0; i < petrol.length; i++) {
            // Calculate surplus petrol at this pump
            totalPetrol += petrol[i] - distance[i];
            currentPetrol += petrol[i] - distance[i];

            // If currentPetrol is negative, reset the start point
            if (currentPetrol < 0) {
                startPoint = i + 1; // Set the new start point to the next pump
                currentPetrol = 0;  // Reset the current petrol
            }
        }

        // Check if a circular tour is possible
        if (totalPetrol >= 0) {
            return startPoint;
        } else {
            return -1;
        }
    }

}
