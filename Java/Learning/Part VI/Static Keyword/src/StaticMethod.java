import java.util.Scanner;

class Data { 
    static Scanner sc = new Scanner (System.in); // Static Scannner: to take user input for static variables
    static int count = 0, batch; // Static or class variables
    
    int id; // Non-Static or Instance variable

    static void setBatch () { // Static Method: Sets value for static variable 'batch'
        System.out.print("Batch : ");
        batch = sc.nextInt();
    }

    // Non-Static Method can access Static members
    void displayBatch () { // Non-Static method to display the value of static 'batch'
        System.out.printf("\n---- Batch %s ----",batch);
    }

    void setInfo () { // Non-Static method that sets values for Non-Static 'id'
        System.out.print("Enter ID: ");
        id = sc.nextInt();
    }

    void displayInfo () { // Non-Static method that displays values for Non-Static 'id'
        displayBatch();
        System.out.println("\nID\t==> "+id);
    }

    Data () { // Constructor: Increments 'Static' or Class variable 'count' when an Object for the class 'Data' is created
        count++;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        /**
         * Static Methods & Static Variables are nearly identical
         * 
         * Benefits:    >>> Same as Static Variables
         * 
         * Issues:      >>> Can't use Non-Static members:
         *                  Static Methods can't access any Non-Static Variables or Methods.
         *                  BUT,
         *                  Can accesss or use Static members.
         *              
         *              >>> 'This' & 'Super' keyword can not be used in Static Methods.
         * __________________________________________________________________________ 
         * >>> A Non-Static Method can access or use Static members of the class. <<<
         * --------------------------------------------------------------------------
         */


        Data.setBatch(); // Calling Static Method by it's class name instead of creating an Object

        Data student1 = new Data(); // Object created; 'count' increments;
        Data student2 = new Data(); // Object created; 'count' increments;
        Data student3 = new Data(); // Object created; 'count' increments; 
        Data student4 = new Data(); // Object created; 'count' increments; 
        Data student5 = new Data(); // Object created; 'count' increments;

        // Calling Non-Static Method 'setInfo': sets values for Non-static 'id'
        student1.setInfo(); 
        student2.setInfo();
        student3.setInfo();
        student4.setInfo();
        student5.setInfo();

        // Calling Non-Static Method 'displayInfo' to print out result
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();

        System.out.println("\n\nTotal Student: "+Data.count); // Printing out the final value of Static 'count'
    }
}
