



import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("India", "China", "Japan", "USA", "Nepal", "New Zealand");

        String longestName = countries.stream()
                .reduce((a, b) -> a.length() > b.length() ? a : b)
                .orElse(null);

        System.out.println("Country with the longest name is : " + longestName);
    }
}
