import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repeat;

        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            for (int i=2; i<num; i++){
                if (num%i!=0) {
                    System.out.printf("%d is a Prime number\n", num);
                    break;
                }
            }

            System.out.print("Enter Starting number: ");
            int stNum = sc.nextInt();
            System.out.print("Enter Ending number: ");
            int endNum = sc.nextInt();

            for (int i=stNum; i<endNum; i++){
                for (int j=2; j<endNum; j++){
                    if(i%2!=0){
                        System.out.printf("%d ",i);
                        break;
                    }
                }
            }

            System.out.print("\nRepeat? [y/N]: ");
            repeat = sc.next().charAt(0);
        } while (repeat=='y');
        sc.close();
    }
}