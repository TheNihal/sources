class Info { // A class with some common properties
    String name, address, batch;
    int id;
    float cg;

    Info (String N, String A) { // Constructor
        name = N;
        address = A;
    }

    // Another Constructor; Creating multiple Constructor is called Constructor Overloading
    Info (String N, String B, int I, float C) {  // Parameter must be of different numbers or datatypes to overlaod Constructor
        name = N;
        batch = B;
        id = I;
        cg = C;
    }

    void displayInfo () { // Method to display output
        
        /**
         * Checking which Constructor is used
         * If 'batch' has no value (or no input) that basically means first Constructor (with two parameter) is initialized
         * then just print out the 'name' & 'address'
         */
        if (batch==null ) { 
            System.out.println("Name    : "+name);
            System.out.println("Address : "+address);
            System.out.println("\n");
        } else {
            System.out.println("Name   : "+name);
            System.out.println("batch  : "+batch);
            System.out.println("ID     : "+id);
            System.out.println("CGPA   : "+cg);
            System.out.println("\n");
        }
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Info uniInfo = new Info ("City University", "Pantahapath, Dhaka"); // Object initialization
        uniInfo.displayInfo(); // Calling of Method

        Info stuInfo = new Info("Saikat", "52", 534, 3.8f); // Another object initialization
        stuInfo.displayInfo(); // Calling of Method

        Info anotherStuInfo = new Info("Nusrat", "52", 535, 3.5f); // Another object initialization
        anotherStuInfo.displayInfo(); // Calling of Method
    }
}
