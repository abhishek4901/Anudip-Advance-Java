
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double a = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Enter second number: ");
            double b = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.nextLine().trim();

            double result;
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + op);
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: Invalid number entered. Please enter a valid numeric value.");
        } catch (ArithmeticException | IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}