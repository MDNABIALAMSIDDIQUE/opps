package test.com;

import java.util.Arrays;

public class Even_Number {
	public static void main(String[] args) {
		int number[]= {2,6,3,9,11,22};
		Arrays.stream(number).filter(n->n%2==0)
		.forEach(System.out::println);
	}

}
