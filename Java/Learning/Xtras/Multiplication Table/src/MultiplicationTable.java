import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char repeat;

        // Using Do-While loop to repeat the program
        do{
            // User input of the number
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            // Calculating the multiplications 
            for (int i=1; i<=10; i++) {
                System.out.printf("%d x %d\t= %d\n",i,num,num*i);
            }

            // Promt whether to repreat
            System.out.print("\nRepeat? [y/N] : ");
            repeat = sc.next().charAt(0); // User input to confirm whether to repeat
            System.out.println();
        } while (repeat=='y'); // Do-While loop condition / Condition to repeat the program
        sc.close();
    }
}
