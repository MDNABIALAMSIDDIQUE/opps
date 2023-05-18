package test.com;

public class Revering_String {
		public static void main(String[] args) {
			String string ="Darbhnaga";
			byte[] str=string.getBytes();
			byte[] res= new byte[str.length];
			for (int i = 0; i < res.length; i++) {
				res[i]=str[str.length-i-1];
				
			}
			System.out.println(new String(res));
		}
}
