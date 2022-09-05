import java.util.Scanner;
public class If{
public static void main(String args[]){
System.out.print("Enter your age ");
Scanner a=new Scanner(System.in);
int age=a.nextInt();
if(age>=18){
System.out.println("You are a major");
}
else{
System.out.println("You are a minor");
}
}
}
