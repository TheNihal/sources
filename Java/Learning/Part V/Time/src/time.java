import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class time{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        // Formatting Time
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(time.format(formattedTime));
        

    }
}