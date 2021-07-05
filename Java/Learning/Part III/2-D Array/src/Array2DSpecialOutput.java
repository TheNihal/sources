import java.util.Scanner;

public class Array2DSpecialOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        /**
         * In java, it's possible to declare only row first, columns can be declarare later
         */

         System.out.println("Enter rown\n>");
         int num = 0;
         int [][] array = new int [5][]; // ROW HAS BEEN DECLARED, BUT NOT COLUMN

        /**
         * Declaring column size for specific rows
         */
        array [0] = new int [1];
        array [1] = new int [2];
        array [2] = new int [3];
        array [3] = new int [4];
        array [4] = new int [5];
        
        /**
         * Array input
         */
        for (int i=0; i<5; i++){
            for (int j=0; j<i+1; j++){ // As the column size has been declared (line 19-23)
                array[i][j] = num;
                num++;

            }
        }

        /**
         * Output
         */
        for (int i=0; i<5; i++){
            for (int j=0; j<i+1; j++){ // As the column size has been declared (line 19-23)
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }
    }
}
