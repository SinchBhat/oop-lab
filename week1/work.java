import java.util.Scanner;

public class work {
    
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("number of hours worked :");
        double hrs = sc.nextDouble();
        System.out.println("hourly rate :");
        double hrrate = sc.nextDouble();
        double exceshrs= hrs-40.0;
        sc.close();

        if (hrs < 40){
        double totalpay = hrs*hrrate;
        System.out.println("the total pay" +totalpay);

        }
        else {
        double totalpay =(hrs-exceshrs)*hrrate+((exceshrs*hrrate)*1.5);
        System.out.println("the total pay" +totalpay);
        }
        
    }
}



