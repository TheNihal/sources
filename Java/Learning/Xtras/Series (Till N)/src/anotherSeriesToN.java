import java.util.Scanner;

public class anotherSeriesToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=1;
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();

        // 1+2+3+...+n
        System.out.print("\nSeries 1:");
        for(int i=1; i<=N; i++){
            result *=i;
            System.out.printf(" %d",result);
        }

        // 1+3+5+...+n
        result=1;
        System.out.print("\nSeries 2:");
        for(int i=1; i<=N; i+=2){
            result *=i;
            System.out.printf(" %d",result);
        }

        // 2+4+6+...+n
        result=1;
        System.out.print("\nSeries 3:");
        for(int i=2; i<=N; i+=2){
            result *=i;
            System.out.printf(" %d",result);
        }

        
    }
}
