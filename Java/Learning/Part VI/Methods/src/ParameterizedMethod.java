import java.util.Scanner;

class Students { // A class with two common properties
    String name;
    int id;
    
    // Type 1: Non-return type method
    void setInfo (String n, int i) { // Pamameterized Method, arguments assigns values for instance variable
        name = n;
        id = i;
    }
    
    void displayInfo () { // Method to display output
        System.out.println("Name    : "+name);
        System.out.println("ID      : "+id);
    }

    // Typr 2: Return type method
    int getNumber (int N) { // takes an Interger as a parameter  and returns 'n*n' for 'n' parameter
        return N*N;
    }


}


public class ParameterizedMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // --> Non return type method
        // Objects creation of 'Students' class 
        Students aStudent = new Students(); 
        Students anotherStudent = new Students();

        // Obejct initialization
        aStudent.setInfo("Saikat", 534); // Calling 'setInfo' method and passing arguments to assign values
        aStudent.displayInfo(); // Calling 'displayInfo' method to display results

        anotherStudent.setInfo("Nusrat", 535);
        anotherStudent.displayInfo();

        // --> Return type method
        Students square = new Students(); // Object creation
        System.out.print("Enter the parameter of return type method: ");
        System.out.println("Square value of return type method = "+square.getNumber(sc.nextInt())); // Taking user input for the parameter

        sc.close();
    }
}
