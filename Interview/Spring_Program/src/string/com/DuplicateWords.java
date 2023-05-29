package string.com;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Hello world Hello Java world";

        String[] words = str.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

       
        Arrays.stream(words)
                .forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));

       
        wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}

