public class ArrayDiff {
    public static void main(String args []){
        int x [] ={5,7,2,4,9};
            for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
            if(x[i]>x[j]){
                int temp=x[i];
                x[i]=x[j];
                x[j]=temp;
                }
            }
        }
    System.out.println("The difference of two elements in the array: " +(x[x.length-1]-x[0]));
    }
}