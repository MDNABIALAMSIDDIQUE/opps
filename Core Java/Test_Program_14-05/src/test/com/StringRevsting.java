package test.com;

public class StringRevsting {
	public static void main(String[] args) {
		
		String revString="NABI ALAM";
		byte[] str=revString.getBytes();
		byte[] res=new byte[str.length];
		for (int i = 0; i < res.length; i++) {
			res[i]=str[str.length-i-1];
			}
		System.out.println(new String(res));
	}
}
