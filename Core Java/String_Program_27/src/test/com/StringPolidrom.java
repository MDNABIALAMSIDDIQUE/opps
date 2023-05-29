package test.com;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StringPolidrom {
	public static void main(String[] args) {
		String string="Nitin";
		string=string.toLowerCase();
		Predicate<String> isPolindrom = str ->{
			
			int length=str.length();
			return IntStream.range(0, length/2).allMatch(i->str.charAt(i)==str.charAt(length-1-i));
		};
		if (isPolindrom.test(string)) {
			System.out.println("this is Polidrm   :  "+string);
		}else {
			System.out.println("this is Not Polidrm   :  "+string);
		}
	}
}
