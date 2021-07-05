public class AnotherString {
    public static void main(String[] args) {
        String st = "Bangladesh is a country";

        System.out.println("String = "+st);

        // Character at 'n' index
        System.out.println("\nCharacter at '0' = "+st.charAt(0));
        System.out.println("Character at '9' = "+st.charAt(9));

        // ASCII value of the character in 'n' index
        System.out.println("\nASCII value of index '0' = "+st.codePointAt(0));
        System.out.println("ASCII value of index '0' = "+st.codePointBefore(10));

        // Index of 'c' character
        System.out.println("\nIndex of 'B' = "+st.indexOf("B"));
        System.out.println("Index of 'n' = "+st.indexOf("n"));
        System.out.println("Index of 'n' from index '0' = "+st.indexOf("n",0));
        System.out.println("Index of 'is' from index '0' = "+st.indexOf("is",0));
        System.out.println("Index of 't' from index '0' = "+st.indexOf('t',0));
        System.out.println("Last index of 'n' from index '0' = "+st.lastIndexOf("n"));
        
        // replacing a character
        System.out.println("\nReplace c with C > "+st.replace('c', 'C'));

        // Replacing a string
        System.out.println("\nReplace 'Bangladesh' with 'America' > "+st.replaceAll("Bangladesh", "America"));
        System.out.println("Replace 'Bangladesh' with 'America' > "+st.replaceFirst("Bangladesh", "America"));
        
        // Spliting a string
        /**Split method split the string into different lines, it returns String datatype */
        String [] stSplit = st.split(" "); // Spliting on space
        for (String str : stSplit){
            System.out.println(str);
        }
    }
}
