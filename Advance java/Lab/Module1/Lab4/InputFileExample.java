import java.io.FileReader;
import java.io.IOException;

public class InputFileExample{
    public static void main(String[] args) {
        // Replace "input.txt" with your input file path
        String filename = "input.txt";
        int charCount = 0;

        try (FileReader fr = new FileReader(filename)) {
            int c;
            while ((c = fr.read()) != -1) {
                // Print character by character
                System.out.print((char) c);
                charCount++;
            }
            System.out.println("\nTotal characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
