package test.com;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input = " Hello   World! ";
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (c != ' ' && c != '\t' && c != '\n' && c != '\r') {
                sb.append(c);
            }
        }

        String output = sb.toString();
        System.out.println("Input String: \"" + input + "\"");
        System.out.println("Output String: \"" + output + "\"");
    }
}

