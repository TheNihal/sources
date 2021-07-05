import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char repeat;
        do {
            // User input of the number
            int reversed=0;
            System.out.print("\nEnter a number: ");
            int number = sc.nextInt();
            int temp = number; // Storing the value of 'number' into 'temp' to ensure safety of the original value of 'number' 
            
            /**
            * 'reminder' is the modulas of "temp % 10" which is our each separated digit.
            * adding the *qubic value of 'reminder' which is our separeated digit with 'reversed' 
            * value of "temp = temp /10" will result in as the rest value of 'number' after separating a digit
            * While loop to execute loop until the value of 'temp' is equals to '0'
             */
            while (temp!=0) {
                int reminder = temp%10; // 'reminder' is the value of each separated digit
                /**
                 * Using 'Math' class's 'pow' method to calculate 'reminder' to the power '3'
                 * ^ adding the value with reversed, 
                 * 'reversed' being a int datatypeType casting (int) is used as "Math.pow" is asking double datatype as its parameter (double a, double b)
                 */
                reversed = (int) (reversed+Math.pow(reminder, 3)); 
                temp = temp/10; // calculating the value of 'number' after separating digits.
            }

            System.out.println("\nEntered number:\t\t"+number);
            System.out.println("Reversed number:\t"+reversed);

            /**
             * Armstrong Number: When summation of the qubic value of each digits of a number is equals to the number itself.
             * Example: 153
             * Aemstrong Number of 153 = (1^3 + 5^3 + 3^3)
             *                  => 153 = 153
             */
            if (number==reversed) { // Checking whether the values follow the condition of being a Armstrong number
                System.out.println("\nIt's a Armstrong number");
            } else {
                System.out.println("\nIt's not a Armstrong number");
            }
            
            // Promt to repeat
            System.out.print("\n\nRepeat? [y/N]: ");
            repeat = sc.next().charAt(0); // User input that defines whether to repeat the program
        } while (repeat=='y');
        sc.close();
    }
}