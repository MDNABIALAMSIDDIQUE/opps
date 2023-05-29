package tex.com;

public class MaxCharCount {
		public static void main(String[] args) {
			String string = " aaxcdfvghtf..............@ddd@";
			char max=' ';
			int maxCount=0;
			int charCount[] = new int [256];
			for (int i = 0; i < string.length(); i++) {
				char c =string.charAt(i);
				charCount[c]++;
				if (charCount[c] > maxCount) {
					maxCount = charCount[c];
					max=c;
				}
			}
			System.out.println("Char  Max  : "+max);
			System.out.println("Max count   : "+maxCount);
		}
}
