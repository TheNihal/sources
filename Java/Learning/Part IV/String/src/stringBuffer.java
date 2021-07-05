public class stringBuffer {
    public static void main(String[] args) {


        StringBuffer strb = new StringBuffer ("Fahim Abrar");
        /**Another method */
        String str = "Fahim Abrar";
        StringBuffer strb2 = new StringBuffer (str);

        System.out.println("StringBuffer = "+strb);
        System.out.println("Another method = "+strb2);
        /**String buffer is dynamic
         * Doesn't need another variable to store changes
         * Example-->
         * String str = "Saikat";
         * str.replace('t', 'T');
         * System.out.println(str); 
         * ..[Saikat]..
         * String anotherStr = str.replace('t', 'T');
         * System.out.println(anotherStr); 
         * ..[SaikaT]..
         */

         // Appending - appends different datatypes as well
         System.out.println("\nAppending > "+strb.append(" Saikat"));
         System.out.println("Appending > "+strb.append("-534"));
         
         System.out.println("\n==>After appending StringBuffer = "+strb);

        // Reverse
        System.out.println("\nReverse > "+strb.reverse());

        // Delete - From index 'n' to Index 'm'
        strb.reverse(); // Undo reverse - line 26
        System.out.println("\nIndex size of StringBuffer = "+strb.length());
        System.out.println("Delete from index '5' to '18' > "+strb.delete(5,18));

        // Setting length
        strb.setLength(5);
        System.out.println("\nLength 5 = "+strb);
    }
}
