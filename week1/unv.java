public class unv {  

    public static void main(String[] args) {
        System.out.println("Tuition for a university is Rs 50,000 this year and increases 5% every year.");

        double initialFee = 50000; 
        double annualIncreasePercentage = 0.05;

        for (int year = 1; year <= 10; year++) {
            double feeAfterIncrease = initialFee * (1 + annualIncreasePercentage * year);  
            System.out.println("The fee after " + year + " year = Rs " + feeAfterIncrease);
        }
    }
}
