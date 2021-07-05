class StuInfo {
    static int id;
    /**
     * Static Blocks are used for initializing Classes.
     * Code in a Static Block is executed only once; the first time the Class is loaded into memory.
     * That means, Static Block is executed before the Main Method.
     * EVEN,
     * Static Block is executed before any Constructor of a Class
     */
    StuInfo () {
        System.out.println("Constructor is called");
    }

    static {
        id = 534;
        System.out.println("Static Block is called");
    }

}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(StuInfo.id); 
        /**
         * Output:
         * Static Block is called
         * 534
         * 
         * As Code in Static Block execute before Main Method
         */

        StuInfo test = new StuInfo();
        StuInfo test2 = new StuInfo();
        /**
         * Output:
         * Static Block is called
         * Constructor is called
         * Constructor is called
         * 
         * As Static Block executes before Constructors
         * 
         */


    }
}
