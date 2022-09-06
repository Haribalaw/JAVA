import java.util.*;
public class Arithmetic{
    public static void main(String args []){
     System.out.print("Input 1st integer: ");
       Scanner x=new Scanner(System.in);
         int a=x.nextInt();
     System.out.print("Input 2nd integer: ");
       Scanner y=new Scanner(System.in);
         int b=y.nextInt();
        System.out.println("Sum of two integers: " + (a+b));
        System.out.println("Difference of two integers: " + (a-b));
        System.out.println("Product of two integers: " + (a*b));
        System.out.println("Average of two integers: " + ((a+b)/2));
        System.out.println("Distance of two integers: " + (Math.abs(a-b)));
        System.out.println("Max integer: " + (Math.max(a,b)));
        System.out.println("Min integer: " + (Math.min(a,b)));
    }
}
