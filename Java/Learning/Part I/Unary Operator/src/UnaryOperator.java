import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int z = 10;
        
        //Increment
        System.out.println("Increment\n=========\n");

       System.out.print("x input > ");
       x = sc.nextInt();
       System.out.println("x = "+x);
       System.out.println("z = "+z);

       y = x++;
       System.out.println("y = x++ > "+y);
       System.out.println("x = "+x);
       System.out.println("y = x+z > "+(x+z));
       y = x--;
       System.out.println("y = x-- > "+y);
       System.out.println("x = "+ x);
       System.out.println("y = x+z > "+(x+z));

       y = x+z;
       System.out.println("y = x+z > "+y);
      
    }
}

