package week2;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int row=0;
        int colm=0;
        System.out.println("enter no of rows and col :");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];
        for ( i = 0; i < rows; i++) {
            for ( j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("elemets of arr are :");
        for ( i = 0; i < rows; i++) {
            for ( j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //largest in array
        int largest = arr[0][0];
        for ( i = 0; i < rows; i++) {
            for ( j = 0; j < col; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    row =i;
                    colm =j;
                }
            }
        }
         //largest in array
        int smallest = arr[0][0];
        for ( i = 0; i < rows; i++) {
            for ( j = 0; j < col; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                    row =i;
                    colm =j;
                }
            }
        }   



        System.out.println("largest in array: " + largest+ "location +("+row+","+colm+")");
        System.out.println("smallest in array: " + smallest + "location +("+row+","+colm+")");
    }
}

