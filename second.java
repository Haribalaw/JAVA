import java.util.Scanner;
class second
{
public static void main(String args[])
{
System.out.print("Enter the value of x: ");
Scanner value1=new Scanner(System.in);
int x=value1.nextInt();
System.out.print("Enter the value of y: ");
Scanner value2=new Scanner(System.in);
int y=value2.nextInt();
int result1=x+y;
int result2=x-y;
int result3=x/y;
int result4=x%y;
System.out.println("The addition of three numbers is: " + result1);
System.out.println("The subtraction of three numbers is: " + result2 );
System.out.println("The divison of three numbers is: " + result3 );
System.out.println("The modulus of three numbers is: " + result4 );
}
}
