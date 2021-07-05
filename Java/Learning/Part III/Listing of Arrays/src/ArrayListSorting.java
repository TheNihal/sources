import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements using user input
        for (int i=1; i<=5; i++){
            list.add(sc.nextInt());
        }

        // Printing
        System.out.println("List = "+list);

        /**
         * Sorting an ArrayList
         * Collections.sort
         */
        Collections.sort(list);
        System.out.println("\nSorting in Ascending order\nList = "+list);
        
        // Reverse Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("\nSorting in Descending order\nList = "+list);

    }
}
