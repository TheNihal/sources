public class wrapperClass {
    public static void main(String[] args) {
        
        /**
         * Wrappper class converts *primitve datatypes to objects.
         * Primitive datatypes are the most used common datatypes i.e. int, float. double, string etc.
         */

        // Converting Primitive datatype to Object
        int i = 534;
        Integer I = Integer.valueOf(i); 
        // <Primitive datatype name starting with UpperClass letter> <wrapper class name> = <datatype starting with UpperClass letter> . valueof(var)

        System.out.println("Primitive  i = "+i);
        System.out.println("Object     I = "+I);
        
         /**AutoBoxing
          * Short method to convert primitive datatypes t object
          */
        int j = 10;
        Integer J = j; // Autoboxing: compiler guessing it's --> Integer.valueof(j)
        System.out.println("\nAutoboxing");
        System.out.println("============");
        System.out.println("Primitive   j = "+j);
        System.out.println("Object      J = "+J);

        
        // Converting Object to Primitive datatype
        
        /**UnBoxing
         * Short method to convert object to primitive datatypes
         */
        Double D = 10.12345677;
        double d = D.doubleValue();
        System.out.println("\nUnboxing");
        System.out.println("==========");
        System.out.println("Object     D = "+D);
        System.out.println("Primitive  d = "+d);
        
    }
}
