public class BreakContinue{
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i==10){
                continue; // COntinue skips the term defined in the condition, it basically send back comppiler to the looping process
            }
            System.out.println(i); 
        }
        // Continue

        for (int i=1; i<=100; i++){
            if (i==45){
                System.out.println(i);
                break; // Break literally stops the program form being executed further
            }
        }

        System.out.println("Example 1: ");
        for (int i=1; i<=10; i+=3){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Example 2:");

        for(int i=1; i<=100; i=i+3){
            if(i==10){
                continue;
            }
            if(i>13){
                break;
            }
            System.out.println(i);
        }


    }
}