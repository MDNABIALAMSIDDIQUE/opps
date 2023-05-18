package test.com;

import java.util.HashSet;

public class DuplicateNumber_in_Array {
	
	public static void main(String[] args) {
		int[] numbers= {3,5,6,7,8,8,7,8,7,6,5,5,2,2};

		HashSet<Integer> set= new HashSet<>();
		HashSet<Integer> dupli=new HashSet<>();
		for (int number : numbers) {
			if (! set.add(number)) {
				dupli.add(number);
			}
		}
		System.out.println(dupli);
	}

}
