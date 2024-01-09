import java.util.Scanner;

public class quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a, b, and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        }
        else if (discriminant == 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1: " + r1);
         
        }
        else {
            System.out.println("The roots are complex numbers. No real solutions.");
        }

        sc.close();
    }
}
