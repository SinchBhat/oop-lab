import java.util.Scanner;

    class ok {
    Scanner sc=new Scanner(System.in);
    int item_id;
    String item_name;
    int quantity;
    int unitprice;
    int totalbill;

    void getdata(){
    System.out.println("Enter the item:");
    item_id=sc.nextInt();
    System.out.println("Enter the item_name:");
    item_name=sc.nextLine();
    System.out.println("enter quantity");
    quantity=sc.nextInt();
    System.out.println("Enter the price for 1 unit");
    unitprice=sc.nextInt();
    System.out.println("Enter the totalbill");
    totalbill=sc.nextInt();
    
}
};

class shop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n");
        int n=sc.nextInt();
        ok array[]=new ok[n];
        
        int ch,i=0;
        do{
            System.out.println("Enter your choice:");
            System.out.println("\n1.To enter the details of customers order\n2.0 to exit");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
            for(i=1;i<n;i++)
          {   array[i]=new ok();
            array[i].getdata();
          
            if(array[i].totalbill<500)
            {
              System.out.println("discount is "+"NO DISCOUNT!");
            }
            else if(array[i].totalbill<=1000 && array[i].totalbill>=500)
            {
              System.out.println("Discount is"+"10%");
            }
            else if(array[i].totalbill<=2000 && array[i].totalbill>=2000)
            {
              System.out.println("Discount is 12%");
            }
            else if(array[i].totalbill>2000)
            {
              System.out.println("Discount is 15%");
            }
          }
            break;
            default:
            if(ch==0)
            {
              System.out.println("Invalid!");
              return;
            }
        }
        }while(ch!=0);
        sc.close();


        
        




       

    }
    
}
