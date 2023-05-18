package test.com;

import java.util.Arrays;

public class OddNumber {
	public static void main(String[] args) {
		int number[]= {22,44,3,67,99,55,96,2,0};
		Arrays.stream(number).filter(n->n%2 !=0)
		.forEach(System.out::println);
	}
}
