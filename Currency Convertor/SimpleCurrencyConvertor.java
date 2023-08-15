import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("INR", 83.289);
        exchangeRates.put("EUR", 0.91);
        exchangeRates.put("GBP", 0.79);
        exchangeRates.put("JPY", 145.34);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (Options: INR,USD,EUR,GBP,JPY): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (Options: INR,USD,EUR,GBP,JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double sourceRate = exchangeRates.get(sourceCurrency);
            double targetRate = exchangeRates.get(targetCurrency);

            double convertedAmount = (amount / sourceRate) * targetRate;
            System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Currency not found in exchange rates.");
        }
    }
}
