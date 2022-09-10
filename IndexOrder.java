import java.util.*;
public class IndexOrder{
 public static void main(String args []){
  System.out.print("Enter the number of elements: ");
  Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int a[] =new int[n];
     System.out.print("Enter the elements: ");
    for(int i=0;i<n;i++){
    Scanner y=new Scanner(System.in);
    a[i]=y.nextInt();
    }
    System.out.print("The even index elements are ");
    for(int i=0;i<n;i++){
    if(i%2==0){
    System.out.print(a[i] + ",");
    }
    }
     System.out.println();
    System.out.print("The odd index elements are ");
    for(int i=0;i<n;i++){
    if(i%2!=0){
    System.out.print(a[i] + ",");
    } 
    }
      System.out.println();
    }
    }
   
