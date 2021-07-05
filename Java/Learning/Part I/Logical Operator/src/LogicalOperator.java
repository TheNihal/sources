import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char c;

        System.out.print("Enter Character > ");
        c = sc.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='E' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }

        System.out.print("\nInput > ");
        char input = sc.next().charAt(0);

        if(input>='a' && input <='z'){
            System.out.println("Small Letters");
        }
        else if(input>='A' && input<='Z'){
            System.out.println("Captial Letters");
        }
        else if(input!=input/1){
            System.out.println("Special Characters");
        }
        //   else{
                 // System.out.println("Numebrs");
        //   }

    }
    
}
