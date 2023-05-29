package test.com;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringDublicateWord {
	public static void main(String[] args) {
		String string= " I like java Laung java by nabi nabi";
		String sen,result=" ";
		
		String[] allWord=string.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>(Arrays.asList(allWord));
		for (String word : set) {
			result=result+word+" ";
		}
		System.out.println("Remove Duli Words   :\n"+result);
	}
}
