public class Fibonacci{
    public static void main(String args []){
        int a=1,b=1,c,count=20;
        System.out.print(a + " ");
        for(int i=1;i<count;i++){
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}