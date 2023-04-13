package test.com;

import java.util.HashMap;
import java.util.Map;

public class MapCount {
	public static void main(String[] args) {
		/*
		I/P - String str = "aaabbc";
		O/P - a=3,b=2,c=1
		*/
		
		String string="aaabbc";
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
