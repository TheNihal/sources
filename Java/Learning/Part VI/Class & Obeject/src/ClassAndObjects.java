class Student { // A Class which contains some varibles as it's properties
    /**
     * These varibles are called the "Common Properties" of the class 'Student'
     */
    String name;
    int batch;
    float cg;
}

public class ClassAndObjects { // Another class which contains main method
    public static void main(String[] args) {
        Student student1 = new Student(); // Creating an object for the class 'Student' ** 'new' is an operator

        // Assigning values to the common properties by using <object name> (dot operator) <variable name>
        student1.name = "Saikat"; 
        student1.batch = 52;
        student1.cg = 3.7f;

        // Printing out results for the created object
        System.out.println("Student 1:");
        System.out.println("Name: "+student1.name);
        System.out.println("Name: "+student1.batch);
        System.out.println("Name: "+student1.cg);


        // Another Object is created for the class 'Student' as 'student2'
        Student student2 = new Student(); 

        // Assigning values for the objects
        student2.name = "Fahim";
        student2.batch = 52;
        student2.cg = 3.7f;

        // Printing out results
        System.out.println("Student 2:");
        System.out.println("Name: "+student2.name);
        System.out.println("Name: "+student2.batch);
        System.out.println("Name: "+student2.cg);
    }
}
