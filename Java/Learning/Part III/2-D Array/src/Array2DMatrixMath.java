import java.util.Scanner;


public class Array2DMatrixMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int row, col;
        int UpperEle = 0;
        int LowerEle = 0;
        // Input Row & Column
        System.out.print("Input row > ");
        row = sc.nextInt();
        System.out.print("Input col > ");
        col = sc.nextInt();
        
        // Array declaration & initialization
        int [][] array1 = new int [row][col];
        int [][] array2 = new int [row][col];
        // int [][] UpperEle = new int [row][col];
        // int [][] LowerEle = new int [row][col];
        
        /**Input > elements of the Arrays */
        // First Array
        System.out.println("Element of the first array: ");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("[%d][%d] > ",i,j);
                array1[i][j] = sc.nextInt();
            }
        }

        // Second Array
        System.out.println("Element of the second array: ");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("[%d][%d] > ",i,j);
                array2[i][j] = sc.nextInt();
            }
        }

        /**Output > elements of the Arrays */
        System.out.printf("\nTotal Element of each array = %d",(row*col));

        System.out.println("\nFirst Array\n==========");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.printf("%d\t",array1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSecond Array\n===========");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.printf("%d\t",array2[i][j]);
            }
            System.out.println();
        }


        /**Mathematics */
        System.out.println("\npress '1' for summation");
        System.out.println("press '2' for subtraction");
        System.out.println("press '3' for multiplication");
        System.out.println("press '4' for division\n");
        System.out.println("press '5' for sum of diagonal");
        System.out.println("press '6' for sum of upper triangle");
        System.out.println("press '7' for sum of lower triangle");
        System.out.print("Input > ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
            System.out.println("Summation of the arrays >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    System.out.printf("%d\t",(array1[i][j] + array2[i][j]));
                }
                System.out.println();
            }
            break;
            case 2:
            System.out.println("Subtraction of the arrays >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    System.out.printf("%d\t",(array1[i][j] - array2[i][j]));
                }
                System.out.println();
            }
            break;
            case 3:
            System.out.println("Multiplication of the arrays >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    System.out.printf("%d\t",(array1[i][j] * array2[i][j]));
                }
                System.out.println();
            }
            break;
            case 4:
            System.out.println("Division of the arrays >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    System.out.printf("%d\t",(array1[i][j] / array2[i][j]));
                }
                System.out.println();
            }
            break;
            case 5:
            System.out.println("Summation of diagonal elements >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    if (i==j){
                        System.out.printf("%d\t",array1[i][j]+array2[i][j]);
                    }
                }
                System.out.println();
            }
            break;
            case 6:
            System.out.println("Summation of upper triangle >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    if (i<j){
                    UpperEle += array1[i][j];
                    System.out.print("Array 1 > "+UpperEle);

                }
            }
                
            }
            break;
            case 7:
            System.out.println("Summation of lower triangle >> ");
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    if (i>j){
                    LowerEle += array2[i][j];
                    System.out.print("Array2 > "+LowerEle);
                    }
                }
                
            }
            break;
            default:
            System.out.println("INVALID KEY!!\n");
        }

    }
}
