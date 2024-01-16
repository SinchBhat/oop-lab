package week2;

import java.util.Scanner;

public class uniq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col :");
        int[][] arr1;
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("enter array element :");
        int [][] arr= new int[row][col];

        for( int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("elemets of 2d array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (arr[i] == arr[j])
                break;
                System.out.print(arr[i][j]+" ");
                
            }
                 System.out.println();
        }
        
   

             sc.close();

    }
    


}
