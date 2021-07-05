import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String name;
        int id;
        float cg;

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("ID: ");
        id = sc.nextInt();

        System.out.print("CGPA: ");
        cg = sc.nextFloat();

        System.out.println(name+"\n"+id+"\n"+cg);

    }
}
