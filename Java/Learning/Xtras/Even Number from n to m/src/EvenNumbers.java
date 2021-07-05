import java.util.Scanner;

public class EvenNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        

        // Input starting and ending numbers
        System.out.print("Enter Starting number : ");
        int startNum = sc.nextInt();
        System.out.print("Enter Ending number : ");
        int endNum = sc.nextInt();

        System.out.printf("Even numbers from %d to %d : ",startNum,endNum);
        for(int i=startNum; i<=endNum; i++){
            if(i%2==0){ // condition to check if the number is Even or not
                System.out.printf(" %d",i);
            }
        }
        sc.close();
    }
}