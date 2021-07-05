import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int fibo, number, sNum=0, dNume=1;

        // User input on the value of number
        System.out.print("Enter the value of number: ");
        number = sc.nextInt();


        // Printing out the first two digit
        System.out.printf("Fibonacci Series of %d >> ",number);
        System.out.printf("%d %d ",sNum,dNume);
        for (int i=3; i<=number; i++) {
            /**
             * fibonacci = sum of previous two digit
             * sum of previous two digit = first digit + second digit
             * That basically means Fibonacci digit is the Third digit of the series
             * This is why For Loop needs to start from '3' in order to maintain the validity of the entered value of 'number'
             * number = 5
             * Fibonacci series = 0 1 1 2 3 --> where 'number = 5'
             * 
             * If we omit out first two digit, 
             * Fibonacci series = 1 2 3 5 8 --> omittig first two digits
             * This is actually the "wrong way" to calculate Fibonacci series
             */
            fibo = sNum+dNume;

            System.out.printf("%d ",fibo);

            sNum = dNume;
            dNume = fibo;
        }
    }
}