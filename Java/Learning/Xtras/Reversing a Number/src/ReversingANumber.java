import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input of the Number 
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int temp = number;
        int sum=0;
        /**
         * Reminder of 'number' will be the value of separated digit
         * adding those separated digit with 'sum' will result in the sum of all the digits of 'number'
         * But, adding separated digits with the value of "sum*10" will result in the reversed order of 'number'
         * Storing the value of 'number' into 'temp' to calculate safely with stored value without touching actual value 
         * While loop to execute loop untill 'temp' is equal to '0'
         */

        while (temp!=0) {
            int reminder = temp%10; // storing the value of modulas into 'reminder' as the separated digit
            
            sum = (sum*10)+reminder; // storing value of 'temp' in Reverse Order
            temp = temp/10; // Divison result will be the next value of temp from other digits will be separated
            
        }

        System.out.println("\nEntered Number: "+number);
        System.out.println("Reversed value of  Number: "+sum);
        sc.close();
    }
}