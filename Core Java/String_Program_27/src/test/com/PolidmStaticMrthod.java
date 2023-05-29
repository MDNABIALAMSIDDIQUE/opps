package test.com;

public class PolidmStaticMrthod {
	public static void main(String[] args) {
		String string="nitin";
		string=string.toLowerCase();
		if (chkpoli(string)) {
			System.out.println("this Polid String : "+string);
		}else {
			System.out.println("this is Not Polid"+string);
		}
		
		
	}
	
	public static boolean chkpoli(String str) {
		int left=0;
		int right=str.length()-1;
		while (left<right) {
			if (str.charAt(left)!=str.charAt(right)) {
				left++;right--;
			}
			
		}
		return true;
	}
}

	