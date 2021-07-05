class Student { // A class which contains 3 common properties (Instance Variable)
    String name;
    int batch;
    float cg;

    // Method to print out results
//  Returntype Name ()
    void print () {
        System.out.println("Name    : "+name);
        System.out.println("Batch   : "+batch);
        System.out.println("CGPA    : "+cg);
    }
}

public class Method {
    public static void main(String[] args) { // Main Method
        Student firstStudent = new Student(); // Object creation 
        Student secondStudent = new Student(); // Another Objetc creation

        // Assigning values to the common properties for the first Object of 'Student' Class
        firstStudent.name = "MD Fahim Abrar Saikat";
        firstStudent.batch = 52;
        firstStudent.cg = 3.8f;

        // Assigning values to the common properties for the second Object of 'Student' Class
        secondStudent.name = "Tonnima Nusrat Setu";
        secondStudent.batch = 53;
        secondStudent.cg = 3.5f;

        // Calling Methods
        firstStudent.print(); // Object name.Method name
        System.out.println();
        secondStudent.print(); // Calling method for the secodn Object


    }
}
