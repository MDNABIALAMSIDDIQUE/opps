package test.com;

import java.util.Arrays;

public class Odd_Number {
	public static void main(String[] args) {
		
		int[] number= {2,5,3,6,88,9,4,5};
		Arrays.stream(number).filter(n->n%2!=0)
		.forEach(System.out::println);
	}

}
