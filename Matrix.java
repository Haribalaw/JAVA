public class Matrix{
    public static void main(String args []){
        int x [] [] ={{2,2},{3,3}};
        int y [] [] ={{3,3},{2,2}};
        int z [] [] = new int [2] [2];
        int a [] [] ={{1,1,1},{2,2,2},{3,3,3}};
        int b [] [] ={{1,2,3},{4,5,6},{7,8,9}};
        int c [] [] = new int [3] [3];
        System.out.println("Sum of 2x2 matrix :");
        for(int i=0;i<2;i++){
            for( int j=0;j<2;j++){
                z[i][j]=(x[i][j]+y[i][j]);
            System.out.print(z[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println("Sum of 3x3 matrix :");
         for(int i=0;i<3;i++){
            for( int j=0;j<3;j++){
                c[i][j]=(a[i][j]+b[i][j]);
            System.out.print(c[i][j] + " ");
            }
        System.out.println();
        }
    }
}