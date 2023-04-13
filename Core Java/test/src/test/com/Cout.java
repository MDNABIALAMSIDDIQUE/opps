package test.com;

import java.util.Scanner;

public class Cout {
	public static void main(String[] args) {
		
		/*private void printOccurences(String str){
		}

		I/P - String str = "aaabbc";
		O/P - a=3,b=2,c=1
		*/
		
		String string = "aaabbc";
		
		for (int i = 0; i < 256; i++) {
			
			int count=0;
			for (int j = 0; j < string.length(); j++) {
				
				if (string.charAt(j)==(char)i) {
					count++;
				}				
			}
			if(count>0) {
				System.out.println("Count  :"+count+"  "+(char)i);
			}
			
		}
	}

}
