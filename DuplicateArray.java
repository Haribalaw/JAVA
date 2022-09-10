public class DuplicateArray {
    public static void main(String args []){
        int   ay [] ={1,2,5,5,6,6,7,2};
        System.out.print("The duplicate elements are ");
        for( int i=0;i<ay.length;i++){
            for(int y=i+1;y<ay.length;y++){
              if(ay[i]==ay[y]){
                System.out.print(ay[i]+",");
                     }
            }
        }
        System.out.println();
      }
}

