package test.com;

import java.util.Arrays;

public class RemoveElementNUmber {
	
	public static void main(String[] args) {
		int [] ar= {2,55,2,3,55,65,23,45};
		int[] remove=Arrays.stream(ar).distinct().toArray();
		System.out.println("Ori Element  "+Arrays.toString(ar));
		System.out.println("Without Duli "+Arrays.toString(remove));
	}

}
