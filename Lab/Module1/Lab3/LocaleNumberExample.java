import java.text.NumberFormat;
import java.util.Locale;

public class LocaleNumberExample {
    public static void main(String[] args) {
        double number = 123456.78;

        // 1. Format using Italian Locale
        Locale italian = Locale.ITALY;
        NumberFormat italianFormat = NumberFormat.getInstance(italian);
        System.out.println("Italian Format: " + italianFormat.format(number));

        // 2. Convert to Korean Currency format
        Locale korea = Locale.KOREA;
        NumberFormat koreanCurrency = NumberFormat.getCurrencyInstance(korea);
        System.out.println("Korean Currency Format: " + koreanCurrency.format(number));
    }
}
