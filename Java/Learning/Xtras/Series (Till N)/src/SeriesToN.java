import java.util.Scanner;

public class SeriesToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();

        // 1+2+3+...+n
        System.out.print("\nSeries 1:");
        for(int i=1; i<=N; i++){
            System.out.printf(" %d",i);
        }

        // 1+3+5+...+n
        System.out.print("\nSeries 2:");
        for(int i=1; i<=N; i+=2){
            System.out.printf(" %d",i);
        }

        // 2+4+6+...+n
        System.out.print("\nSeries 3:");
        for(int i=2; i<=N; i+=2){
            System.out.printf(" %d",i);
        }

        // 1^2+2^2+3^2+...+n
        System.out.print("\nSeries 2:");
        for(int i=1; i<=N; i++){
            System.out.printf(" %d",i*i);
        }
    }
}
