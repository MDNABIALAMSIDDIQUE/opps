package test.com;

import java.util.stream.IntStream;

public class Factorial_Number {
	public static void main(String[] args) {
		
		int n=5;
		int facto = IntStream.rangeClosed(1, n).reduce(1,(a,b)->a*b);
		System.out.println(facto);
	}
}
