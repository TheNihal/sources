import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // User input of any digit
        System.out.print("Enter any digit: ");
        int digit = sc.nextInt();
        int sum=0;
        // Storing the value of digit to a temporary variable
        int temp = digit;

        /**
         * Digits can be seperated by calculating the reminder of the value of 'digit', Since we stored 'digit' to 'temp', we'll work with 'temp'
         * Each reminder will be our seperated digits.
         * Example -->
         * 123 --> actual digit
         * 123/10 = 12 [Division] --> left digit after separation
         * 123%10 = 3 [Modulas] --> separated digit
         * Now, we have to store our division result to another variable so that we can calculate it's reminder and separate another digit
         * Using while loop to execute the loop until the value of 'temp' equals to '0'
         * 
         */

        while (temp!=0) {
            int reminder = temp%10; // Storing modulas into 'reminder' as one of our separated digit that we need to add with 'sum'
            System.out.println("\nSeparated digit: "+reminder);
            sum += reminder; // Adding previously separated value with sum
            temp = temp/10; // Calculating the division value, which will be our next 'temp' digit from which we'll calculate (or separate) rest of the digits
            System.out.println("Digits still need to be separated: "+temp);
        }
        
        System.out.println("\nSum of All the separated digits: "+sum);

        sc.close();
    }
}