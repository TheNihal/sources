import java.util.Scanner;

class VarTypes {

    /**
     * Instance Variable: VAriables which are declared inside of a class but outside of any Method or Cconstrutor or Block are called "Instance variables".
     * Instance variables must not be declared as Static variables
     * 
     * Static variables are called "Class variables" or "Static Variables"
     * Static variables must not be declared as Local variables.
     */
    int id; // Instance Variable
    static String uniName; // Static / Class variable

    /**
     * Local Variable: The Variable which is declared inside of any Method or Constructor or a Block is called "Local variable".
     */
    VarTypes (String name, int i) { // 'name' & 'i' Local Varible
        uniName = name;
        id = i;
    }
    void displayInfo () {
        System.out.println(uniName);
        System.out.println(id);
    }
}

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter info: ");

        VarTypes info = new VarTypes(sc.nextLine(), sc.nextInt());

        info.displayInfo();
    }
}