import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        // Using method reference instead of lambda to remove duplicates
        List<String> distinctList = inputList.stream()
            .distinct()
            .collect(Collectors.toList());

        System.out.println(distinctList);
    }
}
