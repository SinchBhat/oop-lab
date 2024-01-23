import java.util.Scanner;

public class sub_mean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        sc.close();
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=array[i];
        }
        int mean=sum/size;
        System.out.println();
        System.out.println("The mean of the array is:"+mean);

        System.out.println("The result when subtracted by each element of the array is:");
        
        for(int i=0;i<size;i++)
        {
            array[i]=array[i]-mean;
        }
        System.out.println("The elements now are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
