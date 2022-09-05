import java.util.Scanner;
public class Swap{
public static void main(String []args){
System.out.print("Enter the value of x: ");
Scanner a=new Scanner(System.in);
int x=a.nextInt();
System.out.print("Enter the value of y: ");
Scanner b=new Scanner(System.in);
int y=b.nextInt();
int temp=x;
x=y;
y=temp;
System.out.println("The value of x:" + x);
System.out.println("The value of y:" + y);
}
}


