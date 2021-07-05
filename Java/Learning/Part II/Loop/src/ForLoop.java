public class ForLoop{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println("This string was printed by using for loop");;
        }

        for(int i=1; i<=20; i++){
            System.out.printf("%d.This string was printed by using for loop\n",i);
        }

        // Reverse for loop
        for(int i=20; i>=1; i--){
            System.out.printf("%d.\nThis string is an example of reversed for loop\n",i);
        }

        // Even numbers between 1 to 100
        for(int i=2; i<=100; i+=2){
            System.out.println(i);
        }
    }
} 