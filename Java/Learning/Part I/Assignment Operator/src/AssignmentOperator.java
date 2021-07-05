/**name: Assignment Operator
 * 
 * author: Saikat
 * 
 * date: Feb 21, 12;37 PM
 */

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        /** Assignment Operator = <Arithmatic Operaton>= */

        /**
         * +=
         * -=
         * *-
         * /=
         * %=
         */
        Scanner sc = new Scanner (System.in);

        int x, y, result;

        System.out.println("Enter X\n=> ");
        x = sc.nextInt();
        System.out.println("Enter Y\n=> ");
        y = sc.nextInt();

        System.out.printf("X : %d\nY : %d\n",x,y);

        result = x+y;
        x -= result;
        System.out.printf("X: %d\n",x);

    }
}
