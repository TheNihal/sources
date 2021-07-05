import java.lang.ref.Reference;

public class MathClass{
    public static void main(String[] args) {
        int x=20,y=10;

        System.out.println("MAX 20~10: "+Math.max(x, y));
        System.out.println("MIN 20~10: "+Math.min(x, y));
        int z=-20;
        System.out.println("ABS Z: "+Math.abs(z= -30));
        double p=2, q=3;
        System.out.println("POWER 2^3: "+Math.pow(p, q));
        System.out.println("ROUND 2.7: "+Math.round(2.7) );

        System.out.println("PI: "+Math.PI);
        // System.out.println("");


        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

    }
}