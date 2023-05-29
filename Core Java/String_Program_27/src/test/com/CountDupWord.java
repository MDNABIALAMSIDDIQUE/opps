package test.com;

import java.util.HashMap;

public class CountDupWord {
	public static void main(String[] args) {
		String string=" NABI NABI 2 6 22 2 ALAM";
		String word[]=string.split(" ");
		HashMap<String, Integer> wordCount=new HashMap<>();
		for (String words : word) {
			if (wordCount.containsKey(words)) {
				int counts=wordCount.get(words);
				wordCount.put(words,counts+1);
			}
			else {
				wordCount.put(words, 1);
			}
		}
		for (String words : wordCount.keySet()) {
			int count=wordCount.get(words);
			if (count>1) {
				System.out.println(words+" "+count);
			}
		}
	}

}
