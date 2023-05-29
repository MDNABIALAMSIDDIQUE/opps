package test;

public class RevString {
		public static void main(String[] args) {
			
			String string= "Program is good good";
			
			String word[] = string.split(" ");
			
			for (int i = 0; i < word.length; i++) {
				int count=1;
				
				for (int j =i+1; j < word.length; j++) {
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
