import java.util.Scanner;

public class StringToIntegerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number as a string: ");
            String input = sc.nextLine();

            // Possible NullPointerException if input is null
            // Possible NumberFormatException if input is not a number
            int number = Integer.parseInt(input);

            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer format!");
        } catch (NullPointerException e) {
            System.out.println("Error: Null input received!");
        } finally {
            sc.close();
        }
    }
}
