package test.com;

public class PalindromeCheckerwithout8 {
    public static void main(String[] args) {
        String input = "madam"; // Change this to test different strings

        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i)  != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome."+input);
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
