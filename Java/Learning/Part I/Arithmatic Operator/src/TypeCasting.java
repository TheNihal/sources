import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("\nSummation: "+(num1+num2));
        System.out.println("Substraction: "+(num1-num2));
        System.out.println("Multiplication: "+num1*num2);
        /**Type Casting
         * Changing datatype of num2 to float from int
         * int n, m, o;
         * int sum = (float) n + m + 0;
         * 
         * "(float) n" changes the datatype of "n" to float temporarily
         */
        System.out.println("Division: "+num1/(float)num2);
        System.out.println("Modulas: "+num1%num2);
    }
}
