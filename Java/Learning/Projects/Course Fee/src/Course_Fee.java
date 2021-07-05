import java.io.IOException;
import java.util.Scanner;

class Info {
    Scanner sc = new Scanner(System.in);
    float feeCredit, numCredit, discount, waiver, total, fee;
    char choice, stage;

    void setCredit () {
        System.out.println("[Credit Info] - Discount - Waiver - Total Amount\n");
        System.out.print("Fee per Credit : ");
        feeCredit = sc.nextFloat();
        System.out.print("Number of Credit : ");
        numCredit = sc.nextFloat();
    }

    void setDiscount () {
        System.out.println("\nCredit Info - [Discount] - Waiver - Total Amount");
        System.out.print("Discount? [y/N] : ");
        choice = sc.next().charAt(0);
        if (choice=='y') {
            System.err.print("Discount : ");
            discount = sc.nextFloat();
        } else {
            discount = 0;
        }  
    }

    void setWaiver () {
        System.out.println("\nCredit Info - Discount - [Waiver] - Total Amount");
        System.out.print("Waiver? [y/N] : ");
        choice = sc.next().charAt(0);
        if (choice=='y') {
            System.out.print("Waiver : ");
            waiver = sc.nextFloat();
        } else {
            waiver = 0;
        }
    }

    void total () {
        total = (feeCredit*numCredit);
        float free = (total*(discount + waiver))/100;
        fee = (total-free);

        System.out.printf("\n\nAmount to be paid: %.2f\n",fee);
    }

    void clear(){
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}

public class Course_Fee {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        
        Info app = new Info();

        app.setCredit();
        app.clear();
        System.out.println("Credit Set ==> "+(app.feeCredit*app.numCredit));
        
        
        app.setDiscount();
        app.clear();
        System.out.println("Credit Set\t==> "+(app.feeCredit*app.numCredit));
        System.out.println("Discount Set\t==> "+app.discount+"%");
        

        app.setWaiver();
        app.clear();
        System.out.println("Credit Set\t==> "+(app.feeCredit*app.numCredit));
        System.out.println("Discount Set\t==> "+app.discount+"%");
        System.out.println("Waiver Set\t==> "+app.waiver+"%");
        
        app.total(); 

        sc.close();
    }
        
}


