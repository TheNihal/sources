import java.util.Scanner;

public class ArithmaticOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        num2 = sc.nextFloat();

        System.out.println("\nSummation: "+(num1+num2));
        System.out.println("Substraction: "+(num1-num2));
        System.out.println("Multiplication: "+num1*num2);
        System.out.println("Division: "+num1/num2);
        System.out.println("Modulas: "+num1%num2);
    }

}