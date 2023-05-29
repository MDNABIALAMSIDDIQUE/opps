package test.com;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuolicateStringWord {

	public static void main(String[] args) {
		String string=" I like you you";
		String sen,res=" ";
		sen=string;
		String allWord[]=sen.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>(Arrays.asList(allWord));
		for (String string2 : set) {
			res=res+string2+" ";
			
		}
		System.out.println(res);
	}
}
