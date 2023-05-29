package test.com;

public class SwappingString {
	public static void main(String[] args) {
		
		String string="aaaa",string2="bbbb";
		System.out.println("Before Swapping  :"+string + " :"+string2);
		string=string+string2;
		string2=string.substring(0,string.length()-string2.length());
		string=string.substring(string2.length());
		System.out.println();
		System.out.println("After Swapping String  :"+string +"  : "+string2);
		
		
	}
}
