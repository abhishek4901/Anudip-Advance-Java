import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

public class IndependenceDayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String input = sc.nextLine();
        LocalDate userDate = LocalDate.parse(input);
        MonthDay userMonthDay = MonthDay.from(userDate);

        // Define Independence Day (15th August)
        MonthDay independenceDay = MonthDay.of(8, 15);

        // Check if the user date is before, on, or after Independence Day
        if (userMonthDay.isBefore(independenceDay)) {
            System.out.println("Independence day is yet to come this year.");
        } else if (userMonthDay.equals(independenceDay)) {
            System.out.println("Today is Independence Day!");
        } else {
            System.out.println("Independence day was already celebrated this year.");
        }

        sc.close();
    }
}
