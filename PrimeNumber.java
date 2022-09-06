public class PrimeNumber{
public static void main(String[] args){
int a=0,n=0,i=1,j=1;
while(n<25){
j=1;
a=0;
while(j<=i){
if(i%j==0)
a++;
j++;
}
if(a==2)
{
System.out.printf("%d ",i);
n++;  
}
i++;
}
System.out.println();
}
}
