package test.com;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupliacteInString {

	public static void main(String[] args) {
		String inputString = "Hello, how are you? How is everything?";

        Map<Character, Long> mp = inputString.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      
                System.out.println(mp);


	}

}
