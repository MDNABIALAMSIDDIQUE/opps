package tex.com;
public class MaxCountChar {
    public static void main(String[] args) {
        String s = "abbbssssssscd";
        char maxChar = ' ';
        int maxCount = 0;
        
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c]++;
            if (charCount[c] > maxCount) {
                maxCount = charCount[c];
                maxChar = c;
            }
        }
        
        System.out.println("The character with the maximum count is: " + maxChar);
        System.out.println("The maximum count is: " + maxCount);
    }
}
