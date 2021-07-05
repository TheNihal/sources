import java.nio.file.FileStore;

public class string{
    public static void main(String[] args) {
        
        String s1 = "Saikat";
        String s2 = new String ("Fahim Abrar Saikat"); // ALSO VALID
        String s3 = "saikat";
        String s4 = "";

        System.out.println("String 1 = "+s1);
        System.out.println("String 2 = "+s2);
        System.out.println("String 2 = "+s3);

        /**
         * Useful methods
         */

         // String length
         System.out.println("\nString 1 length = "+s1.length());
         System.out.println("String 1 length = "+s2.length());

         // Checking if multiple string are equal or not
         System.out.println("\nString 2 is equals to String 3 >> "+s2.contains(s3));
         System.out.println("String 1 is equals to String 3 >> "+s1.equals(s2));
         System.out.println("Ignore case  >> "+s1.equalsIgnoreCase(s3));
         
         // Checking in any string contains certain character 
         System.out.println("\nString 2 contains \"Saikat\" >> "+s2.contains("Saikat"));

         // Checking whether a string is empty or not
        System.out.println("\nString 1 empty >> "+s1.isEmpty()); 
        System.out.println("String 2 empty >> "+s2.isEmpty()); 
        System.out.println("String 3 empty >> "+s3.isBlank()); 
        System.out.println("String 4 empty >> "+s4.isBlank()); 

        // String concatination | alternative to stringA + stringB
         String firstName = "Fahim Abrar";
         String lastName = " Saikat";

         System.out.println("\nConcatiated String = "+firstName.concat(lastName));

         // Uppercase & Lowercase
         System.out.println("\nTo upper case > "+firstName.toUpperCase());
         System.out.println("To lower case > "+lastName.toLowerCase());

         // Starts with & ends with
         boolean start = lastName.startsWith(" S");
         System.out.println("\nStarts with ' S' > "+start);
         boolean end = lastName.endsWith("S");
         System.out.println("Starts with 'S' > "+end);

         
    }
}