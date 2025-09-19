import java.time.Month;

public class MonthDays {
    public static void main(String[] args) {
        System.out.println("Months and Days (Non-Leap Year):");
        
        // Loop through all months
        for (Month month : Month.values()) {
            // false = not a leap year
            int days = month.length(false);
            System.out.println(month + " : " + days +  " days");
        }
    }
}
