package inter.com;

import java.util.stream.Collectors;

public class ReveresString {
	
	 public static void main(String[] args) {
		 
	        String str = "hello world";
	        String reversed = new StringBuilder(str)
	                .reverse()
	                .chars()
	                .mapToObj(c -> String.valueOf((char)c))
	                .collect(Collectors.joining());
	        System.out.println(reversed);  
		 
		 
		 
	    }

}
