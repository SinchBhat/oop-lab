import java.util.Scanner;

public class fual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter distance traveled (in kilometers): ");
            double distance = scanner.nextDouble();
            System.out.print("Enter quantity of fuel used (in liters): ");
            double fuelUsed = scanner.nextDouble();
             double avgFuel = distance/fuelUsed;
            System.out.println("Fixed Average Fuel Economy: " + avgFuel + " km/l");
            int choice;

            do {
            System.out.println("Enter your choice:");
            System.out.println("1. Fuel required");
            System.out.println("2. Average distance");
            System.out.println("0. Exit");



            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter fuel quantity for distance estimation in liters: ");
                    double fuelForDistEstimation = scanner.nextDouble();
                    double estimatedDist = fuelForDistEstimation * avgFuel;
                    System.out.println("Estimated distance: " + estimatedDist + " km");
                    break;

                case 2:
                    System.out.print("Enter distance for fuel estimation in kilometers: ");
                    double distFuelEstimation = scanner.nextDouble();
                    double estimatedFuelNeed = distFuelEstimation / avgFuel;
                    System.out.println("Estimated fuel needed: " + estimatedFuelNeed + " liters");
                    break;

                default:
                    System.out.println("exited .");
                    break;
            }

        } while (choice!=0);

        


    }
}
