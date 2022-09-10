public class ReverseArray {
    public static void main(String args []){
        int list [] ={ 1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
        for(int i=list.length-1;i>=0;i--){
            System.out.print(+ list[i] + ",");
        }
        System.out.println();
    }
}

