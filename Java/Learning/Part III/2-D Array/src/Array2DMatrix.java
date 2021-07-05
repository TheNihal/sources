import java.util.Scanner;

public class Array2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Input row > ");
        int row = sc.nextInt();
        System.out.print("Input column > ");
        int col = sc.nextInt();

        int [][] arr = new int [row][col];


        // Input
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("element [%d][%d] >> ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        // Another array
        int [][] arr2 = new int [row][col];


        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("element [%d][%d] >> ",i,j);
                arr2[i][j] = sc.nextInt();
            }
        }

        // Output
        // Array
        System.out.println("Array 1\n=======");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("\t%d ",arr[i][j]);
            }
            System.out.println();
        }
        
        // Another Array
        System.out.println("Array 2\n=======");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("\t%d ",arr2[i][j]);
            }
            System.out.println();
        }
    }
}
