import java.util.Scanner;

public class SelectionStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;

        System.out.print("number input > ");
        num = sc.nextInt();

        if(num>0){
            System.out.println("positive\n");
        }
        else if (num==0){
            System.out.println("zero\n");
        }
        else {
            System.out.println("negative");
        }


    }

}
