import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        /**Conditional operator is known as Tarnary operator as well.
         * we can do basic task using this operator if there are 2 variable to compare. like Boolean TRUE or FLASE.
         * 
         * expression1 ? expression2 : expression3
         * 
         * here, ? works as if condition.
         * if expression1 is TRUE, then expression2 will work.
         * Otherwise, if expression1 is FALSE, expression3 will work
         */

         int num1, num2;
         System.out.print("Input 2 numbers > ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // Conditional / Tarnary Operator
        int large = (num1>num2) ? num1 : num2;
        /**if num1 is greater than num2, print num1...otherwise print num2
         * store this data in large.
         */
        
        System.out.println("Large number = "+large);
    }
}
