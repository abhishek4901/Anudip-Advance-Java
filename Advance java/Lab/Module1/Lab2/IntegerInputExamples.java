import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: You must enter a valid integer!");
        } 
    }
}
