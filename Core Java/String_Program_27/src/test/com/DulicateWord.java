package test.com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DulicateWord {
	public static void main(String[] args) {
		 String string = "nabi nabi alam";

         string = Arrays.stream(string.split("\\s+")).distinct().collect(Collectors.joining(" "));

         System.out.println(string);
	}
}
