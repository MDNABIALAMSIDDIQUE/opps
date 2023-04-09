package number.com;

import java.util.Arrays;

public class OddNumber {
	
	public static void main(String[] args) {
		int[] number= {5,3,6,8,9,10,33};
		Arrays.stream(number).filter(n->n%2 !=0)
		.forEach(System.out::println);
	}

}
