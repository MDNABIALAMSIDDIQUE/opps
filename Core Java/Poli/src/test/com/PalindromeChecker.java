package test.com;

import java.util.function.Predicate;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam"; // Change this to test different strings

        Predicate<String> isPalindrome = str -> {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        };

        if (isPalindrome.test(input)) {
            System.out.println("The string is a palindrome.   "+input);
        } else {
            System.out.println("The string is not a palindrome.  "+input);
        }
    }
}
