import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaArithmeticUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Lambda expressions for arithmetic operations
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divide = (a, b) -> a / b;

        System.out.println("Addition: " + add.apply(num1, num2));
        System.out.println("Subtraction: " + subtract.apply(num1, num2));
        System.out.println("Multiplication: " + multiply.apply(num1, num2));
        System.out.println("Division: " + divide.apply(num1, num2));

        scanner.close();
    }
}
