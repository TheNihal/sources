public class stringBuilder {
    public static void main(String[] args) {
        
        /**
         * 1.String Buffer is less efficient and slower than String Builder.
         * 2.StringBuffer is synchronized thread safe. It means two threads can't call the methods of StringBuffer simultaneously.


         * String Builder is more efficient and faster than String Buffer.
         * StringBuilder is non-synchronized. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
         */

         System.out.println("StringBuilder is almost same as StringBuffer\n");
         
    }
}
