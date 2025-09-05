import java.io.*;

public class Filei{
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        boolean inWord = false;
         int countVowels = 0;
         int countConsonants = 0;

        try {
            FileInputStream fis = new FileInputStream("Fileio.java");
            int ch;
            while ((ch = fis.read()) != -1) {
                charCount++;
                if (ch == '\n') {
                    lineCount++;
                }
                if (ch == ' ') {
                    inWord = false;
                } else {
                    if (!inWord) {
                        wordCount++;
                        inWord = true;
                    }
                }
                if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                    
                    countVowels++;
                }
                else countConsonants++;
            }
            fis.close();
            System.out.println("Total Consonants: " + countConsonants);
            System.out.println("Total Vowels: " + countVowels);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Lines: " + lineCount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}