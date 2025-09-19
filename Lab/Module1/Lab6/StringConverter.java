import java.util.Scanner;
import java.util.function.Function;

public class StringConverter {

    public <T> T processString(String input, Function<String, T> processor) {
        return processor.apply(input);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringProcessor sp = new StringProcessor();

        System.out.print("Enter a string: ");
        String originalString = sc.nextLine();

        //  Convert to Uppercase (user string) 
        String upperCaseString = sp.processString(originalString, s -> s.toUpperCase());
        System.out.println("Uppercase: " + upperCaseString);

        //  Convert to Lowercase
        String lowerCaseString = sp.processString(originalString, s -> s.toLowerCase());
        System.out.println("Lowercase: " + lowerCaseString);
  
        //  Reverse the String
        String reversedString = sp.processString(originalString, s -> new StringBuilder(s).reverse().toString());
        System.out.println("Reversed: " + reversedString);
 
    
    }
}
