package test.com;

import java.util.Arrays;

public class Odd_Number {
	public static void main(String[] args) {
		
		int numbers[]= {2,8,9,5,3,6,4,99,45,0};
		Arrays.stream(numbers).filter(n->n%2!=0).forEach(System.out::println);
	}
}
