import java.util.Scanner;

class User {
    static Scanner sc = new Scanner (System.in);
    static String admin, passAdmin, user, passUser;
    static String name, pass;
    public static char choice;
    
    static void setAdmin () {
        System.out.print("Admin: ");
        admin = sc.nextLine();
        System.out.print("Password: ");
        passAdmin = sc.nextLine();
        System.out.println("Admin set\n");
    }

    static void setUser () {
        System.out.print("User: ");
        admin = sc.nextLine();
        System.out.print("Password: ");
        passAdmin = sc.nextLine();
        System.out.println("User set\n");
    }

    static void login () {
        System.out.println(">>> Log in <<<\n");
        System.out.println("> Admin\n> User");

        char c = sc.nextLine().charAt(0);
        if (c=='a') {
            if (User.admin==null){
                System.out.println("\n> Admin not found\nSet Admin");
                User.setAdmin();    
                System.out.println();
                User.login();
            } else {
                System.out.print("\n\nAdmin found\nAdmin: ");
                name = sc.nextLine();
                if (name.equals(User.admin)) {
                    System.out.print("Password: ");
                    pass = sc.nextLine();
                    if (pass.equals(User.passAdmin)) {
                        System.out.println(">>> Administrator <<<");
                        System.out.println("Login successful");
                    }
                } else {
                    System.out.println("Wrong Password");
                }
            }
        } else {
            if (User.admin==null) {
                System.out.println("Admin not found!\nSet Admin");
                User.setAdmin();
                System.err.println();
                User.login();
            } else {
                System.out.print("\n\nAdmin found\nUser: ");
                name = sc.nextLine();
                if (name.equals(User.user)) {
                    System.out.print("Password: ");
                    pass = sc.nextLine();
                    if (pass.equals(User.passUser)) {
                        System.out.println(">>> User <<<");
                        System.out.println("Login successful");
                    }
                } else {
                    System.out.println("Wrong Password");
                }
                



            }
        }

    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name, pass;
        
        User.login();
        
    }
}
