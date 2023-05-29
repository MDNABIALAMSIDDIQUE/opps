package test.com;

import java.util.Arrays;

public class NumberDuluicate {
	public static void main(String[] args) {
		int arr[]= {5,25,6,33,66,9,6};
		int findNumber[]=Arrays.stream(arr).distinct().toArray();
		System.out.println(" Real Number"+Arrays.toString(arr));
		System.out.println(" Remove Dup Number"+Arrays.toString(findNumber));
	}
}
