public class WhileLoop {
    public static void main(String[] args) {
        int i = 1; // Initialization must be done before using while block
        while(i<=10){
            System.out.println("WHILE LOOP "+i);
            i++;
        }

        // Odd number between 1 to 100
        while(i<=100){
            System.out.println(i);
            i+=2;
        }
    }
}
