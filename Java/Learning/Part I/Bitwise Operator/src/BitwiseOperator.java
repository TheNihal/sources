import java.util.Scanner;

public class BitwiseOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b,c;

        System.out.print("Inut A: ");
        a = sc.nextInt();
        System.out.println("Input B: ");
        b = sc.nextInt();

        /**Bitwise Operators are used to do logical Operations */
        c = a&b; // Bitwise AND 
        /**Only works with binary
         * Converts decials (input) to binary
         * then does the logical add, or, not 
         */

        System.out.println("A & B: "+c);

        c = a|b; // Bitwise OR
        System.out.println("A | B: "+c);

        c = a>>b; // Bitwise SHIFTRIGHT
        System.out.println("A >> B: "+c);

        c = a<<b; // Bitwise SHIFTLEFT
        System.out.println("A << B: "+c);
        
        c = a ^ b; // Bitwise EXOR
        System.out.println("A ^ B: "+c);

    }
}