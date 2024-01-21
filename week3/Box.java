import java.util.Scanner;
public class Box {
    Scanner sc=new Scanner(System.in);
    float width=0,height=0,depth=0;
    Box(float width,float height,float depth)
    {
    this.width=width;
    this.height=height;
    this.depth=depth;
    }
    float calculate(float width,float height,float depth)
    {
     float volume=width*height*depth;
     System.out.println("The volume of the Box is "+volume);
     return volume;
    }
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the width:");
     float width=sc.nextFloat();
     System.out.println("Enter the height:");
     float height=sc.nextFloat();
     System.out.println("Enter the depth:");
     float depth=sc.nextFloat();
     Box obj=new Box(width,height,depth);
     obj.calculate(width,height,depth);
     sc.close();
    }
}
