import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Method 1: Using Math class
        int         demo            = (int)         (Math.random()   *10);
    //  datatype    variable name   = Typecasting   (Class.method()  *'N' where random number 'x' = 0 < x < N )
        System.out.printf("Random Number: %d", demo);
        
        int numbers = (int) (Math.random()*5); // will generate random number from '0' to '4'
        System.out.printf("Random Number: %d", numbers);

        // Method 2: Using Random class
        Random  random  = new Random();
    //  Class   Object  = new Method()
        int anotherNumbers = random.nextInt(10); // Generates random numbers from '0 to 9'
        System.out.println("\nAnother random number: "+anotherNumbers);
        
        int againAnotherNumbers = random.nextInt(10)+1; // Generates random number from '1 to 10'
        System.out.println("Again another random number: "+againAnotherNumbers);


        sc.close();
    }
}