import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//creating the class as SimpleCurrencyConverter
public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        //using hash map for key value pairs.
        Map<String, Double> exchangeRates = new HashMap<>();
        //taking the current exchange rates and storing it in key value pair.
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("INR", 83.289);
        exchangeRates.put("EUR", 0.91);
        exchangeRates.put("GBP", 0.79);
        exchangeRates.put("JPY", 145.34);

        Scanner obj = new Scanner(System.in);
    //Taking input from the user using scanner class 
        System.out.println("Enter the amount: ");
        double amount = obj.nextDouble();

        System.out.print("Enter the source currency (Options: INR,USD,EUR,GBP,JPY): ");
        String sourceCurrency = obj.next().toUpperCase();

        System.out.print("Enter the target currency (Options: INR,USD,EUR,GBP,JPY): ");
        String targetCurrency = obj.next().toUpperCase();
        //checking the conditions 
        if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double sourceRate = exchangeRates.get(sourceCurrency);
            double targetRate = exchangeRates.get(targetCurrency);
          //calculating the amount according to the exchanges rates
            double convertedAmount = (amount / sourceRate) * targetRate;
            System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Currency not found in exchange rates.");
        }
    }
}
