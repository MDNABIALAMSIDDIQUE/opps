package com.count;

public class CharCount {
	
	public static void main(String[] args) {
		String string="hdjdh55";
		
		for (int i = 0; i < 256; i++) {
			
			int count=0;
			for (int j = 0;j < string.length();j++) {
				if (string.charAt(j)==(char)i) {
					count ++;
					
				}
			}
			if (count>0) {
				System.out.println("Count   :  "+count+"  "+(char)i);
			}
		}
	}

}
