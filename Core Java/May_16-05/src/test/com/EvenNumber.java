package test.com;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int number[]= {2,4,5,7,8,7,50,334,678};
		Arrays.stream(number).filter(e->e%2 ==0)
		.forEach(System.out::println);
	}
}
