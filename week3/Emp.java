import java.util.Scanner;

public class Emp {
    Scanner sc=new Scanner(System.in);
   
    int empcode=0;
    String empname;
    float basic=0,hra=0,IT=200,PF=0,sal=0,gsal=0;
    Emp()
    {

    }
    Emp(float basic,float hra,float IT,float PF,float sal,float gsal)
    {
        this.basic=basic;
        this.hra=hra;
        this.IT=IT;
        this.PF=PF;
        this.sal=sal;
        this.gsal=gsal;
    }
    float getdata()
    {
        System.out.println("Enter employee Information");
        System.out.println("Employee code pls");
        empcode=sc.nextInt();
        System.out.println("Enter your name:");
        empname=sc.next();
        System.out.println("Enter the basic salary:");
        basic=sc.nextFloat();
        return basic;
    }
    void display()
    {
        System.out.println(empcode+"\n"+empname+"\n"+basic+"\n");
        System.out.println("HRA:"+hra);
        System.out.println("PF:"+PF);
        System.out.println("Gross salary:"+gsal);
        System.out.println("Net salary:"+sal);
    }
    void  calculate(float basic)
    {
    hra=(float)7.5/100*basic;
     PF=(float)12/100*basic;
    gsal=basic+hra;
    sal=gsal-(IT+PF);
    
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of employees:");
    int n = sc.nextInt();
    Emp obj[] = new Emp[n];
     
     for(int i=0;i<n;i++)
     {
        obj[i]=new Emp();
        obj[i].getdata();
        //obj[i].calculate(obj[i].basic);
     }
     
     
    // for(int i=0;i<n;i++)
    // {
        
     //   obj[i].display();
     //}
     System.out.println("Enter the employee code to calulate");
    int code=sc.nextInt();
    boolean found = false;
        for (int i = 0; i < n; i++) {
            if (obj[i].empcode == code) {
                obj[i].calculate(obj[i].basic);
                obj[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found. Please enter a valid employee code.");
        }

        sc.close();
    }
}