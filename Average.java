import java.util.*;
public class Average{
    public static void main(String args []){
    System.out.print("Enter First Number: ");
    Scanner x=new Scanner(System.in);
    int a= x.nextInt();
    System.out.print("Enter Second Number: ");
    Scanner y=new Scanner(System.in);
    int b= y.nextInt();
    System.out.print("Enter Third Number: ");
    Scanner z=new Scanner(System.in);
    int c= z.nextInt();
    System.out.print("The Average Of Three Numbers: ");
        System.out.println((a+b+c)/3);
    }
}
