import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("Enter the number of strings:");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            stringList.add(scanner.nextLine());
        }

        // Concatenate strings using joining() collector without lambda
        String result = stringList.stream()
            .collect(Collectors.joining());

        System.out.println("Concatenated string:");
        System.out.println(result);

        scanner.close();
    }
}
