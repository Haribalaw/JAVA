import java.util.Scanner;
public class Weekdays{
    public static void main(String args []){
    System.out.print("The day is Enter a number : ");
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    switch(n){
        case 1: System.out.println("The day is Monday");
        break;
        case 2: System.out.println("The day is Tuesday");
        break;
        case 3: System.out.println("The day is Wednesday");
        break;
        case 4: System.out.println("The day is Thursday");
        break;
        case 5: System.out.println("The day is Friday");
        break;
        case 6: System.out.println("The day is Saturday");
        break;
        case 7: System.out.println("The day is Sunday");
    }
}
}
