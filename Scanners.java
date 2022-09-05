import java.util.Scanner;
public class Scanners{
    public static void main(String args []){
       System.out.print("Enter First Number: "); 
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       System.out.print("Enter Second Number: "); 
       Scanner z=new Scanner(System.in);
       int y=z.nextInt();
       System.out.println(x+y);
    }
}
