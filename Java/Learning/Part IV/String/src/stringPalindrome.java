public class stringPalindrome {
    public static void main(String[] args) {
        /**String palindrome
         * When a string remains same after reversing to it's mother string
         * Example-->
         * S1 = madam
         * S2 = S1.reverse();
         * ..[madam..]
         * S1 = S2
         */

         String str1 = "madam";
         StringBuffer strb = new StringBuffer(str1);
         System.out.println("First String = "+str1);

        /**StringBuffer can not be stored in String type variables
         * Example
         * String s = strb.reverse() ==> INVALID
         */
        String str2 = strb.reverse().toString(); // Since StringBuffer contains 'reverse' method
        System.out.println("Second String after reversing = "+str2);
        if(str1.equals(str2)){
            System.out.println("\nPalindrome");
        }
        else{
            System.out.println("\nNot Palindrome");
        }



    }
}
