import java.util.Scanner;
public class Nest{
public static void main(String args[]){
System.out.print("Enter your age: ");
Scanner value=new Scanner(System.in);
int age=value.nextInt();
System.out.print("Enter your Weight: ");
Scanner value2=new Scanner(System.in);
int weight=value2.nextInt();
if(age>=18){
if(weight>50){
System.out.println("You are eligible for playing.");
}
}
else{
System.out.println("You are not eligible for playing.");
}
}
}

