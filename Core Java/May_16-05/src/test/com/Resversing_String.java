package test.com;

public class Resversing_String {
	public static void main(String[] args) {
		
		String revString="Darbhnga";
		byte[] str=revString.getBytes();
		byte[] rev=new byte[str.length];
		for (int i = 0; i < rev.length; i++) {
			rev[i]=str[str.length-i-1];
			
		}
		System.out.println(new String(rev));
	}

}
