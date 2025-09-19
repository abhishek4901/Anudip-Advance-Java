import java.io.Console;

public class Example {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available. Run this program in command prompt/terminal.");
            System.exit(1);
        }

        // Read two numbers as strings from console
        String input1 = console.readLine("Enter first number: ");
        String input2 = console.readLine("Enter second number: ");

        // Convert strings to integers
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Add numbers
        int sum = num1 + num2;

        // Print the result
        console.printf("Sum of %d + %d = %d\n", num1, num2, sum);
    }
}
