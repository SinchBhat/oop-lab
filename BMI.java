
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.println("Enter height in cm: ");
        double height = sc.nextDouble();
        height /= 100;

        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);

        String interpretation = interpretBMI(bmi);
        System.out.println(interpretation);

        sc.close();
    }

    private static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
