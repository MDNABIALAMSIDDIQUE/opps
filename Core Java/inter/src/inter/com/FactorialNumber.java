package inter.com;

import java.util.stream.IntStream;


public class FactorialNumber {
	
	
	  public static void main(String[] args) {
	  
	  int n=12; 
	  int facto = IntStream.rangeClosed(1,n)
			  .reduce(1,(a,b) -> a * b);
	  System.out.println(facto );
	  
	  }
	 
	
}

