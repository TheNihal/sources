import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input row > ");
        int row = sc.nextInt();
        System.out.print("Input column > ");
        int col = sc.nextInt();
        int [][] array = new int [row][col];

        // Input
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println(array[i][j]+" ");
            }
        }
    }

}
