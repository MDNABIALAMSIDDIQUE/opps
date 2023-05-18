package inter.com;

public class FindDulicateWord {
	
	public static void main(String[] args) {
		
		String string = "NABI ALAM Nabi";
		string=string.toUpperCase();
		int Count=0;
		String word[]=string.split(" ");
		
		for (int i = 0; i < word.length; i++) {
			Count=1;
			for (int j = i+1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					Count++;
					word[j]="0";
				}
			}
			
			if (Count >1 && word[i]!="0") {
				System.out.println(word[i]);
			}
			
		}
		
	}
	
}
