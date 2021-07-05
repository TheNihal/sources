import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date: "+date);
        
        // Formatting Date
        DateFormat format = new SimpleDateFormat("dd/MM/YY");
        System.out.println("\nFormatted Date: "+format.format(date));
    }
}
