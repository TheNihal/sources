import java.util.Scanner;

public class PalindormeNumber {
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
            * adding the value of 'reminder' which is our separeated digit with "reversed * 10" will start to result in the reversed order of 'number'
            * value of "temp = temp /10" will result in as the rest value of 'number' after separating a digit
            * While loop to execute loop until the value of 'temp' is equals to '0'
             */
            while (temp!=0) {
                int reminder = temp%10; // 'reminder' is the value of each separated digit
                reversed = (reversed*10)+reminder; // addning 'reminder' with "reversed * 10" will result in the reversed form of 'number'
                temp = temp/10; // calculating the value of 'number' after separating digits.
            }

            System.out.println("\nEntered number:\t\t"+number);
            System.out.println("Reversed number:\t"+reversed);

            /**
             * When the value a reversed form of a number is equals to the value of the original number, is called a Palindrome number. 
             */
            if (number==reversed) { // Checking whether the values follow the condition of being a Palindrome Number
                System.out.println("\nIt's a palindrome number");
            } else {
                System.out.println("\nIt's not a palindrome number");
            }
            
            // Promt to repeat
            System.out.print("\n\nRepeat? [y/N]: ");
            repeat = sc.next().charAt(0); // User input that defines whether to repeat the program
        } while (repeat=='y');
        sc.close();
    }
}
