import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x, y;
        
        System.out.print("x input > ");
        x = sc.nextInt();
        System.out.print("y input > ");
        y = sc.nextInt();

        System.out.printf("x==y > %b\n", x==y);
        System.out.printf("x>y > %b\n", x>y);
        System.out.printf("x<y > %b\n", x<y);
        System.out.printf("x!=y > %b\n", x!=y);
        System.out.printf("x>=y > %b\n", x>=y);
        System.out.printf("x<=y > %b\n", x<=y);

    }

}
