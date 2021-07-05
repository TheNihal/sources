import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // int [] array = new int [5]; // Array Declaration and Creatinon
        System.out.print("Enter Array size >  ");
        int [] array1 = new int [sc.nextInt()];

        for (int i=0; i<array1.length; i++){
            // array1[i]=sc.nextInt();
            System.out.printf("Index %d > ",i+1);
            array1[i]=sc.nextInt();
        }
        

        System.out.println("Arary size >> "+array1.length);
        System.out.print("\nArray >> ");
        for (int i=0; i<array1.length; i++){
            // System.out.println(array[i]);
            System.out.print(array1[i]+" ");
        }

        // Summation
        int sum=0;
        for (int i=0; i<array1.length; i++){
            sum+=array1[i];
        }
        System.out.println("\nSummation >> "+sum);

        // Average
        float avg = sum/array1.length;
        System.out.println("Average >> "+avg);

        // Maximum 
        int max = array1[0];
        for (int i=1; i<array1.length; i++){
            if (array1[i]>array1[0]){
                max = array1[i];
            }
        }
        System.out.println("Maximum >> "+max);

        // Minimum 
        int min = array1[0];
        for (int i=1; i<array1.length; i++){
            if (array1[i]<array1[0]){
                min = array1[i];
            }
        }
        System.out.println("Manimum >> "+min);



    }
}
