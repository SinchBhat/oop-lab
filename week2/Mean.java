import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int sum = 0;

        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.println("Enter the elements of the array:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("Elements of the array are:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int mean = sum / (rows * col);

        System.out.println("Mean is " + mean);

        // Subtract mean from each element
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] -= mean;
            }
        }

        System.out.println("Array after subtracting mean from each element:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
