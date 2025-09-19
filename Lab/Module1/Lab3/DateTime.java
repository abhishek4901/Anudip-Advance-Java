import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        // Create current date-time object
        LocalDateTime now = LocalDateTime.now();

        // Define formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Format the date-time
        String formattedDate = now.format(formatter);

        // Print output
        System.out.println("Current DateTime in dd/MM/yyyy HH:mm:ss format: " + formattedDate);
    }
}
