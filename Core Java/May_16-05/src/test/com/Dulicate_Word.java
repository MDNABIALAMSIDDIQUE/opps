package test.com;

public class Dulicate_Word {
	public static void main(String[] args) {
		String string=" this Boy So HandSome Boy in in in nabi nabi";
		
		
		String word[]=string.split(" ");
		
		for (int i = 0; i < word.length; i++) {
			
			int count=1;
			 
			for (int j = i+1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
					word[j]="0";
					
				}
			}
			if (count>1 && word[i]!="0") {
				System.out.println(word[i]);
				
			}
		}
		
	}
}
