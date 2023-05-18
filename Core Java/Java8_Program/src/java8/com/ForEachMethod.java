package java8.com;

import java.util.ArrayList;

public class ForEachMethod {
	public static void main(String[] args) {
		
		System.out.println("forEach Method...");
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(22);
		arrayList.add(66);
		arrayList.add(00);
		arrayList.add(55);
		arrayList.add(99);
		
		System.out.println(arrayList);
		
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		
		
		
	}
	

}
