package inter.com;

public class ReveresStringWithOutjava8 {
	public static void main(String[] args) {
		
		
		try {
			String string="MD NABI ALAM";
			byte[] strbyte=string.getBytes();
			byte[] res= new byte[strbyte.length];
			for (int i = 0; i < res.length; i++) {
				res[i] = strbyte[strbyte.length-i-1];
			}
			System.out.println(new String(res));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
