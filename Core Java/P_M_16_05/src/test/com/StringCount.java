package test.com;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
	
	public static void main(String[] args) {
		String string="alam nabi alam ";
		Map<Character, Integer> map= new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
		char	ch=string.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
