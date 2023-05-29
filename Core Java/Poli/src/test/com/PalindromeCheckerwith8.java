package test.com;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PalindromeCheckerwith8 {
    public static void main(String[] args) {
        String input = "madam"; // Change this to test different strings

        Predicate<String> isPalindrome = str -> {
            int length = str.length();
            return IntStream.range(0, length / 2)
                    .allMatch(i -> str.charAt(i) == str.charAt(length - 1 - i));
        };

        if (isPalindrome.test(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
