import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] twoDArray = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (twoDArray[i][j] > maxElement) {
                    maxElement = twoDArray[i][j];
                }
            }
        }

        int[] frequency = new int[maxElement + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                frequency[twoDArray[i][j]]++;
            }
        }

        boolean uniqueFound = false;
        System.out.println("Unique elements in the 2D array: ");
        for (int i = 0; i <= maxElement; i++) {
            if (frequency[i] == 1) {
                System.out.println(i);
                uniqueFound = true;
            }
        }

        if (!uniqueFound) {
            System.out.println("No unique element found.");
        }
        sc.close();
    }
}
