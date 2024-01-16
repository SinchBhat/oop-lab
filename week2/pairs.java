package week2;
import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Pairs in the specified format:");
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                    if (i != n - 1 && j != n - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println(" }");
    }
}
