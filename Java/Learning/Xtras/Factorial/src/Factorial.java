import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int fact = 1;
        char choice;
        
        // Using Do-While loop in order to repeat the program
        do{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // calculating factorial by multiplying the value of i with fact and storing result in fact
            for (int i=1; i<=num; i++){
                fact *= i;
            }
            System.out.printf("Factorial of %d = %d\n",num,fact);

            // Promt whether to repeat 
            System.out.print("\nRepeat? [y/N] : ");
            choice = sc.next().charAt(0);
        }while (choice=='y'); // Do-while loop condition which decides whether to repeat the program or not
    }
}
