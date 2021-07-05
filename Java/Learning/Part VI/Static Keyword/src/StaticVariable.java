class Info {
    int nonStaticCount = 0; // Non Static or Instance variable
    static int staticCount = 0; // Static or Class variable
    static String uniName = "City University"; // Static or Class variable

    Info () { // Constructor: Increments both Integer variables when an object for the Class 'Info' is created
        nonStaticCount++;
        staticCount++;
    }

    void displayIfo () { // Method to display output
        System.out.println("Non-Static Variable ==> Student = "+nonStaticCount);
        System.out.println("Static Variable ==> Student = "+staticCount);
        System.out.println();
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        /**
         * Static Variable --> used when the value of a class variable remains the same for all the Object i.e. University name
         * 
         * Benefits --> >>> takes up less memory:
         *                  Once used, instead of consuming memory for each Objects, it refers to the value which has been initialized earlier.
         *                  Basically doesn't store values for multiple objects individually
         *              
         *              >>> Direct Usage:
         *                  Can be used in another class without creating any Objects, just by using Class name and dot operator.
         */


        System.out.println(Info.uniName+"\n"); // Printing out the value of Static variable 'uniName' without creating any onject of the Class 'Info'

        // Multiple Objects are created to increment Integer variables
        Info aStudent = new Info(); // Object created; nonStaticCount = 1; StaticCount = 1
        aStudent.displayIfo();

        Info anotherStudent = new Info(); // Object created; nonStaticCount = 1; StaticCount = 2
        anotherStudent.displayIfo();

        Info againAnotherStudent = new Info(); // Object created; nonStaticCount = 1; StaticCount = 3
        againAnotherStudent.displayIfo(); // Calling Method- prints out results
    }
}
