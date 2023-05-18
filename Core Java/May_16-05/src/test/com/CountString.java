package test.com;

import java.util.HashMap;
import java.util.Map;

public class CountString {
	
	public static void main(String[] args) {
		String string = "Darbhanga";
		char ch;
		Map<Character, Integer> map= new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			ch=string.charAt(i);
			
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
