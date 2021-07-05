// package src.ForEachLoop;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("SIze > ");
        String [] name = new String [sc.nextInt()];

        // Input
        for (int i=0; i<name.length; i++){
            name[i]=sc.next();
        }

        /**
         * --: For Each Loop :--
         */
        for (String n : name){
            System.out.print(n+"\t");
        }

    }
}
