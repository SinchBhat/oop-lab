import java.util.Scanner;

public class loan{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the loan period in years: ");
        int loanPeriod = scanner.nextInt();

        // Display header
        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        System.out.println("-------------------------------------------------------");

        // Calculate and display payments for interest rates from 5% to 8% with an increment of 1/8
        for (double interestRate = 5.0; interestRate <= 8.0; interestRate += 0.125) {
            double annualInterestRate = interestRate / 100.0;
            double monthlyInterestRate = annualInterestRate / 12;

            // Calculate monthly payment
            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                                   (1 - Math.pow(1 + monthlyInterestRate, -loanPeriod * 12));

            // Calculate total payment
            double totalPayment = monthlyPayment * loanPeriod * 12;

            // Display results
            System.out.printf("%-20s%-20.2f%-20.2f\n", interestRate + "%", monthlyPayment, totalPayment);
        }

        scanner.close();
    }
}
