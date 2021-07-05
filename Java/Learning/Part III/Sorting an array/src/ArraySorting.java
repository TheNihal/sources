/**
 * Array class must be imported to use it's method
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] array = new int [sc.nextInt()];

        /**
         * Array Input
         */
        for (int i=0; i<array.length; i++){
            System.out.printf("[%d] >> ",i);
            array[i] = sc.nextInt();
        }

        /**
         * Array Sorting by using sort method from Arrays class
         */
        Arrays.sort(array);

        /**
         * output
         * --: Ascending Order :--
         */
        System.out.print("Ascending >> ");
         for (int i=0; i<array.length; i++){
            System.out.print("\t"+array[i]);            
        }

        /**
         * --: Descending Order :--
         */
        System.out.print("\n\nDescending >> ");
        for (int i=array.length-1; i>=0; i--){
            System.out.print("\t"+array[i]);            
        }


        /**
         * String sorting
         */
        String [] name = {"Fahim","Abrar","Saikat"};

        Arrays.sort(name);

        /**
         * output
         * --: Ascending Order :--
         */
        System.out.print("\n\nAscending >> ");
         for (int i=0; i<name.length; i++){
            System.out.print("\t"+name[i]);            
        }

        /**
         * --: Descending Order :--
         */
        System.out.print("\n\nDescending >> ");
        for (int i=name.length-1; i>=0; i--){
            System.out.print("\t"+name[i]);            
        }
    }
}
