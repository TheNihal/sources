class Students { // Class with common properties
    int id;
    float cg;

    /**
     * A Construtor is a special type of method which initializes Objects by passing arguments
     * Construtor don't need to be called like Method
     * Constructor name must be the same to the name of the Class
     * There will be no return type unlike Method, just name.
     * Constructors are of two types --> Default Constructor
     *                               --> Parameterized Constructor
     */

    Students () {
        System.out.println("This is a default cosntructor");
    }

    // Parameterized Constructor creation
    Students (int I, float C) { // Constructor, initializes Objects by passing arguments fot 'id' and 'cg'
        id = I;
        cg = C;
    }

    void displayInfo () { // Method to display output
        System.out.println("ID  : "+id);
        System.out.println("CGPA: "+cg);
        System.out.println("\n");
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        // Object creation of the Dafault Constructor
        Students noStudents = new Students();
        noStudents.displayInfo();

        // Objects initialization of 'Students' class by passing arguments through 'Students' Parameterized Constructor
        Students firstStudents = new Students(534, 3.8f); 
        System.out.println("Parameterized Constructor:");
        firstStudents.displayInfo(); // Calling method

        // Objects initialization of 'Students' class by passing arguments through 'Students' Constructor
        Students seconStudents = new Students(535, 3.5f);
        System.out.println("Parameterized Constructor:");
        seconStudents.displayInfo(); // Calling method


        /**
         * Trying to initialize a constructor which hasn't been created is possible, as comepiler creates a default constructor in silent
         * 
         * Example:
         * Suppoese there are no constructor in 'Students' class, only 'Common properties' & 'displayInfo' method
         * if we try to initialize an Objects just like it is done in line 35, it'll initialize as usual and will result in NULL or '0'
         * when 'displayInfo' method is called.
         */
    }
}
