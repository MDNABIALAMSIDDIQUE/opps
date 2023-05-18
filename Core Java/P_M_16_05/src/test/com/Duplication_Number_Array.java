package test.com;

import java.util.HashSet;

public class Duplication_Number_Array {
	public static void main(String[] args) {
		
		int numbers[]= {1,5,5,99,4,4,7,1,5,3,2,7,2};
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> dulip=new HashSet<>();
		
		for (int number : numbers) {
			if (!set.add(number)) {
				dulip.add(number);
			}
		}
		System.out.println("Duplicat "+dulip);
	}
}
